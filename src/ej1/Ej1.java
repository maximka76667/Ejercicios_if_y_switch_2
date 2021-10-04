package ej1;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Cuanto? ");
		double valor_de_moneda = entrada.nextDouble();
		
		entrada.nextLine();
		
		System.out.print("Tu moneda euros o pesetas (e/p): ");
		char moneda_principal = entrada.nextLine().charAt(0);
		
		double moneda_final = 0;

		switch (moneda_principal) {
		case 'e':
			moneda_final = valor_de_moneda * 166;
			break;
			
		case 'p':
			moneda_final = valor_de_moneda * 0.006;
			break;

		default:
			break;
		}
		
		System.out.println(moneda_final != 0 ? moneda_final : "Error");

		entrada.close();
	}

}
