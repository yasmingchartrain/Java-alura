package bytebank;

public class Conta {
	double saldo;
	int agencia;
	int numero;
	String titular;

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
}