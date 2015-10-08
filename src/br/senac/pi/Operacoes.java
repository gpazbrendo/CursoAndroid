package br.senac.pi;

public class Operacoes {

	public static void main(String[] args) {
		String nome = "Gilvan";
		String sobrenome = "Paz";
		
		System.out.println("Nome Completo:" + nome + sobrenome);
		
		System.out.println("----------------------------------");
		
		int idade = 42;
		boolean brasileiro = true;
		
		System.out.println("Idade:" + idade);
		if (brasileiro) {
			System.out.println("Brasileiro:" + "sim");
		}
		System.out.println("----------------------------------");
		System.out.println("Operação matematica");
		int n1 = 10;
		int n2 = 5;
		//Saida formatada com intercalação de valores
		System.out.printf("A soma entre %d e %d é: " ,n1 , n2);
		System.out.println(n1+n2);
		System.out.printf("A multiplicação entre %d e %d é: " ,n1 ,n2);
		System.out.println(n1*n2);
		System.out.printf("A subtração entre %d e %d é: " ,n1 , n2);
		System.out.println(n1-n2);
		System.out.printf("A divisão entre %d e %d é: " , n1 , n2);
		System.out.println(n1/n2);
		System.out.printf("o resto da divisão entre %d e %d é: " , n1 , n2);
		System.out.println(n1%n2);
		//Procedência de avaliação de operadores
		System.out.println((n1 + n2) * 5);
	}

}
