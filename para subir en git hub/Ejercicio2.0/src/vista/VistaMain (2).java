package vista;

import java.util.Scanner;

public class VistaMain {

	public static void main(String[] args) {
			Scanner sc = new Scanner (System.in);
			System.out.println("Ingrese cuantos corredores hay: ");
			int cantidad = sc.nextInt();
			System.out.println("Escriba el nombre del corredor: ");
			String corredores = sc.nextLine();
			sc.next();
			System.out.println("Escriba el tiempo que tardo en terminar la carrera: ");
			int tiempo = sc.nextInt();
			
		
	}

}
