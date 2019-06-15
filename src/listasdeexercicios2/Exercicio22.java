package listasdeexercicios2;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a quantidade de (kg) de Morangos");
		double quantMorango = scan.nextDouble();
		
		System.out.println("Entre com a quantidade de (kg) de Maças");
		double quantMaças = scan.nextDouble();
	
		double precoKgMorango = 0;
		if(quantMorango <= 5 ){
			precoKgMorango = 2.5;
		} else {
			precoKgMorango = 2.2;
		}
		
		double precoKgMaca = 0;
		if(quantMaças <= 5 ){
			precoKgMaca = 1.8;
		} else {
			precoKgMaca = 1.5;
		}
		double precoTotalMorango = quantMorango * precoKgMorango;
		double precoTotalMaca = quantMaças * precoKgMaca;
		
		double precoParcial = precoKgMorango + precoKgMaca;
		double precoTotal = precoParcial;
		
		if ((quantMorango + quantMaças > 8) || precoParcial > 25 ){
			precoTotal = precoParcial - ((precoParcial / 100) *10);
			
		}
		
		System.out.println("Preco total = " + precoTotal);
			}
	
	
	
	
	}
	
	


