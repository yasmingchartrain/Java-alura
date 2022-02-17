
public class TesteFatorial {
	public static void main(String[] args) {
		int fatorial = 1;
		
		for(int cont = 1; cont < 11; cont++) {
			fatorial *= cont;
			System.out.println("Fatorial de " + cont + " = " + fatorial);
	}

}
}