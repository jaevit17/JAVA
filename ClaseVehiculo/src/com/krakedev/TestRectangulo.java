package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		Rectangulo figura1=new Rectangulo(55,20);
				
		int resultA1=figura1.calcularArea();
		double resultP1=figura1.calcularPerimetro();
		System.out.println("====Rectangulo 1====");
		System.out.println("Area1: "+resultA1);
		System.out.println("Perimetro1: "+resultP1);
		
		
		Rectangulo figura2=new Rectangulo(70,35);
		
		int resultA2=figura2.calcularArea();
		double resultP2=figura2.calcularPerimetro();
		System.out.println("====Rectangulo 2====");
		System.out.println("Area2: "+resultA2);
		System.out.println("Perimetro2: "+resultP2);
		
	}

}
