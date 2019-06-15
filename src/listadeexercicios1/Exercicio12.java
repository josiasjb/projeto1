package listadeexercicios1;

import java.util.Scanner;

//Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58

public class Exercicio12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Entre com a altura: ");
		float altura = scan.nextFloat();
		
		double pesoIdeal = (72.7 * altura) - 58;
		
		System.out.println("Com os dados da altura: " + altura + "O peso ideal é: " + pesoIdeal);
	    

	}

}
