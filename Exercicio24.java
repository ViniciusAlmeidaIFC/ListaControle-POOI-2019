package com;

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe a primeira nota do aluno: ");
		double nota1 = entrada.nextFloat();
		System.out.print("Informe a segunda nota do aluno: ");
		double nota2 = entrada.nextFloat();
		System.out.print("Informe a terceira nota do aluno: ");
		double nota3 = entrada.nextFloat();
		
		double media = (nota1 + nota2 + nota3) / 3;
		if(media >= 7 && media != 10)
			System.out.println("Aprovado! Nota: "+media);
		else {
			if(media < 7)
				System.out.println("Reprovado! Nota: "+media);
			else {
				System.out.println("Aprovado com Distinção!");
			}
		}
		entrada.close();

	}

}
