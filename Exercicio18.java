package com;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe três valores para formar um triângulo");
		System.out.print("Primeiro: ");
		double um = entrada.nextDouble();
		System.out.print("Segundo: ");
		double dois = entrada.nextDouble();
		System.out.print("Terceiro: ");
		double tres = entrada.nextDouble();
		
		if (((dois - tres) < um && um < (dois + tres)) && ((um - tres) < dois && dois < um + tres) && ((um - dois) < tres && tres < um + dois)) {
			System.out.println("Os valores: " +um+" + "+dois+" + "+tres+" podem formar um triângulo");
			if (um == dois && dois == tres)
				System.out.println("Triângulo Equilátero");
			else 
				if (um == dois || um == tres || dois == tres)
					System.out.println("Triâgulo Isósceles");
				else 
					System.out.println("Triângulo Escaleno");
		}
		else {
			System.out.println("Os valores: " +um+" + "+dois+" + "+tres+" NÃO podem formar um triângulo");
		}
		
		entrada.close();

	}

}
