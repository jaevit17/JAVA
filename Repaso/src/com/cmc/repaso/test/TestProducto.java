package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		System.out.println("Ejercicio3");
		System.out.println("");
		//OBJETO1
		Producto p1=new Producto("Kilo TOMATE",4.3);
		p1.setPrecio(-8.5);
		double pFinal1=p1.calcularPrecioPromo(10);
		System.out.println("PRODUCTO 1: "+p1.nombre);
		System.out.println("Precio: "+p1.getPrecio());
		System.out.println("Descuento (10%)");
		System.out.println("Precio + DESCUENTO: "+pFinal1);
		System.out.println("      ---------");
		//OBJETO2
		Producto p2=new Producto("Kilo PAPAS",3.65);
		p2.setPrecio(-7.60);
		double pFinal2=p2.calcularPrecioPromo(20);
		System.out.println("PRODUCTO 2: "+p2.nombre);
		System.out.println("Precio: "+p2.getPrecio());
		System.out.println("Descuento (20%)");
		System.out.println("Precio + DESCUENTO: "+pFinal2);
		System.out.println("      ---------");
		//OBJETO3
		Producto p3=new Producto("Kilo ARROZ",2.75);
		p3.setPrecio(-11.5);
		double pFinal3=p3.calcularPrecioPromo(20);
		System.out.println("PRODUCTO 3: "+p3.nombre);
		System.out.println("Precio: "+p3.getPrecio());
		System.out.println("Descuento (20%)");
		System.out.println("Precio + DESCUENTO: "+pFinal3);
		System.out.println("      ---------");
		

	}

}