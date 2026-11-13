package clearminds.cuentas;

public class Cuenta {
	//----ATRIBUTOS----
	private String id;
	private String tipo;
	private double saldo;
	//----GEETERS y SETTERS----
	public String getId() {
		return id;
	}
	//-------------
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo=tipo;
	}
	//--------------
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo=saldo;
	}
	//----CONSTRUCTORES----
	public Cuenta(String id) {
		this.id=id;
		this.tipo="A";
	}
	public Cuenta(String id, String tipo, double saldo) {
		this.id=id;
		this.tipo=tipo;
		this.saldo=saldo;
	}

}
