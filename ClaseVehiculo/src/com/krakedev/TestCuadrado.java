package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		Cuadrado figura1=new Cuadrado();
		Cuadrado figura2=new Cuadrado();
		Cuadrado figura3=new Cuadrado();
		
		figura1.setLado(8);
		figura2.setLado(4);
		figura3.setLado(15);

		double resultA1=figura1.calcularArea();
		double resultP1=figura1.calcularPerimetro();
		System.out.println("====Cuadrado 1====");
		System.out.println("Area1: "+resultA1);
		System.out.println("Perimetro1: "+resultP1);
		
		double resultA2=figura2.calcularArea();
		double resultP2=figura2.calcularPerimetro();
		System.out.println("====Cuadrado 2====");
		System.out.println("Area2: "+resultA2);
		System.out.println("Perimetro2: "+resultP2);
		
		double resultA3=figura3.calcularArea();
		double resultP3=figura3.calcularPerimetro();
		System.out.println("====Cuadrado 3====");
		System.out.println("Area3: "+resultA3);
		System.out.println("Perimetro3: "+resultP3);
	}

}
