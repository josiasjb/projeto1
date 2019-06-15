package listasdeexercicios4;

import java.util.Scanner;

/*
 * Ler as duas notas bimestrais para um conjunto de 10 alunos.
Armazenar as notas informadas em dois vetores �Nota1� e �Nota2� do
tipo real. Escreva um programa que calcule a m�dia aritm�tica simples
das notas informadas armazenando o resultado em um vetor �Result�
de mesmo tipo e tamanho. Ao mostrar os resultados exibir a situa��o
de cada aluno. Se a m�dia calculada for superior ou igual a 7 o aluno
estar� �aprovado�, caso contr�rio, a situa��o do aluno ser�
�reprovado�.
 */
public class Exercicio19 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		double[] notas1 = new double[10];
		double[] notas2 = new double[notas1.length];
		double[] resultados = new double[notas1.length];
		
		for (int i=0; i<notas1.length; i++){
			
			System.out.println("Entre com a nota 1 do aluno: " + (i+1));
			notas1[i] = scan.nextDouble();
			
			System.out.println("Entre com a nota 2 do aluno: " + (i+1));
			notas2[i] = scan.nextDouble();
			
			resultados[i] = (notas1[i] + notas2[i]) / 2;
		  }
          System.out.print("Notas 1 = ");
          for (int i=0; i<notas1.length; i++){
        	  System.out.print(notas1[i] + " ");
          }
          System.out.println();
          
          System.out.print("Notas 2 = ");
          for (int i=0; i<notas2.length; i++){
        	  System.out.print(notas2[i] + " ");
          }
          System.out.println();
          
          System.out.println("Resultados: ");
          for (int i=0; i<resultados.length; i++){
        	  
        	  if (resultados[i] >= 7){
        		  System.out.println(resultados[i] + " - Aprovado ");
        	  }else {
        		  System.out.println(resultados[i] + " - Reprovado ");
        	  }
          }
         
		
	}

}
