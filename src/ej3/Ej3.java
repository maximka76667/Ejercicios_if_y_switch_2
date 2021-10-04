package ej3;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("a: ");
		double a = entrada.nextDouble();

		System.out.print("b: ");
		double b = entrada.nextDouble();

		System.out.print("c: ");
		double c = entrada.nextDouble();
		
		boolean result = false;

		if(c == b + 1 && b == a + 1) result = true;

		System.out.println("Son consecutivos: " + result);

		entrada.close();

	}

}
