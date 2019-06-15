package listasdeexercicios2;

import java.util.Scanner;

/*Faça um Programa que leia três números e mostre o maior e o menor
deles.*/

public class Exercicio7 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero");
		int v1 = scan.nextInt();
		
		System.out.println("Digite o segundo numero");
		int v2 = scan.nextInt();
		
		System.out.println("Digite o terceiro numero");
		int v3 = scan.nextInt();
		
		if (v1 >= v2 && v1 >= v3){
			System.out.println("O valor 2 e maior" + v1);
		}else if (v2 >= v1 && v2 >= v3){
			System.out.println("O valor 2 e maior" + v1);
	    }else if (v1 >= v2 && v1 >= v3){
			System.out.println("O valor 2 e maior" + v1);
        }else if (v1 <= v2 && v1 <= v3){
			System.out.println("O valor 2 e menor" + v1);
		}else if (v2 <= v1 && v2 <= v3){
			System.out.println("O valor 2 e menor" + v2);	
	    }else if (v1 <= v2 && v1 <= v3){
			System.out.println("O valor 2 e menor" + v3);
	}
}
}
