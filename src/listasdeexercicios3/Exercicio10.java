package listasdeexercicios3;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		int num1;
		int num2;
		
		System.out.println("Entre com prmeiro numero: ");
		num1 = scan.nextInt();
		
		System.out.println("Entre com segundo numero: ");
		num2 = scan.nextInt();
		
		for (int i=num1; i<=num2; i++){
			System.out.println(i);
		}
		
		}
	}


