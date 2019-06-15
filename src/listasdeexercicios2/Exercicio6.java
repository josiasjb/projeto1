package listasdeexercicios2;

import java.util.Scanner;

//Faça um Programa que leia três números e mostre o maior deles.

public class Exercicio6 {

	public static void main(String[] args) {

		Scanner scan =  new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero");
		int v1 = scan.nextInt();
		
		System.out.println("Digite o segundo numero");
		int v2 = scan.nextInt();
		
		System.out.println("Digite o terceiro numero");
		int v3 = scan.nextInt();
		
		
		
		if (v1 >= v2 && v1 >= v3 ){
			System.out.println("o valor 1 e maior: " + v1 );
			
		}else if  (v2 >= v1 && v2 >= v3 ){
			System.out.println("o valor 2 e maior: " + v2);
			
		}else if  (v3 >= v1 && v3 >= v2 ){
			System.out.println("o valor 3 e maior: " + v3);
			
		}
		
	}

}
