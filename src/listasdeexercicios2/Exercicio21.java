package listasdeexercicios2;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
	
		System.out.println("Entre com a quantidade de litros comprados: ");
			double litro =scan.nextDouble();
					
			System.out.println("Qual combudtivel : (A -alcool )(G - gasolina) ");
			String tipo = scan.next();
			
			
			double precoGas = 2.5;
			double precoAlc = 1.9;
			int perceDesconto = 0;
			double total = 0;
			double totalDescontos = 0;
			
			
			if (tipo.equalsIgnoreCase("A")){
		    	
				if(litro <= 20){
					perceDesconto = 3;
				} else {
					perceDesconto = 5;
				}
				total = litro * precoAlc;
				

		    } else if (tipo.equalsIgnoreCase("G")){
		    	
		    	if(litro <= 20){
					perceDesconto = 4;
				} else {
					perceDesconto = 6;
				}
		    	total = litro * precoGas;
		    }
			
			totalDescontos = (total /100) *  perceDesconto;
			
			double precoAPagar = total -totalDescontos;
			
			System.out.println("Valor a ser pago: " + precoAPagar);	
			}
	

}
