package com;

import java.util.Scanner;

public class Exercicio30 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe o número de litros vendidos: ");
		float qtd = entrada.nextFloat();
		char tipo = ' ';
		do {
			System.out.print("Informe o tipo de combustível (a - álcool | g - gasolina): ");
			tipo = entrada.next().charAt(0);
		}while(tipo != 'a' && tipo != 'g');
		
		float desconto = 0;
		float total = 0;
		if (tipo == 'a') {
			if (qtd <= 20) {
				desconto = (float)0.97;
			} else {
				desconto = (float)0.95;
			}
			total = (qtd * (float)1.90) * desconto;
		} else {
			if (qtd <= 20) {
				desconto = (float)0.96;
			}else {
				desconto = (float)0.94;
			}
			total = (qtd * (float)2.50) * desconto;
		}
		
		System.out.println("O valor a ser pago pelo cliente é: R$"+total);
		
		entrada.close();

	}

}
