package listasdeexercicios2;

import java.util.Scanner;

/*Fa�a um Programa que leia um n�mero e exiba o dia correspondente
da semana. (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve
aparecer valor inv�lido.*/

public class Exercicio13 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Didgite um numero da semana de (1 - 7): ");
		int diaSemana = scan.nextInt();
		
		switch(diaSemana){
		case 2:System.out.println("Segunda");break;
		case 3:System.out.println("Ter�a");break;
		case 4:System.out.println("Quarta");break;
		case 5:System.out.println("Quinta");break;
		case 6:System.out.println("sexta");break;
		case 7:System.out.println("sabado");break;
		case 1:System.out.println("Domingo");break;
		default: System.out.println("N�o � um dia da semana valido");
		}
	}

}
