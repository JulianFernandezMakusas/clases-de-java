package com.utn.vista;

public class Arquero extends Jugador{
	private int atajadas;
	private int golesRecibidos;
	public int getAtajadas() {
		return atajadas;
	}
	public void setAtajadas(int atajadas) {
		this.atajadas = atajadas;
	}
	public int getGolesRecibidos() {
		return golesRecibidos;
	}
	public void setGolesRecibidos(int golesRecibidos) {
		this.golesRecibidos = golesRecibidos;
	}
	@Override
	public String toString() {
		return "Arquero [atajadas=" + atajadas + ", golesRecibidos=" + golesRecibidos + "]";
	}
	public Arquero(String nombre, String apellido, int numeroDeCamiseta, int atajadas, int golesRecibidos) {
		super(nombre,apellido,numeroDeCamiseta);
		this.atajadas = atajadas;
		this.golesRecibidos = golesRecibidos;
	}
	
}
