package listasdeexercicios4;

import java.util.Scanner;

/*
 * Ler um vetor A com 10 elementos inteiros correspondentes as idades
de um grupo de pessoas. Escreva um programa que determine e
escreva a menor e a maior idades e suas respectivas posi��es.
 */
public class Exercicio18 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		int idades[] = new int[10];
		
		for (int i=0; i<idades.length; i++){
			System.out.println("Entre com a idade da pessoa: " +(i+1));
			idades[i] = scan.nextInt();
		}
		int menorIdade = idades[0];
		int indexMenor = 0;
		int maiorIdade = idades[0];
		int indexMaior = 0;
		
		for (int i=1; i<idades.length; i++){
			if(idades[i]>maiorIdade){
				maiorIdade = idades[i];
				indexMaior = i;
		    } else if(idades[i]<menorIdade){
		    	menorIdade = idades[i];
		    	indexMenor= i;
		    }
	    }
		System.out.print("Valor A = ");
		for (int i=0; i<idades.length; i++){
			System.out.print(idades[i] + " ");
		}
		System.out.println();
		
        System.out.println("Menor idade: " + menorIdade);
        System.out.println("Indice da menor idade: " + indexMenor);
        System.out.println("Maior idade: " + maiorIdade);
        System.out.println("Indice da maior idade: " + indexMaior);
     }
  }
