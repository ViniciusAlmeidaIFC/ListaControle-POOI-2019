package com;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe a quantidade de horas trabalhadas: ");
		float qtdHoras = entrada.nextFloat();
		System.out.print("Informe quanto você ganha por hora trabalhada: ");
		float precoHora = entrada.nextFloat();
		float salBruto = qtdHoras * precoHora;

		float ir = 0;
		if (salBruto <= 900)
			ir = 0;
		else 
			if (salBruto <= 1500)
				ir = 5;
			else 
				if (salBruto <= 2500)
					ir = 10;
				else 
					ir = 20;
		
		float imposto = 0;
		if (ir != 0)
			imposto = salBruto * (ir / 100);
		float INSS = salBruto * (float) 0.10;
		float sal = salBruto - (imposto + INSS);
		float fgts = salBruto * (float)0.11;
		float totalDescontos = INSS + imposto + fgts;
		System.out.println("Salário Bruto: (" + precoHora + " * " + qtdHoras + ") : R$ " + salBruto);
		System.out.println("(-) IR ("+ir+"%)               : R$ "+imposto);
		System.out.println("(-) INSS (10%)                : R$ "+INSS);
		System.out.println("FGTS (11%)                    : R$ "+fgts);
		System.out.println("Total de descontos            : R$ "+totalDescontos);
		System.out.println("Salário líquido               : R$ " + sal);
		
		entrada.close();

	}

}
