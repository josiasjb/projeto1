package listasdeexercicios4;

import java.util.Scanner;

/*
 * Criar um vetor A com 10 elementos inteiros. Escrever um programa
que calcule e escreva: a) a soma de elementos armazenados neste
vetor que são inferiores a 15; b) a quantidade de elementos
armazenados no vetor que são iguais a 15; e c) a média dos
elementos armazenados no vetor que são superiores a 15.
 */
public class Exercicio16 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		int vetorA[] = new int[10];
		
		for (int i=0; i<vetorA.length; i++){
			System.out.println("Entre com o valor do vetarA: " +i);
			vetorA[i] = scan.nextInt();
		}
		int somaMenor15 = 0;
		int somaMaior15 = 0;
		int qtdMaior15 = 0;
		int igual15 = 0;
		
		for (int i=0; i<vetorA.length; i++){
			if (vetorA[i] == 15){
				igual15++;
			} else if (vetorA[i] <15){
			    somaMenor15 += vetorA[i];
			}else {
				qtdMaior15++;
				somaMaior15 += vetorA[i];
			}
		}
		System.out.print("vetor A = ");
		for (int i=0; i<vetorA.length; i++){
			System.out.print(vetorA[i] + " ");
		
		}
		System.out.println();
		
		System.out.println("Quantidade de numeros == 15: " + igual15);
		System.out.println("Soma de numeros < 15: " + somaMenor15);
		System.out.println("A média dos numeros > 15.: " + (somaMaior15/qtdMaior15));

	}

}
