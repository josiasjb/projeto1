package listasdeexercicios3;

import java.text.DecimalFormat;
import java.util.Scanner;

/*Um funcion�rio de uma empresa recebe aumento salarial anualmente:
Sabe-se que:
. Esse funcion�rio foi contratado em 1995, com sal�rio inicial de
R$ 1.000,00;
a. Em 1996 recebeu aumento de 1,5% sobre seu sal�rio inicial;
b. A partir de 1997 (inclusive), os aumentos salariais sempre
correspondem ao dobro do percentual do ano anterior. Fa�a um
programa que determine o sal�rio atual desse funcion�rio. Ap�s
concluir isto, altere o programa permitindo que o usu�rio digite o
sal�rio inicial do funcion�rio.*/

public class Exercicio31 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		double salario = 1000; //95
		
		double percentual = 1.5; //96
		
		salario += (salario/100) * percentual; //96
		
		DecimalFormat format = new DecimalFormat("###,###.##");
		
		for (int i=1997; i<=2015; i++){
			
			percentual *=2;
			
			salario += (salario/100) * percentual;
			
			System.out.println(i + " = " + format.format(salario) + " - " + percentual + " % ");
		}
	}

}
