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
		return "Alumno \nLegajo: " + legajo + super.toString();
	}

	public  Alumno (int dni, String nombre, String apellido, int legajo) {
		super (dni,nombre,apellido);
		this.legajo = legajo;
	}

	
}
