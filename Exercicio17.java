package com;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe as duas notas do aluno na disciplina: ");
		System.out.print("Primeira Nota: ");
		double n1 = entrada.nextDouble();
		System.out.print("Segunda Nota: ");
		double n2 = entrada.nextDouble();

		double media = (n1 + n2) / 2;
		
		System.out.println("As notas do aluno são: ");
		System.out.println("Primeira nota: "+n1);
		System.out.println("Segunda nota: "+n2);
		System.out.println("A média do aluno é: " + media);
		
		if (media >= 9) {
			System.out.println("Conceito A");
			System.out.println("APROVADO");
			}
		else {
			if (media >= 7.5) {
				System.out.println("Conceito B");
				System.out.println("APROVADO");
			}
			else {
				if (media >= 6) {
					System.out.println("Conceito C");
					System.out.println("APROVADO");
				}
				else {
					if (media >= 4) {
						System.out.println("Conceito D");
						System.out.println("REPROVADO");
					}
					else {
						System.out.println("Conceito E");
						System.out.println("REPROVADO");
					}
				}
			}
		}

		entrada.close();

	}

}
