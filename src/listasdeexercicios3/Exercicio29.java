package listasdeexercicios3;

/*Encontrar n�meros primos � uma tarefa dif�cil. Fa�a um programa que
gera uma lista dos n�meros primos existentes entre 1 e um n�mero
inteiro informado pelo usu�rio.*/

import java.util.Scanner;

public class Exercicio29 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Entre com o numero");
		int num = scan.nextInt();
		
		boolean primo;
		
		for (int i=1; i<=num; i++){
			
			 primo = true;
			
			for (int j=2; j<i; j++){
				if (i % j == 0){
					//System.out.println("N�o � primo - divisivel po " + i);
					primo =false;
					//break;
				}
			}
			
			if (primo){
				System.out.println(i);
			}
		}
	}

}
 