package com.utn.vista;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {

		double a;
		double b;
		int calculadora;
		double resultado;
		Scanner lector = new Scanner(System.in);
		do {
			System.out.println("Ingrese el numero A:");
			a = lector.nextInt();
			System.out.println("Ingrese el numero B:");
			b = lector.nextInt();
			System.out.println("Ingrese la operacion que desea realizar: \n1) Suma \n2) Resta \n3) Multiplicacion \n4) Division \n5) Salir");
			calculadora = lector.nextInt();
			switch (calculadora) {
			case 1:
				resultado = a + b;
				System.out.println(resultado);
				break;
			case 2:
				resultado = a - b;
				System.out.println(resultado);
				break;
			case 3:
				resultado = a * b;
				System.out.println(resultado);
				break;
			case 4:
				resultado = a / b;
				System.out.println(resultado);

				break;
			case 5:
				
				break;
			default:
				System.out.println("Error, intente otra vez");
			}
		} while (calculadora != 5);
	}
}
