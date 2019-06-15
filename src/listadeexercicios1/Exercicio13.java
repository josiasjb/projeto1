package listadeexercicios1;

import java.util.Scanner;

//Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
//Para homens: (72.7*h) - 58
//Para mulheres: (62.1*h) - 44.7

public class Exercicio13 {

	public static void main(String[] args) {

		Scanner scan = new Scanner  (System.in);
		
		System.out.println("Entre com a altura do homem: ");
		double h = scan.nextDouble();
		
		double pesoIdeal = (72.7 * h) - 58;
		
		System.out.println("Seu peso ideal é: " + pesoIdeal + "kg");
		
		System.out.println("Entre com a altura da mulher: ");
		double m = scan.nextDouble();
		
		double pesIdeal = (62.1 * m) - 44.7;
		
		System.out.println("Seu peso ideal é: " + pesIdeal + "kg");
		
		
	
	}

}
