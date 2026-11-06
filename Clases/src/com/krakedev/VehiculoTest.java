package com.krakedev;

public class VehiculoTest {

	public static void main(String[] args) {
		
		Vehiculo v;
		v=new Vehiculo();
		System.out.println("Vehiculo 1: CREADO");
		v.anio=2012;
		v.marca="SUZUKI";
		v.modelo="GSX";
		System.out.println("Año: "+v.anio);
		System.out.println("Marca: "+v.marca);
		System.out.println("Modelo: "+v.modelo);
		
		
		Vehiculo v2=new Vehiculo();
		System.out.println("Vehiculo 2: CREADO");
		v2.anio=2016;
		v2.marca="MAZDA";
		v2.modelo="CX3";
		System.out.println("Año: "+v2.anio);
		System.out.println("Marca: "+v2.marca);
		System.out.println("Modelo: "+v2.modelo);
		
	}

}
