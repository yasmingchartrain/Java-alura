package bytebank;

public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println("Na primeira conta foi depositado um valor de  " + primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println("Na primeira conta foi depositado mais 100 reais agora o saldo ? de " + primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		System.out.println("Na segunda conta foi depositado um valor de " + segundaConta.saldo);
		
		segundaConta.agencia = 146;
		System.out.println("A segunda conta tem a agencia " + segundaConta.agencia);
		
		if(primeiraConta == segundaConta) {
			System.out.println("S?o a mesma conta");
		} else {
			System.out.println("N?o n?o a mesma conta");
		}
	}

}
