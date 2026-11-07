package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		Calculador c1=new Calculador();
		int suma=c1.sumar(2, 3);
		System.out.println("Suma: 2+3 = "+suma);
		
		int resta=c1.restar(34, 20);
		System.out.println("Resta: 34-20 = "+resta);
		
		double multipli=c1.multiplicar(3, 4);
		System.out.println("Multiplicacion: 3x4 = "+multipli);
		
		double division=c1.dividir(50, 5);
		System.out.println("Division: 50/5 = "+division);
		
		double promediar=c1.promediar(3, 6, 9);
		System.out.println("Promedio de 2,6,8 es: "+promediar);
		
		c1.mostrarResultado();
	}

}
