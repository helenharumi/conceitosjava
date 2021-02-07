package br.com.helenharumi.conceitosjava;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Listas {

	public static void main(String[] args) {
		Integer[] numeros = { 1, 3, 2, 7, 5, 9, 10 };
		var listas = Arrays.asList(numeros);

		Collections.sort(listas);
		System.out.println("Lista ordenada: " + listas);

		Collections.reverse(listas);
		System.out.println("Lista reversa: " + listas);

		var novaLista = listas.stream().filter(valor -> valor > 2 && valor < 10).collect(Collectors.toList());
		System.out.println("Lista Filtrada entre 2 a 9: " + novaLista);
		
		var novaListaOrdenada = novaLista.stream().sorted().collect(Collectors.toList());
		System.out.println("Lista Filtrada e ordenada" + novaListaOrdenada);
	}

}
