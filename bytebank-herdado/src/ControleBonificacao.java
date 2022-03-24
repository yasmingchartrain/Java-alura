
public class ControleBonificacao {
	
	private double soma ;
	
	
	public void registra(Funcionario f) {
		double boni = f.getBonificacao();
		this.soma = this.soma + boni;
	}
	
	// ou pode ser escrito:
	
	//public void registra(Funcionario f) {
	// this.soma += f.getBonificacao();

	public double getSoma() {
		return soma;
	}
				
}
