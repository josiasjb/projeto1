package listasdeexercicios2;

import java.util.Scanner;

/*Faça um Programa que verifique 
se uma letra digitada é "F" ou "M".*/

public class Exercicio3 {

	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
        
		System.out.println("Digite a letra (f ou m)");
		String input = scan.next();
		
		if (input.equalsIgnoreCase("f")){
			System.out.println("f - feminino");
		}else if (input.equals("m")){
			System.out.println("m - masculino");
		}else{
			System.out.println("Sexo invalido");
		}
		
	}

}
