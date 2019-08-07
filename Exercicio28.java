package com;

import java.util.Scanner;

public class Exercicio28 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Primeiro n�mero: ");
		double n1 = entrada.nextDouble();
		System.out.print("Opera��o ( + | - | / | *): ");
		char sinal = entrada.next().charAt(0);
		System.out.print("Segundo n�mero: ");
		double n2 = entrada.nextDouble();
		
		double operacao = 0;
		switch(sinal) {
		case '-':
			operacao = n1 - n2;
			break;
		case '+':
			operacao = n1 + n2;
			break;
		case '/':
			operacao = n1 / n2;
			break;
		case '*':
			operacao = n1 * n2;
			break;
		default:
			operacao = 0;
		}
		
		if(operacao != 0) {
			System.out.println("O resultado da opera��o �: "+operacao);
			
			if (operacao % 2 == 0)
				System.out.println("O resultado � par");
			else {
				System.out.println("O resultado � impar");
			}
			
			if(operacao > 0)
				System.out.println("O resultado � positivo");
			else {
				if(operacao < 0)
					System.out.println("O resultado � negativo");
				else {
					System.out.println("O resultado � neutro");
				}
			}
			
			double verifica = Math.floor(operacao);
			if(operacao == verifica)
				System.out.println("O resultado � inteiro");
			else {
				System.out.println("O resultado � decimal");
			}
			
		}else {
			System.out.println("ERRO - Opera��o inv�lida!!!");
		}
		
		
		entrada.close();

	}

}
