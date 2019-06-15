package listadeexercicios1;

import java.util.Scanner;

//Faça um Programa que peça a temperatura em graus Farenheit, transforme e mostre a temperatura em graus Celsius.
//C = (5 * (F-32) / 9).
public class Exercicio9 {

	public static void main(String[] args) {
        
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Qual a temperatura em graus Farenheit : ");	
	    double f  = scan.nextDouble();
	    
	    double grauCelsius = (5 * (f-32) / 9);
	    
	    System.out.println("Temperatura em : " + f + " f é igual " + grauCelsius + "grauCelsius");
	    
	}

}
