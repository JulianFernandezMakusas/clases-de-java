package com.utn.vista;

//toLowerCase hace que independientemente de como escriba con mayusculas o minusculas transforme las mayusculas a minusculas
//equals compara que sean iguales los valores de la funcion String
//p Y q= p && q
//p O q=p || q
//ctrl+shit+F ordenar el codigo
public class test {

	public static void main(String[] args) {
		boolean usuario = false;
		String nombreUsuario = "julian";
		boolean mandoEmail = false;
		
		if (usuario == true) {
	    		if (nombreUsuario == "julian") {
				System.out.println("el usuario esta registrado");
				System.out.println("bienvenido " + nombreUsuario);

			}
		} else if (mandoEmail) {
			System.out.println("el usuario no registro su nombre");
		} else {
			System.out.println("se envio el correo....");
		}
		
		int num1=2;
		int num2=5;
		//nos da dos posibles resultados: verdadero o falso
		if (comparoMayor (num1,num2)) {
			System.out.println(num1 + " es mayor a " + num2);
		}else {
			System.out.println(num1 +  " es menor a " + num2);
		}

	}
	public static boolean comparoMayor (int num1, int num2) {
		
		return num1 > num2;
	}

}
