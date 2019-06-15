package listasdeexercicios3;

/*
 * Faça um programa que peça dois números, base e expoente, calcule e
mostre o primeiro número elevado ao segundo número. Não utilize a
função de potência da linguagem.*/

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		int numBase, numExpoente;
		
		System.out.println(" Entre com numero base: ");
		numBase = scan.nextInt();
		
		System.out.println("Entre com numero expoente: ");
        numExpoente = scan.nextInt();
        
       int potencia = 1;
        int cont = 0;
        
        while (cont != numExpoente ) {
        	potencia = potencia * numBase;
        	cont = cont + 1;
        }
        
        System.out.println("Valor do primeiro numero elevado ao segundo e : " + numBase + " elevado " + numExpoente + " = " + potencia);
        		
	}		
        		
	}

