package listasdeexercicios4;

import java.util.Scanner;

/*
 * Ler um vetor A com 20 elementos. Separar os elementos pares e
�mpares de A utilizando apenas um vetor extra B. Sugest�o: no in�cio
do vetor B armazene os elementos pares de A e nas posi��es
restantes do vetor B armazene os elementos de A que s�o �mpares.
 */
public class Exercicio31 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		int[] vetorA = new int[20];
		int[] vetorB = new int[vetorA.length];//pares e impares
		
		for (int i=0; i<vetorA.length; i++){
			System.out.println("Entre com o valor da posi�ao de A: " + i);
			vetorA[i] = scan.nextInt();
		}
		
		int posB = 0;
		
		for (int i=0; i<vetorA.length; i++){
			
			if (vetorA[i] % 2 == 0){
				vetorB[posB] = vetorA[i];
				posB++;
			}
		}
		
		for (int i=0; i<vetorA.length; i++){
			
			if (vetorA[i] % 2 != 0){
				vetorB[posB] = vetorA[i];
				posB++;
			}
		}
		System.out.print("Vetor A = ");
		for (int i=0; i<vetorA.length; i++){
			System.out.print(vetorA[i] + " ");
		}
		System.out.println(); 
		
		System.out.print("Vetor B = ");
		for (int i=0; i<posB; i++){
			System.out.print(vetorB[i] + " ");
		}
		System.out.println();
	}
}

