package listasdeexercicios5;

import java.util.Random;

/*
 * Gere e imprima uma matriz M 4x4 com valores aleat�rios entre 0-
9. Ap�s isso determine o maior n�mero da matriz e a sua posi��o
(linha, coluna).
 */
public class Exercicio1 {

	public static void main(String[] args) {

		int[][] numerosAleatorios = new int[4][4];
		
		Random numeroRandom = new Random();
		
		for (int i=0; i<numerosAleatorios.length; i++){
			for (int j=0; j<numerosAleatorios[i].length; j++){
				numerosAleatorios[i][j] = numeroRandom.nextInt(100);
				
			}
		}
		
		int maior = 0;
		int linha = 0;
		int col = 0;
		for (int i=0; i<numerosAleatorios.length; i++){
			for (int j=0; j<numerosAleatorios[i].length; j++){
				if (numerosAleatorios[i][j] > maior){
					maior = numerosAleatorios[i][j];
					linha = i;
					col = j;
				}
			 }
		  }
		
		for (int i=0; i<numerosAleatorios.length; i++){
			for (int j=0; j<numerosAleatorios[i].length; j++){
			    System.out.print(numerosAleatorios[i][j] + " ");
			 }
			System.out.println();
		   }
		
		System.out.println("Maior valor = " + maior);
		System.out.println("linha = " + linha);
		System.out.println("Coluna = " + col);
	
		}
 	}


