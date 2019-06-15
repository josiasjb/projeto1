package listadeexercicios1;

import java.util.Scanner;

//Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
//o produto do dobro do primeiro com metade do segundo .
//a soma do triplo do primeiro com o terceiro.
//o terceiro elevado ao cubo.
public class Exercicio11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Entre com um numero inteiro ");
		int num1 = scan.nextInt();
		
		System.out.println("Entre com outro numero inteiro ");
        int num2 = scan.nextInt();
        
		System.out.println("Entre com um numero real ");
		double num3 = scan.nextDouble();
		
		System.out.println("Calcule e mostre: ");
		
		int result1 = (num1 * 2) * (num2 / 2) ;
		double result2 = (num1 * 3) + num3;
		double result3 = Math.pow(num3, 3);
		
		
		System.out.println("Resultado 1: " +result1);
		System.out.println("Resultado 1: " +result2);
		System.out.println("Resultado 1: " +result3);
	}

}
