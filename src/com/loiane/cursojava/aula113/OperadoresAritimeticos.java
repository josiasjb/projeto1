package com.loiane.cursojava.aula113;

public class OperadoresAritimeticos {

	public static void main(String[] args) {
        
		int resultado = 1 + 2;
		System.out.println(resultado);
		
		resultado = resultado - 1;
		System.out.println(resultado);
		
		resultado = resultado * 2;
		System.out.println(resultado);

		resultado = resultado / 2;
		System.out.println(resultado);
		
		resultado = resultado + 8;
		System.out.println(resultado);

		resultado = resultado % 7;
		System.out.println(resultado);
		
		String primeiroNome = "Esta �";
		String segundoNome = " uma string concatenada.";
		String terceiroNome = primeiroNome + segundoNome;
		System.out.println(terceiroNome);

		resultado = resultado + 1;
		System.out.println(resultado);
		
		resultado++;
		System.out.println(resultado);
		
		//5
		System.out.println(resultado++);
		//mesma coisa que
		//System.out.println(resultado);
        //resultado = resultado + 1;
        //resultado += 1;

		System.out.println(++resultado);
		//mesma coisa que
		//resultdo =+ 1;
		//System.out.println(resultado);
		
		resultado --;
		System.out.println(resultado);

		
		System.out.println(resultado--);
		System.out.println(--resultado);

	}

}
