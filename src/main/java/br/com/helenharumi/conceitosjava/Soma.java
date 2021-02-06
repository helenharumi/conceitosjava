package br.com.helenharumi.conceitosjava;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		System.out.print("Digite um número: ");
		Scanner scanner = new Scanner(System.in);
		var num1 = scanner.nextInt();

		System.out.print("Digite outro número: ");
		var num2 = scanner.nextInt();

		var soma = num1 + num2;

		System.out.println("Seu resultado é :" + soma);

	}
}
