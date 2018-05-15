package com.utn.vista;

import com.utn.modelo.Motor;
import com.utn.modelo.VehiCulo;

public class Test {

	public static void main(String[] args) {
		
		VehiCulo v = new VehiCulo ();
		Motor m = new Motor ();
		
		v.setModelo("corolla");
		v.setMarca("Toyota");
		v.setColor("blanco");
		System.out.println(v);
		//te va a imprimir la posicion de la memoria donde esta alojado el objeto
		m.setCaballosDeFuerza(100);
		m.setTipoDeCombustible("gas");
		System.out.println(m);
	}

}
