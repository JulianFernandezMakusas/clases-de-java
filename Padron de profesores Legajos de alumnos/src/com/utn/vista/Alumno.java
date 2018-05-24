package com.utn.vista;

public class Alumno extends Persona{
	private int legajo;

	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	@Override
	public String toString() {
		return "Alumno [legajo=" + legajo + "]";
	}

	public Alumno(String nombre,String apellido, int dni) {
		super(dni, apellido, nombre);
		this.legajo = legajo;
	}
	
	
}
