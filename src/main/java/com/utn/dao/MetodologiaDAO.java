package com.utn.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.common.collect.Lists;
import com.utn.repositorio.Metodologias;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.utn.model.Metodologia;

@Component
public class MetodologiaDAO {
	private ClassLoader classLoader = getClass().getClassLoader();
	private String fileName = classLoader.getResource("metodologias.json").getFile();
	private Type jsonMetodologiaType = new TypeToken<List<Metodologia>>(){}.getType();
	private Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();

	@Autowired
	private Metodologias metodologias;

	private List<Metodologia> getMetodologiasArchivo()  {
		List<Metodologia> metodologias = new ArrayList<>();
		try {
			JsonReader reader = new JsonReader(new FileReader(fileName));
			metodologias = gson.fromJson(reader, jsonMetodologiaType);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return metodologias;
	}

	public List<Metodologia> getMetodologias() {
		List<Metodologia> metodologias = new ArrayList<>();
		metodologias.addAll(getMetodologiasArchivo());
		metodologias.addAll(getMetodologiasDB());
		return metodologias;
	}
	
	
	public void setMetodologia(Metodologia metodologia){
		metodologias.save(metodologia);
	}

	private List<Metodologia> getMetodologiasDB() {
		return Lists.newArrayList(metodologias.findAll());
	}
}
