package archivos;

public class TestPlato {

	public static void main(String[] args) {
		Plato platoA=new Plato();
		Plato platoB=new Plato();
		Plato platoC=new Plato();
		//Creado
		System.out.println("====PlatoA: Creado====");
		System.out.println("Nombre: "+platoA.nombre);
		System.out.println("Tipo: "+platoA.tipo);
		System.out.println("Precio: "+platoA.precio);
		System.out.println("Disponible: "+platoA.disponible);
		
		System.out.println("====PlatoB: Creado====");
		System.out.println("Nombre: "+platoB.nombre);
		System.out.println("Tipo: "+platoB.tipo);
		System.out.println("Precio: "+platoB.precio);
		System.out.println("Disponible: "+platoB.disponible);
		
		System.out.println("====PlatoC: Creado====");
		System.out.println("Nombre: "+platoC.nombre);
		System.out.println("Tipo: "+platoC.tipo);
		System.out.println("Precio: "+platoC.precio);
		System.out.println("Disponible: "+platoC.disponible);
		
		platoA.nombre="HamburFovit 3xChesse";
		platoA.tipo="PARILLAS";
		platoA.precio=5.5f;
		platoA.disponible=true;
		
		platoB.nombre="ResFresh + Bebida Lm";
		platoB.tipo="PARILLAS";
		platoB.precio=4.75f;
		platoB.disponible=true;
		
		platoC.nombre="Chesscake FamFriut 4 Frutas";
		platoC.tipo="POSTRES";
		platoC.precio=3.9f;
		platoC.disponible=true;
		//Valores asignados
		System.out.println("====PlatoA: Valores Asignados====");
		System.out.println("Nombre: "+platoA.nombre);
		System.out.println("Tipo: "+platoA.tipo);
		System.out.println("Precio: "+platoA.precio);
		System.out.println("Disponible: "+platoA.disponible);
		
		System.out.println("====PlatoB: Valores Asignados====");
		System.out.println("Nombre: "+platoB.nombre);
		System.out.println("Tipo: "+platoB.tipo);
		System.out.println("Precio: "+platoB.precio);
		System.out.println("Disponible: "+platoB.disponible);
		
		System.out.println("====PlatoC: Valores Asignados====");
		System.out.println("Nombre: "+platoC.nombre);
		System.out.println("Tipo: "+platoC.tipo);
		System.out.println("Precio: "+platoC.precio);
		System.out.println("Disponible: "+platoC.disponible);
		
		
		
		
	}

}
