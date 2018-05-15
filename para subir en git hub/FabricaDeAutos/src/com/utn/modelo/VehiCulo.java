package com.utn.modelo;

public class VehiCulo {
	
	//visibilidad
	// > private
	// > protected
	// > public
	//todo atributo privado es accedido por medio de n metodo publeco
	
	private String marca;
	private String modelo;
	private String color;
	
	//creamos el get y set por cada atributo
	
	//set para poder asignar un valor al atributo privado
	public void setModelo(String modelo) {
		//this:
		//crean un metodo y definen un valor como parametro
		this.modelo = modelo;
	}
	//get es para retornar o devolver el valor del atibuto privado
	public String getModelo () {
		return modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override //sobreescritura de metodo 
	public String toString() {
		return "VehiCulo [marca=" + marca + ", modelo=" + modelo + ", color=" + color + "]";
	}
	
}
