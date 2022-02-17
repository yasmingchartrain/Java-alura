
public class TestaCaracteres {
	public static void main(String[] arg) {
		char letra = 'a'; 
		// char guarda apenas 1 caracter sendo em aspas simples, ñ pode aspas duplas!!
		System.out.println(letra);
		
		char valor = 65;
		System.out.println(valor);
		
		valor = (char) (valor + 1);
		System.out.println(valor);
		
		String palavra = "A copo da cinha aconteceu em ";
		System.out.println(palavra);
		
		palavra = palavra + 2020; 
		//a string transforma o inteiro em string para concatenar na string 
		System.out.println(palavra);
		
	}

}
