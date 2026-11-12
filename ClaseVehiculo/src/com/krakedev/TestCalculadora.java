package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		//objeto1
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
		
		double descuento=c1.calcularDescuento(100, 40);
		System.out.println("Precio con descuento: "+ descuento);
		//objeto2
		Calculador c2=new Calculador();
		
		
		c1.mostrarResultado();
	}

}
