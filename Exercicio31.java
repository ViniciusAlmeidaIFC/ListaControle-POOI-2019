package com;

import java.util.Scanner;

public class Exercicio31 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe a quantidade (Kg) de morangos adquiridos");
		double qtdMorangos = entrada.nextFloat();
		System.out.println("Informe a quantidade (Kg) de ma�as adquiridos");
		double qtdMacas = entrada.nextFloat();
		
		double qtdKg = qtdMorangos + qtdMacas;
		double preco = 0;
		if (qtdMorangos <= 5)
			preco = qtdMorangos * 2.50;
		else 
			preco = qtdMorangos * 2.20;
		
		if (qtdMacas <= 5)
			preco = preco + (qtdMacas * 1.80);
		else 
			preco = preco + (qtdMacas * 1.50);
		
		
		if (qtdKg > 8 || preco > 25)
			preco = preco * (float)0.90;
		
		System.out.println("O valor a ser pago pelo cliente � "+preco+" R$");
		
		entrada.close();

	}

}
