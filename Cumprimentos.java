package br.com.exercicioweb;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Cumprimentos {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		int horario = 0;

		while (true) {
			try {
				System.out.println("Digite a hora(inteira) agora: ");
				horario = leitura.nextInt();

				if (horario > 23) {
					System.out.println("Digite um número entre 00 a 23!");
					continue;
				}

				if (horario >= 00 && horario <= 11) {
					System.out.println("Bom dia!");
					break;

				} else if (horario >= 12 && horario <= 17) {
					System.out.println("Boa tarde!");
					break;

				} else if (horario >= 18 && horario <= 23) {
					System.out.println("Boa noite!");
					break;
				}
			} catch (InputMismatchException e) {
				System.out.println(e.getMessage());
				System.out.println("Digite um horário válido!");
				leitura.nextLine();
			}
		}
	}
}
