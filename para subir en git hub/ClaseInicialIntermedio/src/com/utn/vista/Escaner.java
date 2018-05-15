package com.utn.vista;
import java.util.Scanner;

public class Escaner {

	public static void main(String[] args) {
		boolean x = true;
		String a;
		int b;
		
		Scanner lector = new Scanner (System.in);
	do {
		System.out.println("Ingrese su nombre: ");
		lector.next();
		System.out.println("Ingrese su edad: ");
		lector.nextInt();
		}while(x=true);
	}
}
