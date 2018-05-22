package com.utn.vista;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class PersonaMain {
	public static void main(String[] args) {
		String nombre;
		String apellido;
		String dni;
		int dni2;
		ArrayList<Persona> nPersona = new ArrayList<Persona>();
		Persona nuevaPersona = null;
		while (JOptionPane.showInputDialog(null, "¿Desea ingresar datos?").equalsIgnoreCase("si")) {
			try {
				nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre", "Informacion", 1);
				apellido = JOptionPane.showInputDialog(null, "Ingrese su apellido", "Informacion", 1);
				dni = JOptionPane.showInputDialog(null, "Ingrese su DNI", "Informacion", 1);
				dni2 = Integer.parseInt(dni);
				nuevaPersona = new Persona(dni2, nombre, apellido);
				nPersona.add(nuevaPersona);
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, "Error, intentelo otra vez.");
			}
		}
		for (int i = 0; i < nPersona.size(); i++) {
			JOptionPane.showMessageDialog(null, (nPersona.get(i)).toString());
		}
	}

}
