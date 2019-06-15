package listasdeexercicios3;

/*Faça um programa que calcule o número médio de alunos por turma.
Para isto, peça a quantidade de turmas e a quantidade de alunos para
cada turma. As turmas não podem ter mais de 40 alunos.*/

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a quantidade de turmas: ");
		int quanTurma = scan.nextInt();
		
		int numAlunos;
		int soma = 0;
		boolean invalido = true;
		
		
		
		for (int i=1; i<=quanTurma; i++){
			
			invalido = true;
			do {
			System.out.println("Entre com a quantidade de alunos: " + i );
			numAlunos = scan.nextInt();
			
			if (numAlunos <= 40){
				invalido = false;
			} else {
				System.out.println("Numero de aluno ivalido digite novamente");
			}
		} while (invalido);
			soma += numAlunos;
			
		}
		
		
		
		double media = soma / quanTurma;
	
		System.out.println("Media de alunos: " + media);
	}

}
