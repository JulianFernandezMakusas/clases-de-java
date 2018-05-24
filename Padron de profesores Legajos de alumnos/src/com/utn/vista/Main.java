package com.utn.vista;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		int casos = 0;
		int siNo2 = 0;
		String nombre;
		String apellido;
		String dni;
		int dni2;
		String[] siNo = { "Si", "No" };
		String[] opciones = { "Profesor", "Alumno" };
		String nLegajo;
		int nLegajo2;
		String nPadron;
		int nPadron2;
		ArrayList<Persona> lista = new ArrayList<Persona>();
		Persona profesor = null;
		Persona alumno = null;
		JOptionPane.showMessageDialog(null, "Bienvenido", "Bienvenido", JOptionPane.INFORMATION_MESSAGE);
		while (JOptionPane.showInputDialog("¿Desea ingresar datos?").equalsIgnoreCase("si")) {
		int seleccion = JOptionPane.showOptionDialog(null, "Selecione una opcion", "Informaciòn", casos,
				JOptionPane.INFORMATION_MESSAGE, null, opciones, 0);
		switch (seleccion) {
		// profesor
		case 0:
			nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre", "Informaciòn", 1);
			apellido = JOptionPane.showInputDialog(null, "Ingrese su apellido", "Informaciòn", 1);
			dni = JOptionPane.showInputDialog(null, "Ingrese su DNI", "Informaciòn", 1);
			dni2 = Integer.parseInt(dni);
			nPadron = JOptionPane.showInputDialog(null, "Ingrese su numero de padron", "Informaciòn", 1);
			nPadron2 = Integer.parseInt(nPadron);
			profesor = new Persona(nombre, apellido, dni, nPadron);
			lista.add(profesor);
			break;
		// alumno
		case 1:
			nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre", "Informaciòn", 1);
			apellido = JOptionPane.showInputDialog(null, "Ingrese su apellido", "Informaciòn", 1);
			dni = JOptionPane.showInputDialog(null, "Ingrese su DNI", "Informaciòn", 1);
			dni2 = Integer.parseInt(dni);
			nLegajo = JOptionPane.showInputDialog(null, "Ingrese su numero de legajo", "Informaciòn", 1);
			nLegajo2 = Integer.parseInt(nLegajo);
			alumno = new Persona(nombre, apellido, dni, nLegajo);
			lista.add(alumno);
			break;
		default:
		}
		 }

	}

}
