package com.utn.modelo;

public class Motor {
	//crear los atributos caballos de fuerza y tipo de combustible
	
	private String tipoDeCombustible;
	private int caballosDeFuerza;
	
	public void setTipoDeCombustible (String tipoDeCombustible) {
		this.tipoDeCombustible = tipoDeCombustible;
	}
	
	public String getTipodeCombustible () {
		return tipoDeCombustible;
	}

	public int getCaballosDeFuerza() {
		return caballosDeFuerza;
	}

	public void setCaballosDeFuerza(int caballosDeFuerza) {
		this.caballosDeFuerza = caballosDeFuerza;
	}

	@Override
	public String toString() {
		return "Motor [Tipo De Combustible=" + tipoDeCombustible + ", Caballos De Fuerza=" + caballosDeFuerza + "]";
	}
	
}
