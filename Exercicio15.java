package com;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.print("Informe o preço do produto:");
		double preco = entrada.nextDouble();
		System.out.print("Informe o código de origem do produto:");
		int cod = entrada.nextInt();
		
		switch(cod) {
		case 1:
			System.out.println("Preço: "+preco);
			System.out.println("Origem: Sul ");
			break;
		case 2:
			System.out.println("Preço: "+preco);
			System.out.println("Origem: Norte ");
			break;
		case 3:
			System.out.println("Preço: "+preco);
			System.out.println("Origem: Leste ");
			break;
		case 4:
			System.out.println("Preço: "+preco);
			System.out.println("Origem: Oeste ");
			break;
		case 5: case 6:
			System.out.println("Preço: "+preco);
			System.out.println("Origem: Nordeste ");
			break;
		case 7: case 8:
			System.out.println("Preço: "+preco);
			System.out.println("Origem: Centro-oeste ");
			break;
		default:
			System.out.println("Preço: "+preco);
			System.out.println("Origem: Produto importado ");
		}
		
		entrada.close();

	}

}
