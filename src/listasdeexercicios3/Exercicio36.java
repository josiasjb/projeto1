package listasdeexercicios3;

import java.util.Scanner;

public class Exercicio36 {

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