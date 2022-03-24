
public class TesteGerente {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("Glória");
		g1.setCpf("0927272");
		g1.setSalario(5000.00);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		g1.setSenha(22334);
		boolean autenticou = g1.autentica(22334);
		
		System.out.println(autenticou);
		System.out.println(g1.getBonificacao());

	}

}
