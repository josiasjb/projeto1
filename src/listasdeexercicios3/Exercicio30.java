package listasdeexercicios3;

import java.util.Scanner;

/*Desenvolva um programa que faça a tabuada de um número qualquer
inteiro que será digitado pelo usuário, mas a tabuada não deve
necessariamente iniciar em 1 e terminar em 10, o valor inicial e final
devem ser informados também pelo usuário, conforme exemplo
abaixo:
o Montar a tabuada de: 5
o Começar por: 4
o Terminar em: 7
o
o Vou montar a tabuada de 5 começando em 4 e terminando em 7:
o 5 X 4 = 20
o 5 X 5 = 25
o 5 X 6 = 30
o 5 X 7 = 35
Obs: Você deve verificar se o usuário não digitou o final menor
que o inicial.*/

public class Exercicio30 {

	public static void main(String[] args) {


		Scanner scan = new Scanner (System.in);
		
		
		
		System.out.println("Montar a tabuada de:");
		int tabuada = scan.nextInt();
		
		boolean invalido = true;
		int fim, comeco;
		
		do {
			
		System.out.println("Começar por:");
		 comeco = scan.nextInt();
		
		System.out.println("Terminar em::");
		 fim = scan.nextInt();
		
		if (fim < comeco){
			invalido = false;
			System.out.println("O fim tem que ser maior que o inicio");
		}
	
		} while (!invalido);
		
		System.out.println("Começar por: " + comeco);
		System.out.println("Terminar em: " + fim);
		System.out.println();

			System.out.println("Vou montar a tabuada de " + tabuada + 
					" começando em " + comeco + " e terminando em " + fim + ":");
			
			for (int i=comeco; i<=fim; i++){
				System.out.println(tabuada + " x " + i + " = " + (tabuada*i));
				
					
				}
				
			}
	}
	

