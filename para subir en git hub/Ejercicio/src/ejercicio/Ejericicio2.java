package ejercicio;

import java.util.Scanner;

public class Ejericicio2 {

	public static void main(String[] args) {
		
		int tamano, i;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Numero de alumnos de la clase: ");
		tamano = sc.nextInt();
		
		int [] notas = new int [tamano];
		
		for (i = 0; i < notas.length; i++) {
			System.out.println("Alumno " + (i + 1) + " Nota final: ");
			notas[i] = sc.nextInt();
		}
		
	}
}