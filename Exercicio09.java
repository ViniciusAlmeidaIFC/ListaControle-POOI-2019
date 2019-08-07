package com;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double ideal;
		System.out.println("Vamos Calcular Seu Peso Ideal!");
		System.out.print("Informe sua altura em metros: ");
		double h = entrada.nextDouble();
		System.out.print("Informe seu peso: ");
		double peso = entrada.nextDouble();
		System.out.print("Informe seu sexo: F- Feminino M- Masculino ");
		char sexo = entrada.next().toUpperCase().charAt(0);
		
		if (sexo == 'M') {
			ideal = (72.7*h)-58;
			System.out.println("Altura de: "+h+"mts");
			System.out.println("Peso de: "+ peso+ "KG");
			System.out.println("Sexo: Masculino");
			System.out.println("Seu peso ideal é de: "+ ideal+"KG");
			if (peso > ideal)
				System.out.println("Acima do peso ideal!!");
			else if (peso < ideal)
				System.out.println("Abaixo do peso ideal!!");
			else 
				System.out.println("Está no peso ideal!!");
		}
		else {
			ideal = (62.1*h)-44.7;
			System.out.println("Altura de: "+h+"mts");
			System.out.println("Peso de: "+ peso+ "KG");
			System.out.println("Sexo: Feminino");
			System.out.println("Seu peso ideal é de: "+ ideal+"KG");
			if (peso > ideal)
				System.out.println("Acima do peso ideal!!");
			else if (peso < ideal)
				System.out.println("Abaixo do peso ideal!!");
			else 
				System.out.println("Está no peso ideal!!");
		}
		entrada.close();

	}

}
