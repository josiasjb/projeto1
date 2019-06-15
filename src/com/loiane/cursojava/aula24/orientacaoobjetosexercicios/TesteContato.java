package com.loiane.cursojava.aula24.orientacaoobjetosexercicios;

import java.util.Date;

public class TesteContato {

	public static void main(String[] args) {
		
		Contato contato = new Contato();
		
		contato.nome = "josias";
		contato.apelido = "Branco";
		
		contato.telefones =  new String[5];
		contato.telefones[0] = "(34) 99669-7226";
		contato.telefones[1] = "(34) 99669-7227";
		contato.telefones[2] = "(34) 99669-7228";
		
		contato.email = "josiasjb05@gmail.com";
		contato.dataContato = new Date();
		contato.anotacoes = "Aprendendo java";
		
		System.out.println();
	}

}
