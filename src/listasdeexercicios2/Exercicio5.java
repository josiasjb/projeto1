package listasdeexercicios2;

import java.util.Scanner;

/*Faça um programa para a leitura de duas notas parciais de um aluno.
O programa deve calcular a média alcançada por aluno e apresentar:
o A mensagem "Aprovado", se a média alcançada for maior ou
igual a sete;
o A mensagem "Reprovado", se a média for menor do que sete;
o A mensagem "Aprovado com Distinção", se a média for igual a
dez.*/

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		
		
		System.out.println("Digite a nota1 do aluno");
		double n1 = scan.nextDouble();
		
		System.out.println("Digite a nota2 do aluno");
		double n2 = scan.nextDouble();
		
		double media = (n1 + n2) /2;
		
			System.out.println("Média do aluno e " + media);
			
	 if (media == 10){
	    System.out.println("Aprovado com Distinção");
	   } else if (media >= 7){
		    System.out.println("Aprovado");
		} else {
		    System.out.println("Reprovado");

		}

		}
   }


