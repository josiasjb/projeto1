package listadeexercicios1;

import java.util.Scanner;

//Fa�a um Programa que pe�a a temperatura em graus Celsius, transforme e mostre em graus Farenheit.

public class Exercicio10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Informe a temperatura em graus Celsius");
		double c = scan.nextDouble();
		
		double grausFarenheit = (c * 1.8) + 32;
		
		System.out.println("Temperatura em graus " + c + "c � igual " + grausFarenheit + "grausFarenheit");
		
	}

} 

