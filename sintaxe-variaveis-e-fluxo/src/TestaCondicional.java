
public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("testando condicinais");
		int idade = 16;
		int quantidadePessoas = 1;
		if (idade >= 18) {
			System.out.println("Voc� tem mais de 18 anos");
		}
		else {
			if(quantidadePessoas >= 2) {
				System.out.println("Voc� n�o tem 18, mas pode entrar acompanhado");
			} else {
			System.out.println("Infelizmente voc� n�o pode entrar!");
			}
		}
	}

}
