package listasdeexercicios2;

import java.util.Scanner;

/*Fa�a um programa para a leitura de duas notas parciais de um aluno.
O programa deve calcular a m�dia alcan�ada por aluno e apresentar:
o A mensagem "Aprovado", se a m�dia alcan�ada for maior ou
igual a sete;
o A mensagem "Reprovado", se a m�dia for menor do que sete;
o A mensagem "Aprovado com Distin��o", se a m�dia for igual a
dez.*/

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		
		
		System.out.println("Digite a nota1 do aluno");
		double n1 = scan.nextDouble();
		
		System.out.println("Digite a nota2 do aluno");
		double n2 = scan.nextDouble();
		
		double media = (n1 + n2) /2;
		
			System.out.println("M�dia do aluno e " + media);
			
	 if (media == 10){
	    System.out.println("Aprovado com Distin��o");
	   } else if (media >= 7){
		    System.out.println("Aprovado");
		} else {
		    System.out.println("Reprovado");

		}

		}
   }


