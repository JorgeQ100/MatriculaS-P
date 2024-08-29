package com.carro.entities;

public class Vehiculo {
	
	private String Matricula;
	private String fechaActual;

	public String getMatricula() {
		return Matricula;
	}

	public void setMatricula(String matricula) {
		Matricula = matricula;
	}

	public String getFechaActual() {
		return fechaActual;
	}

	public void setFechaActual(String fechaActual) {
		this.fechaActual = fechaActual;
	}

	public Vehiculo(String matricula, String fechaActual) {
		super();
		this.Matricula = matricula;
		this.fechaActual = fechaActual;
	}

	@Override
	public String toString() {
		return "Vehiculo [Matricula=" + Matricula + ", fechaActual=" + fechaActual + "]";
	}

}
