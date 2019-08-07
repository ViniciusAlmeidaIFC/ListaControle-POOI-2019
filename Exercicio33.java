package com;

import java.util.Scanner;

public class Exercicio33 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		char resultado1 ='a', resultado2 ='a', resultado3 ='b', resultado4 ='b', resultado5='c',
			resultado6 ='c', resultado7 ='d', resultado8 ='d', resultado9 ='e', resultado10='e';
		
		char resposta1 =' ', resposta2 =' ', resposta3 =' ', resposta4 =' ', resposta5=' ',
				resposta6 =' ', resposta7 =' ', resposta8 =' ', resposta9 =' ', resposta10=' ';
		
		System.out.println("Prova de Múltipla escolha");
		System.out.println("Responda com a,b,c,d ou e");
		
		System.out.print("Resposta Questão 1: ");
		resposta1 = entrada.next().toLowerCase().charAt(0);
		
		System.out.print("Resposta Questão 2: ");
		resposta2 = entrada.next().toLowerCase().charAt(0);
		
		System.out.print("Resposta Questão 3: ");
		resposta3 = entrada.next().toLowerCase().charAt(0);
		
		System.out.print("Resposta Questão 4: ");
		resposta4 = entrada.next().toLowerCase().charAt(0);
		
		System.out.print("Resposta Questão 5: ");
		resposta5 = entrada.next().toLowerCase().charAt(0);
		
		System.out.print("Resposta Questão 6: ");
		resposta6 = entrada.next().toLowerCase().charAt(0);
		
		System.out.print("Resposta Questão 7: ");
		resposta7 = entrada.next().toLowerCase().charAt(0);
		
		System.out.print("Resposta Questão 8: ");
		resposta8 = entrada.next().toLowerCase().charAt(0);
		
		System.out.print("Resposta Questão 9: ");
		resposta9 = entrada.next().toLowerCase().charAt(0);
		
		System.out.print("Resposta Questão 10: ");
		resposta10 = entrada.next().toLowerCase().charAt(0);
		int contador = 0;
		
		if (resultado1 == resposta1) {
			System.out.println("Questão 1: "+resposta1+": Correta");
			contador = contador + 1;
		}
		else
			System.out.println("Questão 1: "+resposta1+ ": Errada: ("+resultado1+")");
		
		if (resultado2 == resposta2) {
			System.out.println("Questão 2: "+resposta2+": Correta");
			contador = contador + 1;
		}
		else
			System.out.println("Questão 2: "+resposta2+ ": Errada: ("+resultado2+")");
		
		if (resultado3 == resposta3) {
			System.out.println("Questão 3: "+resposta3+": Correta");
			contador = contador + 1;
		}
		else
			System.out.println("Questão 3: "+resposta3+ ": Errada: ("+resultado3+")");
		
		if (resultado4 == resposta4) {
			System.out.println("Questão 4: "+resposta4+": Correta");
			contador = contador + 1;
		}
		else
			System.out.println("Questão 4: "+resposta4+ ": Errada: ("+resultado4+")");
		
		if (resultado5 == resposta5) {
			System.out.println("Questão 5: "+resposta5+": Correta");
			contador = contador + 1;
		}
		else
			System.out.println("Questão 5: "+resposta5+ ": Errada: ("+resultado5+")");
		
		if (resultado6 == resposta6) {
			System.out.println("Questão 6: "+resposta6+": Correta");
			contador = contador + 1;
		}
		else
			System.out.println("Questão 6: "+resposta6+ ": Errada: ("+resultado6+")");
		
		if (resultado7 == resposta7) {
			System.out.println("Questão 7: "+resposta7+": Correta");
			contador = contador + 1;
		}
		else
			System.out.println("Questão 7: "+resposta7+ ": Errada: ("+resultado7+")");
		
		if (resultado8 == resposta8) {
			System.out.println("Questão 8: "+resposta8+": Correta");
			contador = contador + 1;
		}
		else
			System.out.println("Questão 8: "+resposta8+ ": Errada: ("+resultado8+")");
		
		if (resultado9 == resposta9) {
			System.out.println("Questão 9: "+resposta9+": Correta");
			contador = contador + 1;
		}
		else
			System.out.println("Questão 9: "+resposta9+ ": Errada: ("+resultado9+")");
		
		if (resultado10 == resposta10) {
			System.out.println("Questão 10: "+resposta10+": Correta");
			contador = contador + 1;
		}
		else
			System.out.println("Questão 10: "+resposta10+ ": Errada: ("+resultado10+")");
		
		System.out.println("Sua nota foi de: "+contador);
	
		entrada.close();
	}

}
