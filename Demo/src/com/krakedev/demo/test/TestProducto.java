package com.krakedev.demo.test;

import com.krakedev.demo.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto p1=new Producto(453,"Jabon");
		//OBJETO 1
		p1.setDescripcion("Producto HIGIENICO.");
		p1.setPeso(0.400);
		System.out.println("    EMP. MEGAMAXI SA");
		System.out.println("-------PRODUCTO 1--------");
		System.out.println("CODIGO: "+p1.getCodigo());
		System.out.println("NOMBRE: "+p1.getNombre());
		System.out.println("DESCRP: "+p1.getDescripcion());
		System.out.println("PESO: "+p1.getPeso()+" g.");
		System.out.println("      -----------"        );
		//OBJETO 2
		Producto p2=new Producto(454,"Galletas");
		p2.setDescripcion("Producto COMESTIBLE.");
		p2.setPeso(0.950);
		System.out.println("    EMP. MEGAMAXI SA");
		System.out.println("-------PRODUCTO 2--------");
		System.out.println("CODIGO: "+p2.getCodigo());
		System.out.println("NOMBRE: "+p2.getNombre());
		System.out.println("DESCRP: "+p2.getDescripcion());
		System.out.println("PESO: "+p2.getPeso()+" g.");
		System.out.println("      -----------"        );
		

	}

}
