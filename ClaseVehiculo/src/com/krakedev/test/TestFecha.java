package com.krakedev.test;

import com.krakedev.Fecha;

public class TestFecha {

	public static void main(String[] args) {
		Fecha f1=new Fecha(64,11,2027);
	
	System.out.println("Año: "+ f1.getAnio());
	System.out.println("Mes: "+ f1.getMes());
	System.out.println("Dia: "+ f1.getDia());
	}

}
