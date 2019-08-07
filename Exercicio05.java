package com;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe uma letra: ");
		char letra = entrada.next().toUpperCase().charAt(0);
		if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U')
			System.out.println("É Uma Vogal!");
		else 
			System.out.println("Não é Vogal!");
		entrada.close();

	}

}
