package ej4;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("a: ");
		double a = entrada.nextDouble();

		System.out.print("b: ");
		double b = entrada.nextDouble();

		System.out.print("c: ");
		double c = entrada.nextDouble();

		double mayor = a;
		double medio = b;
		double menor = c;

		if(a > b && a > c) {
			if(b < c) {
				medio = c;
				menor = b;
			}
		}

		if(b > a && b > c) {
			mayor = b;
			if(a < c) {
				medio = c;
				menor = a;
			} else {
				medio = a;
			}
		}

		if(c > a && c > b) {
			mayor = c;
			if(b < a) {
				medio = a;
				menor = b;
			} else {
				menor = a;
			}
		}

		System.out.println("Mayor: " + mayor);
		System.out.println("Mediano: " + medio);
		System.out.println("Menor: " + menor);

		entrada.close();

	}

}
