package com;

import java.util.Scanner;

public class Exercicio28 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Primeiro número: ");
		double n1 = entrada.nextDouble();
		System.out.print("Operação ( + | - | / | *): ");
		char sinal = entrada.next().charAt(0);
		System.out.print("Segundo número: ");
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
			System.out.println("O resultado da operação é: "+operacao);
			
			if (operacao % 2 == 0)
				System.out.println("O resultado é par");
			else {
				System.out.println("O resultado é impar");
			}
			
			if(operacao > 0)
				System.out.println("O resultado é positivo");
			else {
				if(operacao < 0)
					System.out.println("O resultado é negativo");
				else {
					System.out.println("O resultado é neutro");
				}
			}
			
			double verifica = Math.floor(operacao);
			if(operacao == verifica)
				System.out.println("O resultado é inteiro");
			else {
				System.out.println("O resultado é decimal");
			}
			
		}else {
			System.out.println("ERRO - Operação inválida!!!");
		}
		
		
		entrada.close();

	}

}
