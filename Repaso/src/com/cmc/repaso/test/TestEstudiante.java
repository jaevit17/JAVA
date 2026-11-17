package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		System.out.println("Ejercicio 2");
		System.out.println("");
		//OBJETO 1
		Estudiante e1=new Estudiante("Josue V.");
		e1.calificar(7);
		System.out.println("Estudiante: "+ e1.nombre);
		System.out.println("NOTA: "+ e1.nota);
		System.out.println("RESULTADO: "+ e1.resultado);
		System.out.println("       --------");
		//OBJETO 2
		Estudiante e2=new Estudiante("Tiara G.");
		e2.calificar(9.5);
		System.out.println("Estudiante: "+ e2.nombre);
		System.out.println("NOTA: "+ e2.nota);
		System.out.println("RESULTADO: "+ e2.resultado);
		System.out.println("       --------");
		
		
		
		

	}

}
