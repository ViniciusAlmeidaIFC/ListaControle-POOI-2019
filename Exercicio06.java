package com;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe um número: ");
		int num = entrada.nextInt();
		if (num % 2 == 0) {
			System.out.println("Número Par: "+ num);
			num = num + 1;
			System.out.println("Novo número ímpar: "+ num);
		}
		else { 
			System.out.println("Número Ímpar: "+ num);
			num = num + 1;
			System.out.println("Novo número par: "+ num);
		}
		entrada.close();

	}

}
