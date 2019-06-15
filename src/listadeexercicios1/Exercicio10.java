package listadeexercicios1;

import java.util.Scanner;

//Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Farenheit.

public class Exercicio10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Informe a temperatura em graus Celsius");
		double c = scan.nextDouble();
		
		double grausFarenheit = (c * 1.8) + 32;
		
		System.out.println("Temperatura em graus " + c + "c é igual " + grausFarenheit + "grausFarenheit");
		
	}

} 

