package com;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe a primeira idade:");
		int i1 = entrada.nextInt();
		System.out.print("Informe a segunda idade:");
		int i2 = entrada.nextInt();
		System.out.print("Informe a terceira idade:");
		int i3 = entrada.nextInt();
		
		double media = (i1 + i2 + i3) / 3;
		if(media < 25)
			System.out.println("Turma Jovem");
		else 
			if(media <= 40)
				System.out.println("Turma adulta");
			else 
				System.out.println("Turma idosa");
			
		entrada.close();

	}

}
