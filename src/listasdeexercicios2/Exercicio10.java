package listasdeexercicios2;

/*.Faça um Programa que pergunte em que turno você estuda. Peça
para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a
mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor
Inválido!", conforme o caso.*/

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Qual turno voce estuda? (m = Matutino, v = Vesperino, n = Noturno): ");
		String opçao = scan.next();
		
		
		
		if(opçao.equalsIgnoreCase("m") || opçao.equalsIgnoreCase("M") ) {
				System.out.println("Bom dia josias " );
		}else 	if(opçao.equalsIgnoreCase("v") || opçao.equalsIgnoreCase("V") ) {
			System.out.println("Boa tarde josias " );
	    }else 	if(opçao.equalsIgnoreCase("n") || opçao.equalsIgnoreCase("N") ) {
			System.out.println("Boa noite josias " );
	}else{
		System.out.println("Valor Inválido!");
	}
		
	}

}
