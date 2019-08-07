package com;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe Dois Números!");
		System.out.print("Primeiro Número: ");
		double num1 = entrada.nextDouble();
		System.out.print("Segundo Número: ");
		double num2 = entrada.nextDouble();
		if (num1 > num2)
			System.out.println("O maior número é: "+ num1);
		else if (num1 == num2)
			System.out.println("Os números são iguais!!");
		else
			System.out.println("O maior número é: "+ num2);
		entrada.close();

	}

}
