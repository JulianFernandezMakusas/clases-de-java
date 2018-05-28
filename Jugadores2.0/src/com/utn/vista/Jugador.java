package com.utn.vista;

public class Jugador {
	private String nombre;
	private String apellido;
	private int numeroDeCamiseta;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getNumeroDeCamiseta() {
		return numeroDeCamiseta;
	}
	public void setNumeroDeCamiseta(int numeroDeCamiseta) {
		this.numeroDeCamiseta = numeroDeCamiseta;
	}
	@Override
	public String toString() {
		return "Jugador [nombre:" + nombre + "\n" + "apellido: " + apellido;
	}
	public Jugador(String nombre, String apellido, int numeroDeCamiseta) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.numeroDeCamiseta = numeroDeCamiseta;
	}
	
	
}
