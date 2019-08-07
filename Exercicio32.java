package com;

import java.util.Scanner;

public class Exercicio32 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o tipo de carne que voc� quer levar");
		System.out.println("(f - Fil� Duplo | a - Alcatra | p - Picanha)");
		char tipo = entrada.next().charAt(0);
		System.out.print("Informe a quantidade em kilogramas da carne que voc� quer levar: ");
		double qtd = entrada.nextFloat();
		System.out.print("A compra ser� feita com o cart�o Tabajara? (s - Sim | n - N�o): ");
		char cartao = entrada.next().charAt(0);

		double preco = 0;
		String tipoCarne = "";
		if (tipo == 'f') {
			tipoCarne = "Fil� Duplo";
			if (qtd <= 5) 
				preco = qtd * (float) 4.90;
			else 
				preco = qtd * (float) 5.80;
			
		} else {
			if (tipo == 'a') {
				tipoCarne = "Alcatra";
				if (qtd <= 5) {
					preco = qtd * 5.90;
				} else {
					preco = qtd * 6.80;
				}
			} else {
				if (tipo == 'p') {
					tipoCarne = "Picanha";
					if (qtd <= 5) {
						preco = qtd * 6.90;
					} else {
						preco = qtd * 7.80;
					}
				}
			}
		}
		int desconto = 0;
		String tipoPag = "";
		double precoDes = 0;
		if (cartao == 's') {
			precoDes = preco * 0.95;
			desconto = 5;
			tipoPag = "Cart�o Tabajara";
		}else {
			tipoPag = "Dinheiro";
			precoDes = preco;
		}

		System.out.println("          Hipermercado Tabajara       ");
		System.out.println("   Cupom Fiscal                       ");
		System.out.println("                                      ");
		System.out.println(" Tipo de carne: "+tipoCarne);
		System.out.println(" Quantidade: "+qtd+" Kg");
		System.out.println(" Pre�o total:  R$"+preco);
		System.out.println(" Tipo de pagamento: "+tipoPag);
		System.out.println(" Valor do desconto: "+desconto+" %");
		System.out.println(" Valor a pagar: R$"+precoDes);
		System.out.println("                                           ");
		System.out.println("      Agradecemos pela Pref�rencia         ");
		

		entrada.close();

	}

}
