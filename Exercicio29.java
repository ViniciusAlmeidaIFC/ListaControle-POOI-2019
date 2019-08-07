package com;

import java.util.Scanner;

public class Exercicio29 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int tamanho = 5;
		char vetor[] = new char[tamanho];

		do {
			System.out.println("Telefonou para a vítima? (s - sim | n - não)");
			vetor[0] = entrada.next().charAt(0);
		} while (vetor[0] != 's' && vetor[0] != 'n');
		do {
			System.out.println("Esteve no local do crime? (s - sim | n - não)");
			vetor[1] = entrada.next().charAt(0);
		} while (vetor[1] != 's' && vetor[1] != 'n');
		do {
			System.out.println("Mora perto da vítima? (s - sim | n - não)");
			vetor[2] = entrada.next().charAt(0);
		} while (vetor[2] != 's' && vetor[2] != 'n');
		do {
			System.out.println("Devia para a vítima? (s - sim | n - não)");
			vetor[3] = entrada.next().charAt(0);
		} while (vetor[3] != 's' && vetor[3] != 'n');
		do {
			System.out.println("Já trabalhou com a vítima? (s - sim | n - não)");
			vetor[4] = entrada.next().charAt(0);
		} while (vetor[4] != 's' && vetor[4] != 'n');

		int contS = 0;
		for (int i = 0; i < tamanho; i++) {
			if (vetor[i] == 's')
				contS++;
		}

		if (contS == 2)
			System.out.println("Suspeito");
		else {
			if (contS == 3 || contS == 4) {
				System.out.println("Cúmplice");
			} else {
				if (contS == 5) {
					System.out.println("Assassino");
				} else {
					System.out.println("Inocente");
				}
			}
		}
		entrada.close();

	}

}
