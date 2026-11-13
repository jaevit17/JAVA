package com.krakedev;

public class Rectangulo {
	private int base;
	private int altura;
	
	//----CONSTRUCTOR----
	public Rectangulo(int base,int altura) {
		this.base=base;
		this.altura=altura;
	}
	//----getters-setters----
	public void setBase(int base) {
		this.base=base;
	}
	public int getBase() {
		return base;
	}
	public void setAltura(int altura) {
		this.altura=altura;
	}
	public int getAltura() {
		return altura;
	}
	//----METODOS----
	public int calcularArea() {
		int area=base*altura;
		return  area;
	}
	public double calcularPerimetro() {
		double perimetro=(2*base)+(2*altura);
		return perimetro;
	}
}
