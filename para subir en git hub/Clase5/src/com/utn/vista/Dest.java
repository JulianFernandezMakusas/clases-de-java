package com.utn.vista;

import java.util.Locale;
import java.util.Scanner;

import com.utn.controlador.PersonaControlador;

public class Dest {

	public static void main(String[] args) {
		
		PersonaControlador pc = new PersonaControlador(); 
		
		pc.creoPersona();
		pc.creoPersonaConAtributos("francisco", "perala", "38" , 8, 80.0, 1.70);
		
		Scanner input = new Scanner(System.in);
		System.out.println("Ingrese el nombre: ");
		String nombre = input.nextLine();
		System.out.println("Ingrese el apellido; ");
		String apellido = input.nextLine();
		System.out.println("Ingrese la edad en valor numerico: ");
		String edad = input.next();
		System.out.println("Ingrese la cantidad de horas que duerme: ");
		int horas = input.hashCode();
		System.out.println("Ingrese el peso de la persona: ");
		double peso = input.nextDouble();
		System.out.println("Ingrese la altura de la persona: ");
		double altura = input.nextDouble();
		
		pc.creoPersonaConAtributos(nombre, apellido, edad, horas, peso, altura);
		 
	}

}
