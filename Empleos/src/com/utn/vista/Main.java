package com.utn.vista;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {
	public static final int PROGRAMADOR = 0;
	public static final int VENDEDOR = 1;

	public static void main(String[] args) {
		int sueldoTotalProgramadores = ;
		// datos programador y vendedor
		Vendedores vendedor = null;
		Empleados programador = null;
		String nombre;
		String apellido;
		int sueldoBasicoMensual;
		String sueldoBasicoMensual2;
		// porcentaje de ventas
		String[] ventasSiNo = { "Si", "No" };
		int ventasSiNo2 = 0;
		// ventas
		String ventas2;
		int ventas;
		String porcentaje2;
		int porcentaje;
		int porcentajeTotal;
		// horas extras
		String[] positivoNegativo = { "Si", "No" };
		int positivoNegativo2 = 0;
		String horasExtras;
		int horasExtras2 = 0;
		String bonoPorHoraExtra;
		int bonoPorHoraExtra2 = 0;
		// opciones while
		String[] siNo = { "Si", "No" };
		int siNo2 = 0;
		// opciones programador/vendedor
		String[] programadorVendedor = { "Programador", "Vendedor" };
		int programadorVendedor2=0;
		// arraylist
		ArrayList<Empleados> lista = new ArrayList<Empleados>();
		// inicio del programa
		JOptionPane.showMessageDialog(null, "Bienvenido");
		while (JOptionPane.showOptionDialog(null, "¿Desea ingresar informacion?", "Informacion", siNo2,
				JOptionPane.INFORMATION_MESSAGE, null, siNo, 0) == 0) { 
			int opciones2 = JOptionPane.showOptionDialog(null, "Seleccione una opcion", "Opciones", programadorVendedor2,
					JOptionPane.INFORMATION_MESSAGE, null, programadorVendedor, 0);
			switch (opciones2) {
			case PROGRAMADOR:
				nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del programador", "Programador",
						JOptionPane.INFORMATION_MESSAGE);
				apellido = JOptionPane.showInputDialog(null, "Ingrese el apellido del programador", "Apellido",
						JOptionPane.INFORMATION_MESSAGE);
				sueldoBasicoMensual2 = JOptionPane.showInputDialog(null, "Ingrese el sueldo del programador", "Sueldo",
						JOptionPane.INFORMATION_MESSAGE);
				sueldoBasicoMensual = Integer.parseInt(sueldoBasicoMensual2);

				if (JOptionPane.showOptionDialog(null, "¿Realizo horas extras?", "Horas extras", positivoNegativo2,
						JOptionPane.INFORMATION_MESSAGE, null, positivoNegativo, 0) == 0) {
					horasExtras = JOptionPane
							.showInputDialog("Ingrese la cantidad de horas extras que realizo el programador:");
					horasExtras2 = Integer.parseInt(horasExtras);
					bonoPorHoraExtra = JOptionPane.showInputDialog("Ingrese el valor del bono por horas extras:");
					bonoPorHoraExtra2 = Integer.parseInt(bonoPorHoraExtra);
				}
				programador = new Programadores(nombre, apellido, sueldoBasicoMensual, horasExtras2,
						bonoPorHoraExtra2);
				lista.add(programador);
				break;
			case VENDEDOR:
				nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del vendedor", "Vendedor",
						JOptionPane.INFORMATION_MESSAGE);
				apellido = JOptionPane.showInputDialog(null, "Ingrese el apellido del vendedor", "Apellido",
						JOptionPane.INFORMATION_MESSAGE);
				sueldoBasicoMensual2 = JOptionPane.showInputDialog(null, "Ingrese el sueldo del vendedor", "Sueldo",
						JOptionPane.INFORMATION_MESSAGE);
				sueldoBasicoMensual = Integer.parseInt(sueldoBasicoMensual2);

				if (JOptionPane.showOptionDialog(null, "¿Realizo ventas?", "Ventas", ventasSiNo2,
						JOptionPane.INFORMATION_MESSAGE, null, ventasSiNo, 0) == 0) {
					ventas2 = JOptionPane.showInputDialog("Ingrese el valor total de las ventas realizadas"); 
					ventas = Integer.parseInt(ventas2);
					porcentaje2 = JOptionPane.showInputDialog("Ingrese el porcentaje que le corresponde al vendedor");
					porcentaje = Integer.parseInt(porcentaje2);
					vendedor = new Vendedores(nombre, apellido, sueldoBasicoMensual, ventas, porcentaje);
					lista.add(vendedor);
				}
				break;
			}
		} // fin del while
		for (int i = 0; i < lista.size(); i++) {
			JOptionPane.showMessageDialog(null, lista.get(i).toString(), "Programador",
					JOptionPane.INFORMATION_MESSAGE);
		}
		//mayor sueldo
		int Ia = 0;
		int mayorSueldo = lista.get(0).getSueldoBasicoMensual();
		
		for (int i = 0; i < lista.size(); i++) {
			if (mayorSueldo > lista.get(i).getSueldoTotal()){
				mayorSueldo = lista.get(i).getSueldoBasicoMensual();
				Ia = i;
			}
		}
		JOptionPane.showMessageDialog(null, "El mejor sueldo es: " + lista.get(Ia), "Best sueldo islas caiman", JOptionPane.INFORMATION_MESSAGE);
		
		
		
	}//fin del main
	public static int sueldoTotalQuePagaLaEmpresa () {
		
		return 0;
	}


}
