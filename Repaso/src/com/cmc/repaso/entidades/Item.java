package com.cmc.repaso.entidades;

public class Item {
	//ATRIBUTOS
	public String nombre;
	public int productosActuales;
	public int productosDevueltos;
	public int productosVendidos;
	//METODOS
	public void imprimir() {
		System.out.println("Productos Actuales: "+productosActuales);
		System.out.println("Productos Devueltos: "+productosDevueltos);
		System.out.println("Productos Vendidos: "+productosVendidos);
	}
	public void vender(int productosVendidos) {
		this.productosActuales-=productosVendidos;
		this.productosVendidos+=productosVendidos;
	}
	public void devolver(int productosDevueltos) {
		this.productosActuales+=productosDevueltos;
		this.productosVendidos-=productosDevueltos;
		this.productosDevueltos+=productosDevueltos;
	}
}
