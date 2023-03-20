package com.example.peluqueria.rest.dto;

import com.example.peluqueria.bo.TrabajoPeluqueria;

public class TrabajoPeluqueriaDto {

	private long id;
	private String nombreTrabajo;
	private Double precio;
	private String descripcion;
	
	
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
	
	public TrabajoPeluqueriaDto(TrabajoPeluqueria trabajo) {
		this.id= trabajo.getId();
		this.nombreTrabajo = trabajo.getNombreTrabajo();
		this.descripcion = trabajo.getDescripcion();
		this.precio = trabajo.getPrecio();
	}
	
	
}
