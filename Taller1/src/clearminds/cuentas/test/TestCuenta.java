package clearminds.cuentas.test;

import clearminds.cuentas.Cuenta;

public class TestCuenta {

	public static void main(String[] args) {
		//INSTANCIA CON CONSTRUCTORES
		Cuenta c1=new Cuenta("03543");
		c1.setSaldo(130);
		c1.setTipo("S");
		Cuenta c2=new Cuenta("03235","A",321);
		Cuenta c3=new Cuenta("54765");
		c3.setTipo("F");
		c3.setSaldo(20);
		Cuenta c4=new Cuenta("56236","S", 700);
		Cuenta c5=new Cuenta("98231");
		c5.setTipo("B");
		Cuenta c6=new Cuenta("43132");
		c6.setSaldo(64);
		//VISUALIZACION
		System.out.println("-------- Valores Iniciales ---------");
		c1.imprimir();
		c2.imprimir();
		c3.imprimir();
		c4.imprimir();
		c5.imprimir();
		c6.imprimir();
		System.out.println("-------- Valores Iniciales con Estilos ---------");
		c1.imprimirConMiEstilo();
		c2.imprimirConMiEstilo();
		c3.imprimirConMiEstilo();
		c4.imprimirConMiEstilo();
		c5.imprimirConMiEstilo();
		c6.imprimirConMiEstilo();
	}

}
