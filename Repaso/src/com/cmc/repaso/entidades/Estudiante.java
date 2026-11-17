package com.cmc.repaso.entidades;

public class Estudiante {
	//ATRIBUTOS
	public String nombre;
	public double nota;
	public String resultado;
	//CONSTRUCTOR
	public Estudiante(String nombre) {
		this.nombre=nombre;
	}
	//METODO
	public void calificar(double nota) {
		this.nota=nota;
		if(nota<8) {
			this.resultado="F";
		}else if(nota>8) {
			this.resultado="A";
		}
		
	}
}
