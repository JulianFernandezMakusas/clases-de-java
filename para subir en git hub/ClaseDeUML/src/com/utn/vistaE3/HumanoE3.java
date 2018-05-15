package com.utn.vistaE3;

public class HumanoE3 implements MamiferoE3 {

	@Override
	public void comer(String[] alimentos) {
		System.out.println("el humano comio: " );
		for (int i = 0; i < alimentos.length; i++) {
			System.out.println("los alimentos son: " + alimentos[i]);
		}
	}

	@Override
	public void dormir(double horas) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double caminar(String superficie, double distancia) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void comunicarse() {
		// TODO Auto-generated method stub
		System.out.println(this.getClass().getSimpleName());
		System.out.println("Hablo de la clase humanoE3");
	}

}
