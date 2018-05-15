package com.utn.modelo;

public class MamiferoClassE1 {
	
	private String raza;
	public String nombre;
	
	public String getRaza() {
		return raza;
		}
	public String getNombre() {
		return nombre;
		}
	public void setNombre(String nombre) {
		this.nombre = nombre;
		}
	public void dormir (double horas) {
		System.out.println("duerme " + horas + " horas");
		}
	public void comer (String[] alimentos) {
		System.out.println("==================INICIO DE LOS ALIMENTOS==================");
		for (int i = 0; i < alimentos.length; i++) {
			System.out.println("hoy comio: " + alimentos[i]);
			}
		System.out.println("==================FIN DE LOS ALIMENTOS==================");
		}
	}	

