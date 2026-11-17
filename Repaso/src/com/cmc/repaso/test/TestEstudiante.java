package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		System.out.println("Ejercicio 2");
		System.out.println("");
		//OBJETO 1
		Estudiante e1=new Estudiante("Josue V.");
		e1.calificar(7);
		String nombre1=e1.nombre;
		double nota1=e1.nota;
		String resultado1=e1.resultado;
		System.out.println("Estudiante: "+ nombre1);
		System.out.println("NOTA: "+ nota1);
		System.out.println("RESULTADO: "+ resultado1);
		System.out.println("       --------");
		//OBJETO 2
		Estudiante e2=new Estudiante("Tiara G.");
		e2.calificar(9.5);
		String nombre2=e2.nombre;
		double nota2=e2.nota;
		String resultado2=e2.resultado;
		System.out.println("Estudiante: "+ nombre2);
		System.out.println("NOTA: "+ nota2);
		System.out.println("RESULTADO: "+ resultado2);
		System.out.println("       --------");
		
		
		
		

	}

}
