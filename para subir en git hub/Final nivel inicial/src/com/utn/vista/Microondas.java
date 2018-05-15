//Julian Fernandez Makusas
//Julian Fernandez Makusas
//Julian Fernandez Makusas
package com.utn.vista;

import java.util.Scanner;

public class Microondas {

	public static void main(String[] args) { // inicio de la aplicacion
		//Tiempo de coccion de la cocina
		int grandeDeMuza = 5;
		int dobleQuesoConJamon = 10;
		int vegetariana = 15;
		// ingredientes de las pizzas
		String grandedemuza = "Mozzarella y tomate.";
		String doblequesoconjamon = "Mozzarella, provolone, tomate y jamon.";
		String laVegetariana = "Acelga, mozzarella, salsa blanca y queso rayado.";
		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese la pizza que desea cocinar : ");
		System.out.println("0) Pizza grande de muzzarella");
		System.out.println("1) Pizza doble queso con jamon");
		System.out.println("2) Pizza vegetariana");
		int pizza = sc.nextInt();
		if (pizza == 0) {
			System.out.println("Pizza grande de muzzarella:");
			System.out.println("Tiempo = " + grandeDeMuza);
			System.out.println("Ingredientes = " + grandedemuza);
		}
		if (pizza == 1) {
			System.out.println("Pizza doble queso con jamon:");
			System.out.println("Tiempo = " + dobleQuesoConJamon);
			System.out.println("Ingredientes = " + doblequesoconjamon);
		}
		if (pizza == 2) {
			System.out.println("Pizza vegetariana:");
			System.out.println("Tiempo = " + vegetariana);
			System.out.println("Ingredientes = " + laVegetariana);
		}
		int[] tiempoPizzas = { grandeDeMuza, dobleQuesoConJamon, vegetariana };
		String[] ingredientesPizzas = { grandedemuza, doblequesoconjamon, laVegetariana };
		for (int i = 0; i < ingredientesPizzas.length; i++) {
		}

	}// fin del main
	

}
