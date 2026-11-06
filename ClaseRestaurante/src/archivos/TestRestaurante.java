package archivos;

public class TestRestaurante {

	public static void main(String[] args) {

		Restaurante rest1=new Restaurante();
		Restaurante rest2=new Restaurante();
		
		rest1.calificacion="Buena";
		rest1.direccion="Amaguaña Centro";
		rest1.nombre="FlumFRUIT";
		
		rest2.calificacion="Muy Buena";
		rest2.direccion="Colibri El mirador";
		rest2.nombre="JAEVIT FOOD";
		
		System.out.println("====Restautante 1: Valores Asignados====");
		System.out.println("Nombre: "+rest1.nombre);
		System.out.println("Calificacion: "+rest1.calificacion);
		System.out.println("Direccion: "+rest1.direccion);
		
		System.out.println("====Restautante 2: Valores Asignados====");
		System.out.println("Nombre: "+rest2.nombre);
		System.out.println("Calificacion: "+rest2.calificacion);
		System.out.println("Direccion: "+rest2.direccion);
		

	}

}
