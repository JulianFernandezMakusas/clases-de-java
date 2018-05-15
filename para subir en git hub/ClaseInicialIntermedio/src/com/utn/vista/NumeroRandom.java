package com.utn.vista;

public class NumeroRandom {

	public static void main(String[] args) {
		double a;
		a = Math.random();//numero decimal al azar entre 0 y 1
		System.out.println(a);
		//y si necesito un entero?
		int b;
		b = (int) (Math.random()*6);//numero entre 0 y 5
		System.out.println(b);
		//el multiplicador me indica la cantidad de numeros que toma para el azar
		//y si quiero que empiece de 1 y no de 0?
		int c;
		c = (int) (Math.random()*6+1);//numero entre 1 y 6
	}

}
