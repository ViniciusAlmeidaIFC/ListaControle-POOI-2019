package com;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe um ano: ");
		int ano = entrada.nextInt();
		if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0)
			System.out.println("É um ano bissexto!");
		else 
			System.out.println("Não é um ano bissexto");
		
		entrada.close();

	}

}
