
public class TestaBanco {

	public static void main(String[] args) {
		Cliente yasmim = new Cliente();
		yasmim.nome = "Yasmim Chartrain";
		yasmim.cpf = "333.333.333-33";
		yasmim.profissao = "programadora";
		
		Conta contaDaYasmim = new Conta();
		contaDaYasmim.deposita(100);
		
		contaDaYasmim.titular = yasmim;
		
		//System.out.println(contaDaYasmim.titular); aqui mostra o codigo da conta, n?o o nome 
		System.out.println(contaDaYasmim.titular.nome);
		
		
	}
}
