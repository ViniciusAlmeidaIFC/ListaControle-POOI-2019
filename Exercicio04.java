package com;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe um ano: ");
		int ano = entrada.nextInt();
		if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0)
			System.out.println("� um ano bissexto!");
		else 
			System.out.println("N�o � um ano bissexto");
		
		entrada.close();

	}

}