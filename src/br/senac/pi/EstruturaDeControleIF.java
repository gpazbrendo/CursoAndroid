package br.senac.pi;

public class EstruturaDeControleIF {

	public static void main(String[] args) {
		int idade = 17;
		if (idade >= 18) {
			System.out.println("Blz, pode entrar!");
		} else if (idade >= 17) {
			System.out.println("Pode entrar com acompanhanter");
		} else {
			System.out.println("Vai para casa dormir");
		}
		
		//Outra costrução com o IF
		
		boolean var = true;
		if(var){
			System.out.println("isto vai ser executado se for true.");
		} else {
			System.out.println("isto vai ser executado se for false.");
		}
	}
	

}
