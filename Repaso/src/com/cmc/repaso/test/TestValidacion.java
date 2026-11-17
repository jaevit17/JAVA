package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Validacion;

public class TestValidacion {

	public static void main(String[] args) {
		System.out.println("Ejercicio 1");
		System.out.println("");
		Validacion v1=new Validacion();
		int monto1=6;
		boolean obj1=v1.validarMonto(monto1);
		System.out.println("VALIDACION OBJETO 1");
		System.out.println("VALOR: "+monto1);
		System.out.println("RESULTADO: "+obj1);
		System.out.println("-------------------------");
		int monto2=0;
		boolean obj2=v1.validarMonto(monto2);
		System.out.println("VALIDACION OBJETO 2");
		System.out.println("VALOR: "+monto2);
		System.out.println("RESULTADO: "+obj2);
		System.out.println("-------------------------");

	}

}
