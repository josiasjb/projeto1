package listadeexercicios1;
//Fa�a um Programa que calcule a �rea de um quadrado, em seguida mostre o dobro desta �rea para o usu�rio.

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Entre com a area de um quadrado");
		
		double lado = scan.nextDouble();
		
		double area =  Math.pow(lado, 2);
		
		System.out.println("A area do quadrado �: " + area);
		System.out.println("O dobro desta area �: " + (area * 2));
	}

}
