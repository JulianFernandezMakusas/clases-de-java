package com.utn.vista;

public class Docente extends Persona {
	
	private int padron;

	public int getPadron() {
		return padron;
	}

	public void setPadron(int padron) {
		this.padron = padron;
	}

	@Override
	public String toString() {
		return "Docente \nPadron:" + padron + super.toString();
	}
	
	public Docente (int dni, String nombre, String apellido,int padron) {
		super (dni,nombre,apellido);
		this.padron = padron;
	}
}
