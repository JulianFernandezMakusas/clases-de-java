
package com.utn.vista;

public class Defensor extends Jugador{
	private int recuperos;
	private int pelotasPerdidas;
	public int getRecuperos() {
		return recuperos;
	}
	public void setRecuperos(int recuperos) {
		this.recuperos = recuperos;
	}
	public int getPelotasPerdidas() {
		return pelotasPerdidas;
	}
	public void setPelotasPerdidas(int pelotasRecibidas) {
		this.pelotasPerdidas = pelotasRecibidas;
	}
	@Override
	public String toString() {
		return "Defensor [recuperos=" + recuperos + ", pelotasPerdidas=" + pelotasPerdidas + "]";
	}
	public Defensor(String nombre, String apellido, int numeroDeCamiseta, int pelotasPerdidas, int recuperos) {
		super(nombre,apellido,numeroDeCamiseta);
		this.pelotasPerdidas = pelotasPerdidas;
		this.recuperos = recuperos;
		
	}
}
