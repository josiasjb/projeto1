package listasdeexercicios3;

/*
 * Fa�a um programa que pe�a dois n�meros, base e expoente, calcule e
mostre o primeiro n�mero elevado ao segundo n�mero. N�o utilize a
fun��o de pot�ncia da linguagem.*/

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

