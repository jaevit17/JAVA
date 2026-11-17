package com.cmc.repaso.entidades;

public class Producto {
	//ATRIBUTOS	
	public String nombre;
	private double precio;
	//CONSTRUCTOR
	public Producto(String nombre,double precio) {
		this.nombre=nombre;
		this.precio=precio;
	}
	//SETTERS-GETTERS
	public void setPrecio(double precio) {
		if(precio>0) {
			this.precio=precio;
		}else {
			this.precio=precio*-1;
		}
	}
	public double getPrecio() {
		return precio;
	}
	//METODO
	public double calcularPrecioPromo(int porcentaje) {
		double descuento=(precio/100)*porcentaje;
		double precioDescnt=precio-descuento;
		return precioDescnt;
	}
	
}