package listasdeexercicios3;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double popA;
		double popB;
		double taxaA;
		double taxaB;
		
				
		boolean valido = false;
		do{
			
			System.out.println("Entre com A popula��o A: ");
			popA = scan.nextDouble();
			
			if (popA > 0){
				valido = true;
			} else {
				System.out.println("Popula�ao A precisa ser maior que 0.");
			}
			
		}while (!valido);
			
			valido = false;
			do{
          
			System.out.println("Entre com a popula��o B: ");
			popB = scan.nextDouble();
			
			if (popB > 0){
				valido = true;
			} else {
				System.out.println("Popula�ao B precisa ser maior que 0.");
			}
			
		}while (!valido);
		
			valido = false;
			do {
				
				System.out.println("Entre com a taxa de crescimento da popula�ao A: ");
				taxaA = scan.nextDouble();
				
				if (taxaA > 0){
					valido = true;
				} else {
					System.out.println("Taxa de popula�ao A precisa ser maior que 0.");
				}
				
			}while (!valido);
			
			valido = false;
			do {
				
				System.out.println("Entre com a taxa de crescimento da popula�ao B: ");
				taxaB = scan.nextDouble();
				
				if (taxaB > 0){
					valido = true;
				} else {
					System.out.println("Taxa de popula�ao B precisa ser maior que 0.");
				}
				
			}while (!valido);
			
			int cont = 0;
			
					while(popA < popB){
			popA += (popA/100) * taxaA;
			popB += (popB/100) * taxaB;
			cont ++;
			
		}
		
		System.out.println("Popula��o A: " + popA);
		System.out.println("Popula��o B: " + popB);
		System.out.println("Qtd anos: " + cont);

	}

}




