package listasdeexercicios2;

import java.util.Scanner;

/*.Fa�a um Programa que pe�a os 3 lados de um tri�ngulo. O programa
dever� informar se os valores podem ser um tri�ngulo. Indique, caso
os lados formem um tri�ngulo, se o mesmo �: equil�tero, is�sceles ou
escaleno.
o Dicas:
o Tr�s lados formam um tri�ngulo quando a soma de quaisquer
dois lados for maior que o terceiro;
o Tri�ngulo Equil�tero: tr�s lados iguais;
o Tri�ngulo Is�sceles: quaisquer dois lados iguais;
o Tri�ngulo Escaleno: tr�s lados diferentes; */

public class Exercicio15 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Entre com lado 1");
		int lado1 = scan.nextInt();
		
		System.out.println("Entre com lado 2");
		int lado2 = scan.nextInt();
		
		System.out.println("Entre com lado 3");
		int lado3 = scan.nextInt();
		
		
		      if (((lado1 + lado2) > lado3) || 
		    		  ((lado1 + lado3) > lado2) ||
		    		  ((lado2 + lado3) > lado1)){
		    	  
		 if(lado1 == lado2 && lado1 == lado3 && lado2 == lado3){
		      System.out.println("Triangulo Equilatero"); 
		}else if (lado1 != lado2 && lado1 != lado3 && lado3 != lado2){
		      System.out.println("Triangulo Escaleno"); 
		}else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
		      System.out.println("Triangulo Isoceles"); 
		  }
		}  else {
		System.out.println("N�o forma um triangulo");
		
	}

  }
}

