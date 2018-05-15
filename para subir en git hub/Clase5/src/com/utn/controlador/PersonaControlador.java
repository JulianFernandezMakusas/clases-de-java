package com.utn.controlador;

import com.utn.modelo.Persona;

public class PersonaControlador {
	// daremos vida a la persona

	// metodo que crea a la persona con su comportamiento duro en el codigo o hard
	// code
	public void creoPersona() {

		// creamos una instancia de los objetos de la clase persona
		// el objto de la clase persona se llama per1
		Persona per1 = new Persona();

		per1.nombre = "Sergio";
		per1.apellido = " Goicochea";
		per1.edad = "46";

		per1.cantidadHoras(10);

		System.out.println(per1.imc(80, 1.90));
	}

	public void creoPersonaConAtributos (String nombre, String apellido, String edad, int horas, double peso, double altura) {
		Persona per2 = new Persona () ;
		per2.nombre = nombre;
		per2.apellido = apellido;
		per2.edad = edad;
		per2. cantidadHoras(horas);;
		System.out.println(per2.imc(peso, altura));
		
		
	}

	public void chekeoIMC (double resultado) {
		if (resultado < 16) {
			System.out.println("flaco africano");
		}else if (resultado == 16.0 || resultado < 18.9) {
			System.out.println("flaco normal");
		}else if (resultado == 19 || resultado < 24.99) {
			System.out.println("peso ideal");
		}else if (resultado > 25) {
			System.out.println("gordo nivel anda a la cancha bobo");
		}
	}
	
	public Persona creoObeetoPersona(String nombre, String apellido, String edad, int horas, double peso, double altura){
		
		
		
		Persona p =new Persona();
		p.nombre=nombre;
		p.apellido=apellido;
		p.edad=edad;
		p.cantidadHoras(horas);
		p.imc(peso, altura);
		return p;
	}
 }
