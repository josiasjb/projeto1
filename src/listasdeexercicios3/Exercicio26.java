package listasdeexercicios3;

import java.util.Scanner;

/*Fa�a um programa que calcule o fatorial de um n�mero inteiro
fornecido pelo usu�rio. Ex.: 5!=5.4.3.2.1=120. A sa�da deve ser
conforme o exemplo abaixo:
o Fatorial de: 5
o 5! = 5 . 4 . 3 . 2 . 1 = 120*/

public class Exercicio26 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Entre com numero inteiro:");
		int num = scan.nextInt();
		
		System.out.println("Fatorial de " + num);
		
		System.out.print(num + "! = ");
		
		int fatorial = 1;
		for (int i=num; i>1; i--){
			fatorial *= i;
			System.out.print(i + " . ");
		}
		
		System.out.println(" 1 =  " + fatorial);
	}

}
