package listasdeexercicios3;

import java.util.Scanner;

/*Fa�a um programa que calcule o valor total investido por um
colecionador em sua cole��o de CDs e o valor m�dio gasto em cada
um deles. O usu�rio dever� informar a quantidade de CDs e o valor
para em cada um.*/

public class Exercicio22 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe  quantidade de cds");
		int QuantCds = scan.nextInt();
		
		double valorCds = 0;
		double soma = 0;
		
		for (int i=1;i<=QuantCds; i++){
			System.out.println("Entre com o valor dos Cds: " + i );
			valorCds = scan.nextDouble();
			
			soma += valorCds;
			
		}
		double media = soma / QuantCds; 

		System.out.println("O valor gasto em cada um dos Cds e: " + media);
	}
	

}
