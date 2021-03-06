package bytebank;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDaYasmim = new Conta();
		contaDaYasmim.saldo = 1000;
		System.out.println("Saldo em conta de " + contaDaYasmim.saldo);

		contaDaYasmim.deposita(50); // adicionando com o metodo
		System.out.println("Saldo em conta de " + contaDaYasmim.saldo);

		boolean conseguiuRetirar = contaDaYasmim.saca(15);
		contaDaYasmim.saca(70);
		System.out.println("O saldo ap?s o saque ? " + contaDaYasmim.saldo);
		System.out.println("Conseguiu sacar? " + conseguiuRetirar);
		
		Conta contaDaGi = new Conta();
		contaDaGi.saldo += 1000;
		System.out.println("A conta da Gi tem " + contaDaGi.saldo);
		
		if(contaDaYasmim.transfere(75, contaDaGi)) {
			System.out.println("Transferencia feita com sucesso!!");
		} else {
			System.out.println("Faltou dinheiro!");
		}
		
		System.out.println("O saldo na conta da Yasmim ? de " + contaDaYasmim.saldo);
		System.out.println("O saldo na conta da Gi ? de " + contaDaGi.saldo);
		
	}

}
