package com;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe um valor numérico: ");
		double num1 = entrada.nextDouble();
		if (num1 > 0)
			System.out.println("Positivo!");
		else if (num1 == 0)
			System.out.println("Zero!");
		else 
			System.out.println("Negativo!");
		entrada.close();

	}

}
