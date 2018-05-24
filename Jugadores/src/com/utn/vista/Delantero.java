package com.utn.vista;

public class Delantero extends Jugador{
	private int golesEchos;
	private int golesErrados;
	public int getGolesEchos() {
		return golesEchos;
	}
	public void setGolesEchos(int golesEchos) {
		this.golesEchos = golesEchos;
	}
	public int getGolesErrados() {
		return golesErrados;
	}
	public void setGolesErrados(int golesErrados) {
		this.golesErrados = golesErrados;
	}
	@Override
	public String toString() {
		return "Delantero [golesEchos=" + golesEchos + ", golesErrados=" + golesErrados + "]";
	}
	public Delantero(String nombre, String apellido, int numeroDeCamiseta, int golesEchos, int golesErrados) {
		super(nombre,apellido,numeroDeCamiseta);
		this.golesEchos = golesEchos;
		this.golesErrados = golesErrados;
	}
}
