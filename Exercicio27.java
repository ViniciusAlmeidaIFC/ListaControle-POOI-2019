package com;

import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe um n�mero: ");
		double num = entrada.nextDouble();
		//Math.floor = sempre arredonda para baixo = 5.9 = 5.0
		double teste = Math.floor(num);
		if (num == teste)
			System.out.println("� inteiro!");
		else 
			System.out.println("� decimal!");
		
		entrada.close();

	}

}
