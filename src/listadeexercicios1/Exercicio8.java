package listadeexercicios1;
//Fa�a um Programa que pergunte quanto voc� ganha por hora e o n�mero de horas trabalhadas no m�s. 
//Calcule e mostre o total do seu sal�rio no referido m�s.

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		
		System.out.println("Quanto voc� ganha por hora: " );
		double valorHora = scan.nextDouble();
		
        System.out.println("E o numero de horas trabalhadas no m�s: "  );
        double horasMes = scan.nextDouble();
		
		double salario = valorHora * horasMes;
        
		
		System.out.println("O salario deste mes �:  " + salario);
		
		
		
	}

}
