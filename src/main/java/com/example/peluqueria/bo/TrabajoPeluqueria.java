package com.example.peluqueria.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TrabajoPeluqueria {
	
	@Id
	@GeneratedValue
	private long id;
	private String nombreTrabajo;
	private Double precio;
	private String descripcion;
	
	public TrabajoPeluqueria(long id, String nombreTrabajo, Double precio, String descripcion) {
		super();
		this.id = id;
		this.nombreTrabajo = nombreTrabajo;
		this.precio = precio;
		this.descripcion = descripcion;
	}
	public TrabajoPeluqueria() {}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombreTrabajo() {
		return nombreTrabajo;
	}

	public void setNombreTrabajo(String nombreTrabajo) {
		this.nombreTrabajo = nombreTrabajo;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
}
