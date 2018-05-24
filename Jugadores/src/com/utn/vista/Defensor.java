
package com.utn.vista;

public class Defensor extends Jugador{
	private int recuperos;
	private int pelotasRecibidas;
	public int getRecuperos() {
		return recuperos;
	}
	public void setRecuperos(int recuperos) {
		this.recuperos = recuperos;
	}
	public int getPelotasRecibidas() {
		return pelotasRecibidas;
	}
	public void setPelotasRecibidas(int pelotasRecibidas) {
		this.pelotasRecibidas = pelotasRecibidas;
	}
	@Override
	public String toString() {
		return "Defensor [recuperos=" + recuperos + ", pelotasRecibidas=" + pelotasRecibidas + "]";
	}
	public Defensor(String nombre, String apellido, int numeroDeCamiseta, int pelotasRecibidas, int recuperos) {
		super(nombre,apellido,numeroDeCamiseta);
		this.pelotasRecibidas = pelotasRecibidas;
		this.recuperos = recuperos;
		
	}
}
