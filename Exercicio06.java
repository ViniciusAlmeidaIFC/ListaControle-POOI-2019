package com;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe um n�mero: ");
		int num = entrada.nextInt();
		if (num % 2 == 0) {
			System.out.println("N�mero Par: "+ num);
			num = num + 1;
			System.out.println("Novo n�mero �mpar: "+ num);
		}
		else { 
			System.out.println("N�mero �mpar: "+ num);
			num = num + 1;
			System.out.println("Novo n�mero par: "+ num);
		}
		entrada.close();

	}

}
