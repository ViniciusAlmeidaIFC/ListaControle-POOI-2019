package com;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe tr�s valores para formar um tri�ngulo");
		System.out.print("Primeiro: ");
		double um = entrada.nextDouble();
		System.out.print("Segundo: ");
		double dois = entrada.nextDouble();
		System.out.print("Terceiro: ");
		double tres = entrada.nextDouble();
		
		if (((dois - tres) < um && um < (dois + tres)) && ((um - tres) < dois && dois < um + tres) && ((um - dois) < tres && tres < um + dois)) {
			System.out.println("Os valores: " +um+" + "+dois+" + "+tres+" podem formar um tri�ngulo");
			if (um == dois && dois == tres)
				System.out.println("Tri�ngulo Equil�tero");
			else 
				if (um == dois || um == tres || dois == tres)
					System.out.println("Tri�gulo Is�sceles");
				else 
					System.out.println("Tri�ngulo Escaleno");
		}
		else {
			System.out.println("Os valores: " +um+" + "+dois+" + "+tres+" N�O podem formar um tri�ngulo");
		}
		
		entrada.close();

	}

}
