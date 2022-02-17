
public class TestaGetSet {
	public static void main(String[] args) {
		
		Conta conta = new Conta(337,23565);
		
		//cont.numero = 1337;  não vai funcionar pois 
		conta.setNumero(1337);
		
		System.out.println(conta.getNumero());

		
		Cliente paulo = new Cliente();
		
		//conta.titular = paulo;
		
		paulo.setNome("Paulo Silveira");
		conta.setTitular(paulo);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("programador");
		
		System.out.println(conta.getTitular().getProfissao());
		
	}
}
