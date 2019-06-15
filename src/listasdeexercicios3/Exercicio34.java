package listasdeexercicios3;

import java.util.Scanner;

/*Sendo H= 1 + 1/2 + 1/3 + 1/4 + ... + 1/N, Faça um programa que
calcule o valor de H com N termos.*/

public class Exercicio34 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Entre com o valor de N: ");
		int n = scan.nextInt();
		
		double soma = 0;
		
		for (int i=1; i<=n; i++){
			
			soma += 1/i;
			
			
		}	
			
			System.out.print("Soma = " + soma);
		
		
	}

}