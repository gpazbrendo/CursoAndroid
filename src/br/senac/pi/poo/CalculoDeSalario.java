package br.senac.pi.poo;

import java.util.Scanner;

public class CalculoDeSalario {

	public static void main(String[] args){
		System.out.print("Quantidade de Funcionario: ");
        Scanner s = new Scanner(System.in);
        int funcionario = s.nextInt();
        
        
        double salarioTotal = 0;
        
        for (int i = 1; i <= funcionario ; i++) {
        	System.out.print("Salario de Funcionario: " + i + " : ");
        	Scanner valor = new Scanner(System.in);
            double salario = valor.nextDouble();
            salarioTotal = salarioTotal + salario;
        }
    	System.out.println("Salario total: " + salarioTotal);
    	System.out.println("Media :" + salarioTotal / funcionario);
	}
}