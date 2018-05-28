package com.utn.vista;

public class Mediocampista extends Jugador{
	private int pasesBuenos;
	private int pasesMalos;

	public int getPasesBuenos() {
		return pasesBuenos;
	}

	public void setPasesBuenos(int pasesBuenos) {
		this.pasesBuenos = pasesBuenos;
	}

	public int getPasesMalos() {
		return pasesMalos;
	}

	public void setPasesMalos(int pasesMalos) {
		this.pasesMalos = pasesMalos;
	}

	@Override
	public String toString() {
		return "Mediocampista [pasesBuenos=" + pasesBuenos + ", pasesMalos=" + pasesMalos + "]";
	}

	public Mediocampista(String nombre, String apellido, int numeroDeCamiseta, int pasesBuenos, int pasesMalos) {
		super(nombre,apellido,numeroDeCamiseta);
		this.pasesBuenos = pasesBuenos;
		this.pasesMalos = pasesMalos;
	}
}
