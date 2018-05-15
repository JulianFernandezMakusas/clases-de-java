package com.utn.vista;

import java.util.Scanner;

public class Vista {

	public static void main(String[] args) {
		int pos;
		Scanner lector = new Scanner(System.in);
		int[] DiaDelMes = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		String[] Mes = { "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre",
				"octubre", "noviembre", "diciembre" };
		System.out.println("Ingrese el numero del mes:");
		pos = lector.nextInt();
		if (pos > 12) {
			System.out.println("Error");
		}else {
		System.out.println(Mes[pos - 1]);
		System.out.println(DiaDelMes[pos - 1]);
		}
	}

}
