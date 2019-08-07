package com;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe os valores para uma equação de segundo grau: ");
		System.out.print("a: ");
		float a = entrada.nextFloat();
		if (a != 0) {
			System.out.print("b: ");
			float b = entrada.nextFloat();
			System.out.print("c: ");
			float c = entrada.nextFloat();
			float delta = (b * b) - 4 * a * c;
			float x1 = 0;
			float x2 = 0;
			if (delta > 0) {
				x1 = (-b + (float) Math.sqrt(delta)) / 2 * a;
				x2 = (-b - (float) Math.sqrt(delta)) / 2 * a;
				System.out.println("As duas raízes são: " + x1 + " e " + x2);
			} else {
				if (delta == 0) {
					x1 = (-b + (float) Math.sqrt(delta)) / 2 * a;
					System.out.println("Possui apenas uma raiz real, que é: "+x1);
				} else {
					System.out.println("Delta ficou negativo, a equação não possui raízes reais");
				}
			}
		} else {
			System.out.println("Quando 'a' é zero, não é uma equação de segundo grau!");
		}
		entrada.close();

	}

}
