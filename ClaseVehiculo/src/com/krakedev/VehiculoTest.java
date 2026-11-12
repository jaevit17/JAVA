package com.krakedev;

public class VehiculoTest {

	public static void main(String[] args) {
		
		Vehiculo v=new Vehiculo();
		System.out.println("Vehiculo 1: CREADO");
		v.setAnio(2016);
		v.setMarca("SUZUKI");
		v.setModelo("GSX");
		System.out.println("Año: "+v.getAnio());
		System.out.println("Marca: "+v.getMarca());
		System.out.println("Modelo: "+v.getModelo());
		
		
		Vehiculo v2=new Vehiculo();
		System.out.println("Vehiculo 2: CREADO");
		v2.setAnio(2014);
		v2.setMarca("MAZDA");
		v2.setModelo("CX3");
		System.out.println("Año: "+v2.getAnio());
		System.out.println("Marca: "+v2.getMarca());
		System.out.println("Modelo: "+v2.getModelo());
		
	}

}
