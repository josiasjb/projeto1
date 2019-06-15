package listadeexercicios1;
//Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
import java.util.Scanner;

public class Exercicio6 {

		public static void main(String[] args){
		
	Scanner scan = new Scanner (System.in);
		
	System.out.println("Entre com o raio do círculo:");
	
	double raio = scan.nextDouble();
	
	double area = Math.PI * Math.pow(raio, 2);
	
	System.out.println("A área de um circulo é: " +area);
	
	}

}