package listasdeexercicios4;

import java.util.Scanner;

/*
 * Criar um vetor A com 10 elementos inteiros. Implementar um programa
que defina e escreva a m�dia aritm�tica simples dos elementos
�mpares armazenados neste vetor.
 */
public class Exercicio14 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		int vetorA[] = new int [10];
		
		
		for (int i=0; i<vetorA.length; i++){
			System.out.println("Entre com a posi��o de: " + i);
			vetorA[i] = scan.nextInt();
		}
		int soma = 0;
		int qtdImpares = 0;
		
		for (int i=0; i<vetorA.length; i++){
			if(vetorA[i] % 2 != 0){
			soma +=vetorA[i];	
			qtdImpares++;
			
		}
	  }
	    System.out.print("vetor A = ");
	    for (int i=0; i<vetorA.length; i++){
	    	System.out.print(vetorA[i] + " ");
	    	
	    }
	    System.out.println();
	    
	    
	    System.out.println("Soma " + soma);
	    System.out.println("A media Aritimetica dos impares s�o: " + (soma/qtdImpares));
   }
}


