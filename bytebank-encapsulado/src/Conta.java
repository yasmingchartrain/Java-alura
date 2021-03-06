

public class Conta {
private double saldo;
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

	public void deposita(double valor) {
		this.saldo += valor;
		System.out.println("***Foi depositado : " + valor + "***");

	}

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
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.saldo += valor; 
			// poderia utilizar destino.deposita(valor); , sim! mas repetiria o sysout de deposita e transfere.
			System.out.println("***Foi transferido : " + valor + "***");
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

