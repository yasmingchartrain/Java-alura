
public class TesteSacaValoresNegativos {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(100);
		
		System.out.println(conta.saca(101));
		
		// agora essa linha n�o roda mais 
		//System.out.println(conta.saldo);
		
		//proibido fazer dessa forma para que a conta fique negativa
		//conta.saldo = conta.saldo - 101;
		
		System.out.println(conta.getSaldo());
		
	}

}
