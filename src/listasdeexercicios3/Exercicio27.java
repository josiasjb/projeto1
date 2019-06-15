package listasdeexercicios3;

import java.util.Scanner;

/*O Departamento Estadual de Meteorologia lhe contratou para
desenvolver um programa que leia as um conjunto indeterminado de
temperaturas, e informe ao final a menor e a maior temperaturas
informadas, bem como a média das temperaturas.*/

public class Exercicio27 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o numero de temperaturas ");
		int qtdTemperaturas=scan.nextInt();
		
		double temp;
		double soma = 0;
		double menor = Double.MAX_VALUE;
		double maior = Double.MIN_VALUE;
		
		for (int i=1; i<=qtdTemperaturas; i++){
			System.out.println("Informe a temperatura: " + i);
			temp = scan.nextDouble();
			
			soma += temp;
			
			if (temp > maior){
				maior = temp;
			}
			
			if (temp < menor){
				menor = temp;
				
			}
		}
		
		System.out.println("Media: " + (soma/qtdTemperaturas));
		System.out.println("Menor temperatura: " + menor);
		System.out.println("Maior temperatura: " + maior);
	}

}
