package com;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe Dois N�meros!");
		System.out.print("Primeiro N�mero: ");
		double num1 = entrada.nextDouble();
		System.out.print("Segundo N�mero: ");
		double num2 = entrada.nextDouble();
		if (num1 > num2)
			System.out.println("O maior n�mero �: "+ num1);
		else if (num1 == num2)
			System.out.println("Os n�meros s�o iguais!!");
		else
			System.out.println("O maior n�mero �: "+ num2);
		entrada.close();

	}

}
