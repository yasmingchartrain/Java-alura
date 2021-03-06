

public abstract class Conta {
protected double saldo;
private int agencia;
private int numero;
private Cliente titular;
private static int total;



	public Conta(int agencia, int numero) {
		Conta.total++;
		System.out.println("O n?mero total de contas ? " + total);
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("A conta " + this.numero + " foi criada com sucesso!");
	}

	public abstract void deposita(double valor);

	public boolean saca(double valor) {
	if(this.saldo >= valor) {
		this.saldo -= valor;
		System.out.println("***Foi sacado : " + valor + "***");
				return true;
	} else {
		return false;
	}
	}

	public boolean transfere(double valor,Conta destino) {
		if(this.saca(valor)) {
			destino.deposita(valor);
			System.out.println("***Foi transferido : " + valor + "***/n" );
			return true;
		
		} //nao precisa utilizar o else sempre, ele fica subentendido
		return false;
	}
	
	public double getSaldo() {
		return this.saldo;
		
	}
	
	public int getNumero() {
		
	return this.numero;
	
	}
	
	public void setNumero(int numero) {
		if(numero <= 0 ) {
			System.out.println("n?o pode numero menor igual a 0");
			
		}
		this.numero =numero;
	}

	public int getAgencia() {
		
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("n?o pode valor menor igual a 0");
			return;
		}
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return total;
	}
	
	
}

