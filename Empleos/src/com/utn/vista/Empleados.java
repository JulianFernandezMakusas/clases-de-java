package com.utn.vista;

public class Empleados {
	private String nombre;
	private String apellido;
	private int sueldoBasicoMensual;
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
	public int getSueldoBasicoMensual() {
		return sueldoBasicoMensual;
	}
	public void setSueldoBasicoMensual(int sueldoBasicoMensual) {
		this.sueldoBasicoMensual = sueldoBasicoMensual;
	}
	@Override
	public String toString() {
		return "Empleado \nNombre: " + nombre + "\nApellido: " + apellido + "\nSueldo Basico Mensual: " + sueldoBasicoMensual;
	}
	public Empleados(String nombre, String apellido, int sueldoBasicoMensual) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.sueldoBasicoMensual = sueldoBasicoMensual;
	}
	
}
