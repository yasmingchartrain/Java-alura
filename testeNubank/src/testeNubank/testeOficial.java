package testeNubank;

public class testeOficial {
	public static void main(String[] args) {

		int day = 0;
		double[] n = { 1.30, 1.04, 2.5, 1.03, 1.08, 1.05 };

		for (int counter = 0; counter < n.length; counter++) {
			for(int counter2 = 1; counter2 <= n.length; counter2 ++) {
				double soma = n[counter] + n[counter2];
			if(soma <= 3) {
				day++;
			}else {
				break;
			}

		}
		System.out.println(day);

	}
}
}