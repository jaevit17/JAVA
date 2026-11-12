package com.krakedev;

public class Vehiculo {
	private String marca;
	private String modelo;
	private int anio;
	private double precio;
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

