4package br.senac.pi;

import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		
		System.out.println("Ola!"); //Mensagem inmicial
		System.out.print("Digite um numero: "); //Interage com o usuario
		Scanner s = new Scanner(System.in); //Prepara entrada de dados
		int valor = s.nextInt(); //Faz a leitura de dados
		System.out.println("Valor = " + valor); //Imprime o valor lido
		s.close(); //Libera recurso de entrada de dados

	}

}
