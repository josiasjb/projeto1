package listasdeexercicios4;

import java.util.Scanner;

/*
 * Implementar um programa que obtenha a cota��o do d�lar (U$) em
rela��o ao real (R$) e a seguir armazene em vetor A com 20
elementos as seguintes convers�es:
 */
public class Exercicio20 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		double vetorA[] = new double[20];
		double cota�ao;
		
		
			
			System.out.println("Entre co acota�ao do dolar:");
			cota�ao = scan.nextDouble();
			
			for(int i=0; i<vetorA.length; i++){
				vetorA[i] = cota�ao * (i+1);
				
			}
			 System.out.print("Vetor A = ");
              for (int i=0; i<vetorA.length; i++){
      	     System.out.print(vetorA[i] + " ");
            }
             System.out.println();
			
		}

}

