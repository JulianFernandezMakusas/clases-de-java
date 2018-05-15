package com.utn.vista;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaArrray {

	public static void main(String[] args) {
		boolean calendario = true;
		Mes enumMes;
		Scanner lector = new Scanner (System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(31);
		list.add(28);
		list.add(31);
		list.add(30);
		list.add(31);
		list.add(30);
		list.add(31);
		list.add(31);
		list.add(30);
		list.add(31);
		list.add(30);
		list.add(31);
		int nMes;
		do {
		System.out.println("Ingrese el numero del mes que desea ver: ");
		nMes = lector.nextInt();
	
		switch (nMes) {
		case 1:
			enumMes = Mes.ENERO;
			System.out.println(enumMes);
			System.out.println(list.get(nMes-1));
			break;
		case 2:
			enumMes = Mes.FEBRERO;
			System.out.println(enumMes);
			System.out.println(list.get(nMes-1));
			break;
		case 3:
			enumMes = Mes.MARZO;
			System.out.println(enumMes);
			System.out.println(list.get(nMes-1));
			break;
		case 4:
			enumMes = Mes.ABRIL;
			System.out.println(enumMes);
			System.out.println(list.get(nMes-1));
			break;
		case 5:
			enumMes = Mes.MAYO;
			System.out.println(enumMes);
			System.out.println(list.get(nMes-1));
			break;
		case 6:
			enumMes = Mes.JUNIO;
			System.out.println(enumMes);
			System.out.println(list.get(nMes-1));
			break;
		case 7:
			enumMes = Mes.JULIO;
			System.out.println(enumMes);
			System.out.println(list.get(nMes-1));
			break;
		case 8:
			enumMes = Mes.AGOSTO;
			System.out.println(enumMes);
			System.out.println(list.get(nMes-1));
			break;
		case 9:
			enumMes = Mes.SEPTIEMBRE;
			System.out.println(enumMes);
			System.out.println(list.get(nMes-1));
			break;
		case 10:
			enumMes = Mes.OCTUBRE;
			System.out.println(enumMes);
			System.out.println(list.get(nMes-1));
			break;
		case 11:
			enumMes = Mes.NOVIEMBRE;
			System.out.println(enumMes);
			System.out.println(list.get(nMes-1));
			break;
		case 12:
			enumMes = Mes.DICIEMBRE;
			System.out.println(enumMes);
			System.out.println(list.get(nMes-1));
			break;
			default:
				if (nMes > 12) {
					System.out.println("error");					
				}
				break;
		}
		}while (calendario = true);
		
	}
	public enum Mes {
		ENERO, FEBRERO, MARZO, ABRIL, MAYO, JUNIO, JULIO, AGOSTO, SEPTIEMBRE, OCTUBRE, NOVIEMBRE, DICIEMBRE
	}

}
