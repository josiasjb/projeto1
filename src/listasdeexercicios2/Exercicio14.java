package listasdeexercicios2;

import java.util.Scanner;

/*Faça um programa que lê as duas notas parciais obtidas por um aluno
numa disciplina ao longo de um semestre, e calcule a sua média. A
atribuição de conceitos obedece à tabela abaixo:
o Média de Aproveitamento Conceito
o Entre 9.0 e 10.0 A
o Entre 7.5 e 9.0 B
o Entre 6.0 e 7.5 C   (n1 + n2) /2;
o Entre 4.0 e 6.0 D
o Entre 4.0 e zero E

O algoritmo deve mostrar na tela as notas, a média, o conceito
correspondente e a mensagem “APROVADO” se o conceito for
A, B ou C ou “REPROVADO” se o conceito for D ou E.
 */
public class Exercicio14 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Entre com a nota 1: ");
		double n1 = scan.nextDouble();
	
		System.out.println("Entre com a nota 2: ");
		double n2 = scan.nextDouble();
		
		double media = (n1 + n2) / 2;
		
		String aproveitamento = "";
		if(media >= 9.0  && media <= 10.0 ){
			aproveitamento = "A";
		}else if(media >= 7.5  && media < 9.0 ){
			aproveitamento = "B";
		}else if(media >= 6.0  && media < 7.5 ){
			aproveitamento = "C";
		}else if(media >= 4.0  && media < 6.0 ){
			aproveitamento = "D";
		}else if(media < 4.0  && media >= 0 ){
			aproveitamento = "E";
		}
			
			System.out.println("Sua primeira nota foi: " + n1 );
			System.out.println("Sua segunda nota foi: " + n2 );
			System.out.println("Sua media foi: " + media );
			System.out.println("Sua media foi: " + aproveitamento); 
					
		
				switch(aproveitamento){
			case "A":
			case "B":
			case "C":System.out.println("APROVADO");break;
			case "D":
			case "E":System.out.println("REPROVADO");break;
			
			
		}
	}
		
	}


