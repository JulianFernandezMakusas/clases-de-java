package com.utn.vista;

import java.util.Scanner;

public class AdivinaElNumeroMultijugadorEnLan {

	public static void main(String[] args) {

		int numeroRandom = (int) (Math.random() * 100 + 1);
		Scanner lector = new Scanner(System.in);
		int numeroIngresado = 0;
		int intentos = 0;
		int numeroDeJugadores;
		boolean jugar = true;
		String nombreDeJugadorUno;
		String nombreDeJugadorDos;

		System.out.println("Ingrese un modo de juego: ");
		System.out.println("1) Modo SinglePlayer");
		System.out.println("2) Modo Duo Play");
		numeroDeJugadores = lector.nextInt();
		do {
			switch (numeroDeJugadores) {
			case 1:
				System.out.println("Ingrese un numero: ");
				numeroIngresado = lector.nextInt();
				if (numeroIngresado > numeroRandom) {
					System.out.println("El numero que ingreso es mayor al numero aleatorio que debe adivinar.\n");
				}
				if (numeroIngresado < numeroRandom) {
					System.out.println("El numero que ingreso es menor al numero aleatorio que debe adivinar.\n");
				}
				if (numeroIngresado == numeroRandom) {
					System.out.println("ganaste");
				}
				break;
			case 2:
				System.out.println("Ingrese el nombre del primer jugador:");
				nombreDeJugadorUno = lector.next();
				System.out.println("Ingrese el nombre del segundo jugador:");
				nombreDeJugadorDos = lector.next();
				
			}
		} while (jugar = true);

	}
}