package com.loiane.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		/*System.out.println("Digite seu nome completo:");
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome completo �: " + nomeCompleto);
		
		System.out.println("Digite seu primeiro nome completo:");
		String primeiroNome =scan.next();
		System.out.println("Seu primeiro nome �: " + primeiroNome);
		
		System.out.println("Digite sua idade:");
		int idade = scan.nextInt();
		System.out.println("Sua idade �: " + idade);
		
		System.out.println("Digite sua altura:");
		double altura = scan.nextDouble();
		System.out.println("A sua altura �: " + altura);*/
		
		System.out.println("Digite seu primeiro nome, idade, quantidadede filhos, altura e se tem bichinho de estima�ao");
	    String primeiroNome = scan.next();
	    int idade = scan.nextInt();
	    byte qdFilhos = scan.nextByte();
	    float altura = scan.nextFloat();
	    boolean temPet = scan.nextBoolean();
	    
	    System.out.println("Voc� digitou os seguintes valores:");
	    System.out.println("Nome: " + primeiroNome);
	    System.out.println("Idade: " + idade);
	    System.out.println("Quantidade de filhos" + qdFilhos);
	    System.out.println("Altura: " + altura);
	    System.out.println("Tem bichindo de estim��o: " + temPet);
	    

	    
	 }

}