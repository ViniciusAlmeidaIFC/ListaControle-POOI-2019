package com;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe as duas notas do aluno: ");
		System.out.print("Primeira nota: ");
		float n1 = entrada.nextFloat();
		System.out.print("Segunda nota: ");
		float n2 = entrada.nextFloat();

		float media = (n1 + n2) / 2;
		System.out.println("A média do aluno é: " + media);
		if (media < 7)
			System.out.println("Reprovado");
			else 
				System.out.println("Aprovado");
		
		entrada.close();
		}

	}
