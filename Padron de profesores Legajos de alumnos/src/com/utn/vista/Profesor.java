package com.utn.vista;

public class Profesor extends Persona{
	private int padron;

	public int getPadron() {
		return padron;
	}

	public void setPadron(int padron) {
		this.padron = padron;
	}

	@Override
	public String toString() {
		return "Profesor [padron=" + padron + "]";
	}

	public Profesor(String nombre, String apellido, int dni) {
		super (dni, apellido, nombre);
		this.padron = padron;
	}
	
	
}
