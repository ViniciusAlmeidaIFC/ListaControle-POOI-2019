package com;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double maior = 0, menor;
		System.out.println("Informe 3 n�meros!");
		System.out.print("Primeiro N�mero: ");
		double num1 = entrada.nextDouble();
		System.out.print("Segundo N�mero: ");
		double num2 = entrada.nextDouble();
		System.out.print("Terceiro N�mero: ");
		double num3 = entrada.nextDouble();
		
		maior = num1;
		menor = num1;
		
		if (num2 > maior)
			maior = num2;
		else if (num2 < menor)
			menor = num2;
		else if (num3 > maior)
			maior = num3;
		else if (num3 < menor)
			menor = num3;
		
		System.out.println("O maior n�mero �: "+maior+", o menor n�mero �: "+menor);
		entrada.close();
	

	}

}
