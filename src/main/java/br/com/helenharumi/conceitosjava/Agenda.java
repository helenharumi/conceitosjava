package br.com.helenharumi.conceitosjava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Agenda {

	public static void main(String[] args) {
		List<Contato> listaContato = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		var continuar = "S";
		do {
			var contato = solicitaContato();
			listaContato.add(contato);
			System.out.print("Deseja adicionar mais contatos, [S] ou [N]?");
			continuar = scanner.nextLine();
		} while (continuar.equalsIgnoreCase("S"));
		
		for (Contato c : listaContato) {
			System.out.println(c);
		}
	}

	public static Contato solicitaContato() {
		System.out.print("Digite o nome do contato: ");
		Scanner scanner = new Scanner(System.in);
		var nome = scanner.nextLine();

		System.out.print("Digite o telefone de contato: ");
		var telefone = scanner.nextInt();

		Contato contato = new Contato();
		contato.setNome(nome);
		contato.setTelefone(telefone);

		return contato;
	}
}

//escreva um programa que receba um nome e telefone e adicione os mesmos em uma lista e depois imprima os itens da lista