
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario yasmin = new Funcionario();
		
		yasmin.setNome("YasminChartrain");
		yasmin.setCpf("43894893");
		yasmin.setSalario(3000.00);
		
		System.out.println(yasmin.getNome());
		System.out.println(yasmin.getSalario());
		System.out.println(yasmin.getBonificacao());
	}

}
