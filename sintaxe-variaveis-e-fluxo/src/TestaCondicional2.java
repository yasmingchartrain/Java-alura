
public class TestaCondicional2 {
	public static void main(String[] args) {
		System.out.println("Testanto condicionais");
		
		int idade = 16;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >= 2;
		
		System.out.println("O valor acompanhado = " + acompanhado);
		
		if(idade >= 18 && acompanhado) {
		
			System.out.println("Seja Bem-Vindo!");
		}
		else {
		
			System.out.println("Você não tem mais de 18 anos, e não pode entrar!");
			}
		}
	}

