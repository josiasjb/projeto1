package listadeexercicios1;
//Fa�a um Programa que converta metros para cent�metros

import java.util.Scanner;

public class Exercicio5 {

	 public static void main(String args[]){

		  Scanner scan = new Scanner(System.in);
		  
		  System.out.println("Entre com o valor em metros");
		  double metros = scan.nextDouble();
		  
		  double centimetros = metros * 100;
		  
		  System.out.println(metros + " metros e igual " + centimetros + " cm");
		  
	 }
	 
}

		  
