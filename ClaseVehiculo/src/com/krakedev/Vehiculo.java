package com.krakedev;

public class Vehiculo {
	private String marca;
	private String modelo;
	private int anio;
	private double precio;
	
	//----METODOS CONSTRUCTOR----
	public Vehiculo() {
		
	}
	public Vehiculo(String marca) {
		this.marca=marca;
	}
	public Vehiculo(String marca,String modelo,int anio,double precio) {
		this.marca=marca;
		this.modelo=modelo;
		this.anio=anio;
		this.precio=precio;
	}
	
	//----getters-setters----
	public void setMarca(String marca) {
		this.marca=marca;
	}
	public String getMarca() {
		return marca;
	}
	public void setModelo(String modelo) {
		this.modelo=modelo;
	}
	public String getModelo() {
		return modelo;
	}
	public void setAnio(int anio) {
		this.anio=anio;
	}
	public int getAnio() {
		return anio;
	}
	public void setPrecio(double precio) {
		this.precio=precio;
	}
	public double getPrecio() {
		return precio;
	}
	
}

