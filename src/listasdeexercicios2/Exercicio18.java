package listasdeexercicios2;

import java.util.Scanner;

/*
 * Fa�a um Programa que pe�a um n�mero inteiro e determine se ele �
par ou impar. Dica: utilize o operador m�dulo (resto da divis�o).*/

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
