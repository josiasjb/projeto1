package listasdeexercicios2;

import java.util.Scanner;

/*Fa�a um programa que pergunte o pre�o de tr�s produtos e informe
qual produto voc� deve comprar, sabendo que a decis�o � sempre
pelo mais barato.*/

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("pre�o 1");
		double p1 = scan.nextDouble();
		
		System.out.println("pre�o 2");
		double p2 = scan.nextDouble();
		
		System.out.println("pre�o 2");
		double p3 = scan.nextDouble();
		
		if (p1 <= p2 && p1 <= p3 ){
			System.out.println("Esse e o produto mais barato: " + p1);
		}else if (p2 <= p1 && p2 <= p3 ){
			System.out.println("Esse e o produto mais barato: " + p2);
		}else if (p3 <= p1 && p2 <= p2 ){
			System.out.println("Esse e o produto mais barato: " + p3);
		} 
			
		
	}

}
