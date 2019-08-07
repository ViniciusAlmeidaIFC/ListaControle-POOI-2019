package com;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num = 0;
		do {
			System.out.print("Informe um número menor que 1000: ");
			num = entrada.nextInt();
		} while (num > 1000 || num <= 0);
		int d100 = 0;
		int d10 = 0;
		int d1 = 0;
		int d100mod = 0;
		int d10mod = 0;
		if (num >= 100) {
			d100 = num / 100;
			d100mod = num % 100;

			if (d100mod >= 10) {
				d10 = d100mod / 10;
				d10mod = d100mod % 10;

				if (d10mod >= 1)
					d1 = d10mod / 1;
			} else {
				d1 = d100mod / 1;
			}
		} else {
			if (num >= 10) {
				d10 = num / 10;
				d10mod = num % 10;

				if (d10mod >= 1)
					d1 = d10mod / 1;
			} else {
				d1 = num / 1;
			}
		}

		System.out.print(num + " = ");
		if (d100 >= 1 && d10 >= 1 && d1 >= 1) {
			if (d100 > 1)
				System.out.print(d100 + " centenas, ");
			else {
				if (d100 == 1)
					System.out.print(d100 + " centena, ");
			}
			if (d10 > 1)
				System.out.print(d10 + " dezenas e ");
			else {
				if (d10 == 1)
					System.out.print(d10 + " dezena e ");
			}
			if (d1 > 1)
				System.out.print(d1 + " unidades");
			else {
				if (d1 == 1)
					System.out.print(d1 + " unidade ");
			}
		} else {
			if (d10 >= 1 && d1 >= 1) {
				if (d10 > 1)
					System.out.print(d10 + " dezenas e ");
				else {
					if (d10 == 1)
						System.out.print(d10 + " dezena e ");
				}
				if (d1 > 1)
					System.out.print(d1 + " unidades");
				else {
					if (d1 == 1)
						System.out.print(d1 + " unidade ");
				}
			} else {
				if (d100 >= 1 && d1 >= 1) {
					if (d100 > 1)
						System.out.print(d100 + " centenas e ");
					else {
						if (d100 == 1)
							System.out.print(d100 + " centena e ");
					}
					if (d1 > 1)
						System.out.print(d1 + " unidades");
					else {
						if (d1 == 1)
							System.out.print(d1 + " unidade ");
					}
				} else {
					if (d100 >= 1 && d10 >= 1) {
						if (d100 > 1)
							System.out.print(d100 + " centenas e ");
						else {
							if (d100 == 1)
								System.out.print(d100 + " centena e ");
						}
						if (d10 > 1)
							System.out.print(d10 + " dezenas ");
						else {
							if (d10 == 1)
								System.out.print(d10 + " dezena");
						}
					} else {
						if (d1 >= 1) {
							if (d1 > 1)
								System.out.print(d1 + " unidades");
							else {
								if (d1 == 1)
									System.out.print(d1 + " unidade ");
							}
						} else {
							if (d10 >= 1) {
								if (d10 > 1)
									System.out.print(d10 + " dezenas ");
								else {
									if (d10 == 1)
										System.out.print(d10 + " dezena ");
								}
							} else {
								if (d100 > 1)
									System.out.print(d100 + " centenas ");
								else {
									if (d100 == 1)
										System.out.print(d100 + " centena ");
								}
							}
						}
					}
				}
			}
		}
		entrada.close();

	}

}
