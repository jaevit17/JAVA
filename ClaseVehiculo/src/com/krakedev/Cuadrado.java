package com.krakedev;

public class Cuadrado {
	
	private double lado;
	
	//----CONSTRUCTOR----
	public Cuadrado(double lado) {
		this.lado=lado;
	}
	//----getters-setters----
	public void setLado(double lado) {
		this.lado=lado;
	}
	public double getLado() {
		return lado;
	}
	//----METODOS----
	public double calcularArea() {
		double area=Math.pow(lado,2);
		return area;
	}
	public double calcularPerimetro() {
		double perimetro=lado*4;
		return perimetro;
	}
	
}
