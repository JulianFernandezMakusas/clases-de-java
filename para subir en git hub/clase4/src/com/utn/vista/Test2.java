package com.utn.vista;

public class Test2 {

	static String nom1 = "dante";
	static String nom2 = "aldo";
	
	public static void main(String[] args) {
		
		String [] nombres = {nom1 , nom2 , "magui" , "javier"};
		
		System.out.println("Decremento del vector");
		//decrementacion
		for (int i = nombres.length-1; i >= 0; i--) {
			System.out.println(nombres [i]);	
		}
		System.out.println("==========================");
		System.out.println("Saludos");
		//incrementacion pero se imprimen los saludos :v
		for (int i = 0; i < nombres.length; i++) {
			
			saludar (nombres[i]);
		}
		System.out.println(saludoReturn ("Gomez"));
		
		recorroVectorVehiculo(asignoVehiculo("auto", "moto", "bondi"));

	}
	public static void saludar (String nombre) {
		System.out.println("Hola Sr/a " + nombre);
	}

	public static String saludoReturn(String apellidos) {
		switch (apellidos) {
		case "Gomez":
			
			return "El apellido es Español";
		case "Panella":
			return "El apellido es Italiano";
		case "Makusas":
			return "El apellido es Lituano";

		default:
			return "No conozco la nacionalidad del apellido";
		}
	}
	
	public static String [] asignoVehiculo (String vehiculo1, String vehiculo2, String vehiculo3) {
		String [] vecVehiculos = {vehiculo1,
								 vehiculo2,
								 vehiculo3};
		return vecVehiculos;
	}
	
	public static void tipoVehiculo (String tipoVehiculo) {
		switch (tipoVehiculo) {
		case "moto":
			System.out.println("solo pueden viajar 2 personas en el vehiculo: " + tipoVehiculo);
			break;
		case "auto":
			System.out.println("solo pueden viajar 4 personas en el vehiculo: " + tipoVehiculo);
	break;
		case "bondi":
			System.out.println("solo pueden viajar 30 personas en el vehiculo: " + tipoVehiculo);
			break;		

		default:
		}
	}
	public static void recorroVectorVehiculo (String [] vector) {
		for (int i = 0; i < vector.length; i++) {
			tipoVehiculo(vector[i]);
		}
	}
}

