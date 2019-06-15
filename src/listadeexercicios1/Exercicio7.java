package listadeexercicios1;
//Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Entre com a area de um quadrado");
		
		double lado = scan.nextDouble();
		
		double area =  Math.pow(lado, 2);
		
		System.out.println("A area do quadrado é: " + area);
		System.out.println("O dobro desta area é: " + (area * 2));
	}

}
