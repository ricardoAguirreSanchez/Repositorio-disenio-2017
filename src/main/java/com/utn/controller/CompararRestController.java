package com.utn.controller;

import com.utn.model.Empresa;
import com.utn.model.Metodologia;
import com.utn.services.MetodologiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;

@RestController
public class CompararRestController {

    @Autowired
    private MetodologiaService metodologiaService;

    @RequestMapping(value= "/realizarComparacion", method= RequestMethod.POST)
    public HashMap<String, Empresa> realizarComparacion(@RequestParam String nombre, @RequestParam ArrayList<String> listaCondiciones){
    	Metodologia metodologia = new Metodologia();
    	metodologia.setNombre(nombre);
    	metodologia.setCondiciones(listaCondiciones);
    	return metodologiaService.realizaComparacion(metodologia);
    }
    
}
