package listasdeexercicios4;

import java.util.Scanner;

/*
 * Criar um vetor A com 10 elementos inteiros. Desenvolver um programa
que defina o percentual de elementos pares e ímpares,
respectivamente, armazenados neste vetor.
 */
public class Exercicio15 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		int vetorA[] = new int[10];
		
		for (int i=0; i<vetorA.length; i++){
			System.out.println("Entre co a posição de vetorA: " + i);
			vetorA[i] = scan.nextInt();
		}
		
		
		/*int qtdPares = 0;
		int qtdImpares = 0;
		
		for (int i=0; i<vetorA.length; i++){
			if (vetorA[i] % 2 == 0){
				qtdPares++;
				
				qtdPares += (qtdPares/100) * vetorA[i];
		}
		
		}
		for (int i=0; i<vetorA.length; i++){
			if (vetorA[i] % 2 != 0){
				qtdImpares++;
					
				qtdImpares += (qtdImpares/100) * vetorA[i];
		}
			
		}
		
		System.out.print("Valor A =");
		for (int i=0; i<vetorA.length; i++){
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		System.out.println("Percentual de elementos pares e: " + qtdPares +"%");
		System.out.println("Percentual de elementos impares e: " + qtdImpares +"%");
	 }*/
		
		int impar = 0;
		for (int i=0; i<vetorA.length; i++){
			if (vetorA[i] % 2 != 0){
				impar++;
			}
		} 
		
		int par = vetorA.length - impar;
		
		//vetorA.length - 100%
		//par           - x
		//= x*vetorA.length == par * 100
		//= x == (par * 100)/vetorA.length
	   double porcPar = (par * 100)/vetorA.length;
	   double porcImpar = 100 - porcPar;
	    
	    
	    System.out.print("Valor A =");
		for (int i=0; i<vetorA.length; i++){
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		System.out.println("Percentual de elementos pares e: " + porcPar +"%");
		System.out.println("Percentual de elementos impares e: " + porcImpar +"%");
   }
}





