package com.utn.vistaE2;

public abstract class MamiferoClassE2 {
	private String nombre;
	private String raza;
	private String edad;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	//es un metodo definido donde escribimos su implementacion
	public void dormir (double horas) {
		System.out.println("El " + this.getClass().getSimpleName() + " ");
	}

}
