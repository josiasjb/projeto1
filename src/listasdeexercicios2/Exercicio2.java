package listasdeexercicios2;

/*Fa�a um Programa que pe�a um valor e mostre na tela se 
  o valor � positivo ou negativo.*/

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite o valor: ");
		double valor = scan.nextDouble();
		
		if (valor > 0){
			System.out.println("Positivo ");
			
		} else if (valor == 0){
			System.out.println("Nem positivo nem negativo e 0 ");
			
		}else{
			System.out.println("Negativo ");
		}
		
	}  

}
