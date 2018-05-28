package com.utn.vista;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.xml.bind.ParseConversionEvent;

public class Main {

	public static void main(String[] args) {
		// jugador
		String nombre;
		String apellido;
		String numeroDeCamiseta;
		int numeroDeCamiseta2;
		// arquero
		Jugador Arquero = null;
		String atajadas;
		int atajadas2;
		String golesRecibidos;
		int golesRecibidos2;
		// defensor
		Jugador Defensor = null;
		String recuperos;
		int recuperos2;
		String pelotasPerdidas;
		int pelotasPerdidas2;
		// delantero
		Jugador Delantero = null;
		String golesEchos;
		int golesEchos2;
		String golesErrados;
		int golesErrados2;
		// mediocampista
		Jugador Mediocampista = null;
		String pasesBuenos;
		int pasesBuenos2;
		String pasesMalos;
		int pasesMalos2;
		// sistema de opciones
		int selecciones = 0;
		String[] opciones = { "Arquero", "Defensor", "Delantero", "MedioCampista" };
		// while
		String[] siNo = { "Si", "No" };
		int siNo2 = 0;
		// memoria del programa
		ArrayList<Jugador> lista = new ArrayList<Jugador>();
		// comienzo del programa
		JOptionPane.showMessageDialog(null, "Bienvenido ^.^", "Bienvenido", JOptionPane.OK_OPTION);
		while (JOptionPane.showOptionDialog(null, "¿Desea ingresar datos de un jugador?",
				"Bucle, pero no se lo digas a nadie", siNo2, JOptionPane.INFORMATION_MESSAGE, null, siNo, 0) == 0) {

			int seleccion =JOptionPane.showOptionDialog(null, "Seleccione una posiciòn.", "Programa", selecciones,
					JOptionPane.INFORMATION_MESSAGE, null, opciones, 0);
			switch (seleccion) {
			case 0:// arquero
				nombre = JOptionPane.showInputDialog("Ingrese el nombre del Arquero:");
				apellido = JOptionPane.showInputDialog("Ingrese el apellido del Arquero:");
				numeroDeCamiseta = JOptionPane.showInputDialog("Ingrese el numero de camiseta del Arquero:");
				numeroDeCamiseta2 = Integer.parseInt(numeroDeCamiseta);
				atajadas = (String) JOptionPane.showInputDialog(null, "Ingrese las pelotas atajadas.", "Arquero",
						JOptionPane.INFORMATION_MESSAGE, null, null, null);
				atajadas2 = Integer.parseInt(atajadas);
				golesRecibidos = (String) JOptionPane.showInputDialog(null, "Ingrese goles que le hicieron.", "Arquero",
						JOptionPane.INFORMATION_MESSAGE, null, null, null);
				golesRecibidos2 = Integer.parseInt(golesRecibidos);
				int puntajeA = atajadas2 - golesRecibidos2;
				JOptionPane
						.showMessageDialog(null,
								"El puntaje de\n" + nombre + " " + apellido + "\nCon numero de camiseta:"
										+ numeroDeCamiseta2 + "\nes: " + puntajeA,
								"Arquero", JOptionPane.INFORMATION_MESSAGE);
				lista.add(Arquero);
				break;
			case 1:// defensor
				nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del Defensor:", "Defensor",
						JOptionPane.INFORMATION_MESSAGE);
				apellido = JOptionPane.showInputDialog(null, "Ingrese el apellido del Defensor:", "Defensor",
						JOptionPane.INFORMATION_MESSAGE);
				numeroDeCamiseta = JOptionPane.showInputDialog(null, "Ingrese el numero de camiseta del Defensor:",
						"Defensor", JOptionPane.INFORMATION_MESSAGE);
				numeroDeCamiseta2 = Integer.parseInt(numeroDeCamiseta);
				recuperos = JOptionPane.showInputDialog(null, "Ingrese las pelotas recuperadas: ", "Defensor",
						JOptionPane.INFORMATION_MESSAGE);
				recuperos2 = Integer.parseInt(recuperos);
				pelotasPerdidas = JOptionPane.showInputDialog(null, "Ingrese las pelotas perdidas: ", "Defensor",
						JOptionPane.INFORMATION_MESSAGE);
				pelotasPerdidas2 = Integer.parseInt(pelotasPerdidas);
				int puntajeDef = recuperos2 - pelotasPerdidas2;
				JOptionPane.showMessageDialog(
						null, "El puntaje de\n" + nombre + " n" + apellido + "\nCon numero de camiseta:"
								+ numeroDeCamiseta2 + "\nes: " + puntajeDef,
						"Defensor", JOptionPane.INFORMATION_MESSAGE);
				lista.add(Defensor);
				break;
			case 2:// delantero
				nombre = JOptionPane.showInputDialog("Ingrese el nombre del Delantero:");
				apellido = JOptionPane.showInputDialog("Ingrese el apellido del Delantero:");
				numeroDeCamiseta = JOptionPane.showInputDialog("Ingrese el numero de camiseta del Delantero:");
				numeroDeCamiseta2 = Integer.parseInt(numeroDeCamiseta);
				golesEchos = JOptionPane.showInputDialog(null, "Ingrese los goles realizados: ", "Delantero",
						JOptionPane.INFORMATION_MESSAGE);
				golesEchos2 = Integer.parseInt(golesEchos);
				golesErrados = JOptionPane.showInputDialog(null, "Ingrese los goles errados: ", "Delantero",
						JOptionPane.INFORMATION_MESSAGE);
				golesErrados2 = Integer.parseInt(golesErrados);
				int puntajeDel = golesEchos2 - golesErrados2;
				JOptionPane.showMessageDialog(
						null, "El puntaje de\n" + nombre + " " + apellido + "\nCon numero de camiseta:"
								+ numeroDeCamiseta2 + "\nes: " + puntajeDel,
						"Delantero", JOptionPane.INFORMATION_MESSAGE);
				lista.add(Delantero);
				break;
			case 3:// mediocampista
				nombre = JOptionPane.showInputDialog("Ingrese el nombre del MedioCampista:");
				apellido = JOptionPane.showInputDialog("Ingrese el apellido del MedioCampista:");
				numeroDeCamiseta = JOptionPane.showInputDialog("Ingrese el numero de camiseta del MedioCampista:");
				numeroDeCamiseta2 = Integer.parseInt(numeroDeCamiseta);
				pasesBuenos = JOptionPane.showInputDialog(null, "Ingrese la cantidad de pases buenos: ",
						"Medio Campista", JOptionPane.INFORMATION_MESSAGE);
				pasesBuenos2 = Integer.parseInt(pasesBuenos);
				pasesMalos = JOptionPane.showInputDialog(null, "Ingrese la cantidad de pases malos: ", "Medio Campista",
						JOptionPane.INFORMATION_MESSAGE);
				pasesMalos2 = Integer.parseInt(pasesMalos);
				int puntajeMC = pasesBuenos2 - pasesMalos2;
				JOptionPane.showMessageDialog(
						null, "El puntaje de\n" + nombre + " " + apellido + "\nCon numero de camiseta:"
								+ numeroDeCamiseta2 + "\nes:" + puntajeMC,
						"Mediocampista", JOptionPane.INFORMATION_MESSAGE);
				lista.add(Mediocampista);
				break;

			default:
			}
		} // while
		for (int i = 0; i < lista.size(); i++) {
			JOptionPane.showMessageDialog(null, "Jugadores ingresados" + lista.get(i).toString(), "Programa",
					JOptionPane.INFORMATION_MESSAGE);
		}
		//jugadores con mejor puntaje
		
	}

}
