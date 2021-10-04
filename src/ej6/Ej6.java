package ej6;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
		
		System.out.print("DNI: ");
		int DNI = entrada.nextInt();
		
		int numero_de_letra = DNI % 23;
		
		char letra = letras[numero_de_letra];

		System.out.println("Numero: " + numero_de_letra);
		System.out.println("Letra: " + letra);
		System.out.println("DNI completo: " + letra + DNI);

		entrada.close();
	}

}
