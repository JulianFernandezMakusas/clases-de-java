package com.utn.vista;

public class Persona {
	
	private int dni;
	private String nombre;
	private String apellido;
	public int getDni() {
		return dni;
	}
	public void setDNI(int dni) {
		this.dni = dni;
	}
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
	@Override
	public String toString() {
		return "Datos \n"+"Nombre:" + nombre + "\n" + "Apellido:" + apellido + "\n"+"DNI:"+ dni;
	}
	
	public Persona (int dni, String nombre, String apellido) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	public Persona() {
		
	}
	
}
