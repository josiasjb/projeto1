package listasdeexercicios3;
/*Fa�a um programa que calcule o fatorial de um n�mero inteiro
fornecido pelo usu�rio. Ex.: 5!=5.4.3.2.1=120*/
import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Entre com um numero inteiro:");
		int num = scan.nextInt();
		
		System.out.println("Fatorial de: " + num);
		System.out.println(num + "! = ");
		
		int fatorial = 1;
		for (int i=num; i>0; i--){
			fatorial *= i;
			System.out.println(i);
		}
		
		System.out.println("Resultado: " + fatorial);
	}

}
