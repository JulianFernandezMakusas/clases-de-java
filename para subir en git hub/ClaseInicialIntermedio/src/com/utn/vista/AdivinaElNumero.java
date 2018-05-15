package com.utn.vista;

import java.util.Scanner;

public class AdivinaElNumero {

	public static void main(String[] args) {
		int numeroRandom = (int) (Math.random()*100+1);
		Scanner lector = new Scanner (System.in);
		int numeroIngresado;
		int intentos = 0;
		boolean jugar = true;
		do {
		try {
		do {
			System.out.println("Ingrese un numero:");
			numeroIngresado = lector.nextInt();
			intentos++;
			if (numeroIngresado > numeroRandom) {
				System.out.println("El numero que ingreso es mayor al numero aleatorio que debe adivinar.\n");
			}if (numeroIngresado < numeroRandom) {
				System.out.println("El numero que ingreso es menor al numero aleatorio que debe adivinar.\n");
			}
		}while (numeroIngresado != numeroRandom);
		}catch (Exception ex) {
			System.out.println("Numeros por favor");
			lector = new Scanner (System.in);
		}
		}while (jugar = true);
		System.out.println("Ganaste e hiciste " + intentos + " intentos");
	}
}