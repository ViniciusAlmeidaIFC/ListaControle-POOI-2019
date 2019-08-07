package com;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double maior = 0, menor;
		System.out.println("Informe 3 números!");
		System.out.print("Primeiro Número: ");
		double num1 = entrada.nextDouble();
		System.out.print("Segundo Número: ");
		double num2 = entrada.nextDouble();
		System.out.print("Terceiro Número: ");
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
		
		System.out.println("O maior número é: "+maior+", o menor número é: "+menor);
		entrada.close();
	

	}

}
