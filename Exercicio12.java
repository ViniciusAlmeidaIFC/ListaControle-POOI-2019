package com;

import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	System.out.print("Informe o salário do colaborador: R$");
	double salario = entrada.nextFloat();
	
	double percAumento = 0;
	if(salario <= 280)
		percAumento = 20;
	else 
		if(salario <= 700)
			percAumento = 15;
		else 
			if(salario <= 1500)
				percAumento = 10;
			else 
				percAumento = 5;
			
	double aumento = salario * ( percAumento / 100);
	double novoSalario = salario + aumento;
	System.out.println("Seu salário antes do reajute era: R$"+salario);
	System.out.println("O percentual de aumento aplicado foi de: "+percAumento+"%");
	System.out.println("O valor do aumento é: R$"+aumento);
	System.out.println("O novo salário é: R$"+novoSalario);
	entrada.close();
	}
}