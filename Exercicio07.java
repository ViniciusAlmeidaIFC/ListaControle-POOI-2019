package com;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe 3 n�meros: ");
		System.out.print("Primeiro N�mero: ");
		double num1 = entrada.nextDouble();
		System.out.print("Segundo N�mero: ");
		double num2 = entrada.nextDouble();
		System.out.print("Terceiro N�mero: ");
		double num3 = entrada.nextDouble();
		if( ( num1 > num2 && num1 > num3 ) && ( num2 > num3 ) ) { 
		    System.out.println(num1);
		    System.out.println(num2);
		    System.out.println(num3);
		}
		else if( ( num1 > num2 && num1 > num3 ) && ( num3 > num2 ) ) { 
		    System.out.println(num1);
		    System.out.println(num3);
		    System.out.println (num2);
		}
		else if( ( num2 > num1 && num2 > num3 ) && ( num1 > num3 ) ) { 
		    System.out.println(num2);
		    System.out.println(num1);
		    System.out.println(num3);
		}
		else if( ( num2 > num1 && num2 > num3 ) && ( num3 > num1 ) ) { 
		    System.out.println(num2);
		    System.out.println(num3);
		    System.out.println(num1);
		}
		else if( ( num3 > num1 && num3 > num2 ) && ( num1 > num2 ) ) {
		    System.out.println(num3);
		    System.out.println(num1);
		    System.out.println(num2);
		}
		else {
		    System.out.println(num3);
		    System.out.println(num2);
		    System.out.println(num1);
		}
		entrada.close();

	}

}
