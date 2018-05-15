package com.utn.modelo;

public class HumanoE1 extends MamiferoClassE1 {
	//sobreescribir un metodo para obtener una funcionalidad distinta
	/*
	 * concepto de poliformismo
	 */
	//@override --> hace referencia a que se esta sobreescribiendo el metodo
	public void dormir (double horas) {
		System.out.println("el humano duerme " + horas + " al dia");
	}
}
