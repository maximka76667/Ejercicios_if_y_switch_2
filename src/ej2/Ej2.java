package ej2;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("a: ");
		double a = entrada.nextDouble();

		System.out.print("b: ");
		double b = entrada.nextDouble();

		System.out.print("c: ");
		double c = entrada.nextDouble();
		
		boolean result = false;

		if(c >= b && b >= a) result = true;

		System.out.println("De menor a mayor: " + result);

		entrada.close();
	}

}
