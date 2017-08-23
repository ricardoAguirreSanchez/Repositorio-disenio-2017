package com.utn.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name ="EMPRESA")
public class Empresa {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@NotNull
	@Column(name = "fecha_creacion")
	private Date fechaCreacion;
	private String nombre;
	@Column(name = "total_pasivo")
	private Double totalPasivo;
	@Column(name = "capital_contable")
	private Double capitalContable;
	@OneToMany(mappedBy = "empresa", cascade = CascadeType.ALL)
	private List<Cuenta> cuentas;
	
	public Double getTotalPasivo() {
		return totalPasivo;
	}
	public void setTotalPasivo(Double totalPasivo) {
		this.totalPasivo = totalPasivo;
	}
	public Double getCapitalContable() {
		return capitalContable;
	}
	public void setCapitalContable(Double capitalContable) {
		this.capitalContable = capitalContable;
	}
	
	
	
	public List<Long> getListaIdCuentas() {
		return null;
	}
	public void setListaIdCuentas(ArrayList<Long> listaNombreCuentas) {

	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
}
