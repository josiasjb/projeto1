package listasdeexercicios5;

import java.util.Scanner;

/*
 * Capture do teclado valores para preenchimento de uma matriz M
3x3. Ap�s a captura imprima a matriz criada e encontre a
quantidade de n�meros pares, a quantidade de n�meros �mpares.
 */
public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner scan =  new Scanner (System.in);
		
		int[][] numeros = new int[3][3];
		
		for (int i=0; i<numeros.length; i++){
			for (int j=0; j<numeros[i].length; j++){
				
			System.out.println("Entre com a posi��o da matriz M: [" + i + "," + j + "]");
			numeros[i][j] = scan.nextInt();
				
			}	
		}
		
		int qtdPares = 0;
		int qtdImpares = 0;
		for (int i=0; i<numeros.length; i++){
			for (int j=0; j<numeros[i].length; j++){
				
				if (numeros[i][j] % 2 == 0){
					qtdPares++;
			} else {
				qtdImpares++;
	      }
		}
	}
			
			for (int i=0; i<numeros.length; i++){
				for (int j=0; j<numeros[i].length; j++){
				    System.out.print(numeros[i][j] + " ");
				 }
				System.out.println();
		     }
			
			System.out.println("Pares = " + qtdPares);
			System.out.println("Impares = " + qtdImpares);
			}
        }
	


