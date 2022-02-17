
public class TestaBancoSemCliente {
	public static void main(String[] args) {
		Conta contaDaGi = new Conta();
		contaDaGi.deposita(1300);
		System.out.println(contaDaGi.getSaldo());
		
		contaDaGi.titular = new Cliente();
		System.out.println(contaDaGi.titular);
		
		contaDaGi.titular.nome = "Giovana";
		System.out.println(contaDaGi.titular.nome);
	}

}
