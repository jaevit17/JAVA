package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
		System.out.println("Ejercicio4");
		System.out.println("");
		//OBJETO1
		Item i1=new Item();
		i1.nombre="ZAPATILLAS";
		i1.productosActuales=20;
		System.out.println("----MEGAMAXI CORP. BODEGA----");
		System.out.println(" Nombre Producto: "+i1.nombre);
		i1.imprimir();
		System.out.println("     -------");
		i1.vender(6);
		i1.imprimir();
		System.out.println("     -------");
		i1.devolver(4);
		i1.imprimir();
		//OBJETO2
		System.out.println("----------------------------------");
		Item i2=new Item();
		i2.nombre="BALONES FUTBOL";
		i2.productosActuales=64;
		System.out.println("----MEGAMAXI CORP. BODEGA----");
		System.out.println(" Nombre Producto: "+i2.nombre);
		i2.imprimir();
		System.out.println("     -------");
		i2.vender(25);
		i2.imprimir();
		System.out.println("     -------");
		i2.devolver(7);
		i2.imprimir();

	}

}
