package clearminds.cuentas.test;

import clearminds.cuentas.Cuenta;

public class TestCuenta {

	public static void main(String[] args) {
		//INSTANCIA CON CONSTRUCTORES
		Cuenta c1=new Cuenta("03543");
		c1.setSaldo(544);
		Cuenta c2=new Cuenta("03235","B",433);
		Cuenta c3=new Cuenta("54765");
		c3.setTipo("C");
		//VISUALIZACION
		System.out.println("-------- Valores Iniciales ---------");
		c1.imprimir();
		c2.imprimir();
		c3.imprimir();
	}

}
