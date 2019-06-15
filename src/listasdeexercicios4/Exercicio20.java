package listasdeexercicios4;

import java.util.Scanner;

/*
 * Implementar um programa que obtenha a cotação do dólar (U$) em
relação ao real (R$) e a seguir armazene em vetor A com 20
elementos as seguintes conversões:
 */
public class Exercicio20 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		double vetorA[] = new double[20];
		double cotaçao;
		
		
			
			System.out.println("Entre co acotaçao do dolar:");
			cotaçao = scan.nextDouble();
			
			for(int i=0; i<vetorA.length; i++){
				vetorA[i] = cotaçao * (i+1);
				
			}
			 System.out.print("Vetor A = ");
              for (int i=0; i<vetorA.length; i++){
      	     System.out.print(vetorA[i] + " ");
            }
             System.out.println();
			
		}

}

