package listasdeexercicios2;

import java.util.Scanner;

/*Fa�a um Programa que leia 2 n�meros e em seguida pergunte ao
usu�rio qual opera��o ele deseja realizar. O resultado da opera��o
deve ser acompanhado de uma frase que diga se o n�mero �:
. par ou �mpar;
a. positivo ou negativo;*/

public class Exercicio19 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Entre com o primeiro numero: ");
		double num1 = scan.nextDouble();
		
		System.out.println("Entre com o segundo numero: ");
		double num2 = scan.nextDouble();
		
		System.out.println("Qual opera��o voce deseja? (+, -, *, /): ");
		String opera�ao = scan.next();
		
		double resultado = 0;
		boolean valida = true;
		
		switch(opera�ao){
		case "+" : resultado = num1 + num2; break;		
		case "-" : resultado = num1 - num2; break;	
		case "*" : resultado = num1 * num2; break;	
		case "/" : resultado = num1 / num2; break;
		default: 
			System.out.println("Opera�ao invalida"); 
		    valida = false;
		}
		
		if (valida){
			
			System.out.println("Resultado " + resultado);

		}
			
		if (resultado >=0){
			System.out.println("Resultado possitivo");
		} else {
			System.out.println("Resultado negativo");
		}
		
		if((resultado % 2) == 0){
			System.out.println("Resultado par");
		} else {
			System.out.println("Resultado impar");

		}
	}

}
