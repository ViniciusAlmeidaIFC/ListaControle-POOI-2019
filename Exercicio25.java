package com;

import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int nota1 = 0;
		int nota2 = 0;
		int nota3 = 0;
		int nota4 = 0;
		int nota5 = 0;
		int resto1 = 0;
		int resto2 = 0;
		int resto3 = 0;
		int resto4 = 0;

		System.out.println("Informe o valor do saque (Mínimo: 10 | Máximo: 600): ");
		int valorsaque = entrada.nextInt();

		if ((valorsaque >= 10) && (valorsaque <= 600)) {

			nota1 = (int) (valorsaque / 100);
			resto1 = (int) (valorsaque % 100);
			nota2 = (int) (resto1 / 50);
			resto2 = (int) (resto1 % 50);
			nota3 = (int) resto2 / 10;
			resto3 = (int) resto2 % 10;
			nota4 = (int) resto3 / 5;
			resto4 = (int) resto3 % 5;
			nota5 = (int) resto4 / 1;

			System.out.println("Você receberá: ");
			if (nota1 > 0)
				System.out.println(nota1 + " notas de 100");
			if (nota2 > 0)
				System.out.println(nota2 + " notas de 50");
			if (nota3 > 0)
				System.out.println(nota3 + " notas de 10");
			if (nota4 > 0)
				System.out.println(nota4 + " notas de 5");
			if (nota5 > 0)
				System.out.println(nota5 + " notas de 1");

		} else {
			System.out.println("ERRO");
		}
		entrada.close();

	}

}
