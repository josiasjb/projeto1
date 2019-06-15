package listasdeexercicios4;

import java.util.Scanner;

/*
 * Ler um vetor A com 20 elementos. Construir dois vetores B e C, sendo
que nos vetor B e C serão armazenados o valores pares e ímpares de
A, respectivamente.
 */
public class Exercicio30 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		int[] vetorA = new int[20];
		int[] vetorB = new int[vetorA.length];//pares
		int[] vetorC = new int[vetorA.length];//impares
		
		for (int i=0; i<vetorA.length; i++){
			System.out.println("Entre com a posiçao do vetor A: " + i);
			vetorA[i] = scan.nextInt();
		}
		
		int posB = 0;
		int posC = 0;
		
		for (int i=0; i<vetorA.length; i++){
			
			if(vetorA[i] % 2 == 0){
				vetorB[posB] = vetorA[i];
				posB++;
			} else {
				vetorC[posC] = vetorA[i];
				posC++;
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
		
		System.out.print("Vetor C = ");
		for (int i=0; i<posC; i++){
			System.out.print(vetorC[i] + " ");
		}
		System.out.println();
	}

}
