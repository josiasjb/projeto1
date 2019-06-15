package listasdeexercicios2;

import java.util.Scanner;

/*
 * Faça um Programa que peça um número inteiro e determine se ele é
par ou impar. Dica: utilize o operador módulo (resto da divisão).*/

public class Exercicio18 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Entre com o numero inteiro: " );
		int numero = scan.nextInt();
		
		if((numero % 2) == 0){
			System.out.println("Par " );

		}else{
			System.out.println("Impar" );

		}
	}

}
