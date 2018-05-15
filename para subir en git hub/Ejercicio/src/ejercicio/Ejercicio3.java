package ejercicio;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		int tamano, i;
		Scanner sc = new Scanner(System.in);
		
		//System.out.println("Numero de alumnos de la clase: ");
		tamano = sc.nextInt();
		
		int [] notas = new int [tamano];
		
		for (i = 0; i <= notas.length; i++) {
			
			notas [i]=0;
			//notas [3]=8;
//			System.out.println("la posicion " + i + " tiene cargada la nota " + notas[i]);
		}
		
	}

}
