package ej5;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("a: ");
		double a = entrada.nextDouble();

		System.out.print("b: ");
		double b = entrada.nextDouble();
		
		double result = a > b ? a - b : b - a;

		System.out.println("Result: " + result);

		entrada.close();
	}

}
