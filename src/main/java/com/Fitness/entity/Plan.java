package com.Fitness.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Planes")
public class Plan {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String nombre;
	private int duracion_meses;
	private int entrenamientos_mes;
	private String categoria;
	private BigDecimal precio;
	private int dias_renovacion;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDuracion_meses() {
		return duracion_meses;
	}

	public void setDuracion_meses(int duracion_meses) {
		this.duracion_meses = duracion_meses;
	}

	public int getEntrenamientos_mes() {
		return entrenamientos_mes;
	}

	public void setEntrenamientos_mes(int entrenamientos_mes) {
		this.entrenamientos_mes = entrenamientos_mes;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public int getDias_renovacion() {
		return dias_renovacion;
	}

	public void setDias_renovacion(int dias_renovacion) {
		this.dias_renovacion = dias_renovacion;
	}

}