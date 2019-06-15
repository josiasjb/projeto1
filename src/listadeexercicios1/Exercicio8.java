package listadeexercicios1;
//Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. 
//Calcule e mostre o total do seu salário no referido mês.

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		
		System.out.println("Quanto você ganha por hora: " );
		double valorHora = scan.nextDouble();
		
        System.out.println("E o numero de horas trabalhadas no mês: "  );
        double horasMes = scan.nextDouble();
		
		double salario = valorHora * horasMes;
        
		
		System.out.println("O salario deste mes é:  " + salario);
		
		
		
	}

}
