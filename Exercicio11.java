package com;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Em qual turno você estuda? Responda: M - Matutino / V - Vespertino / N - Noturno");
		char turno = entrada.next().toUpperCase().charAt(0);
		if (turno == 'M')
			System.out.println("Bom dia!");
		if ( turno == 'V')
			System.out.println("Boa tarde!");
		if (turno == 'N')
			System.out.println("Boa noite!");
		entrada.close();

	}

}
