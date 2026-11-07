package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		Calculador c1=new Calculador();
		int suma=c1.sumar(2, 3);
		System.out.println("Suma: "+suma);
		
		int resta=c1.restar(34,20);
		System.out.println("Resta: "+resta);
		
	}

}
