package com.utn.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.time.Year;
import java.util.List;
import java.util.StringJoiner;

@Entity
public class Cuenta {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name = "tipo_cuenta")
	private String tipoCuenta;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "empresa_id", referencedColumnName = "id")
	private Empresa empresa;
	@JsonIgnore
	@OneToMany(mappedBy = "cuenta", cascade = CascadeType.MERGE)
	private List<CuentaValores> cuentaValores;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTipoCuenta() {
		return tipoCuenta;
	}

	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public List<CuentaValores> getCuentaValores() {return cuentaValores;}

	public void setCuentaValores(List<CuentaValores> cuentaValores) {
		this.cuentaValores = cuentaValores;
	}

	@Override
	public String toString() {

		return new StringJoiner(", ", Cuenta.class.getSimpleName() + "{", "}")
				.add("tipoCuenta= " + tipoCuenta)
				.add("empresa= " + empresa)
				.add("cuentaValores= " + cuentaValores)
				.toString();
	}

	public Double totalCostLastYears() {
		return this.cuentaValores.stream().filter(cv -> cv.getFechaFin().getYear() + 10 <= Year.now().getValue())
				.mapToDouble(CuentaValores::getCost).sum();
	}

	public Double totalRoiLastYears() {
		return this.cuentaValores.stream().filter(cv -> cv.getFechaFin().getYear() + 10 <= Year.now().getValue())
				.mapToDouble(CuentaValores::getRoi).sum();
	}
}
