package com;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe uma das letras F ou M: ");
		char letra = entrada.next().toUpperCase().charAt(0);
		if (letra == 'M')
			System.out.println("Masculino");
		else if (letra == 'F') 
			System.out.println("Feminino");
		else 
			System.out.println("Letra Errada!");
		entrada.close();
		

	}

}
