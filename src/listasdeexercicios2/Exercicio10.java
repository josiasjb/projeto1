package listasdeexercicios2;

/*.Fa�a um Programa que pergunte em que turno voc� estuda. Pe�a
para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a
mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor
Inv�lido!", conforme o caso.*/

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Qual turno voce estuda? (m = Matutino, v = Vesperino, n = Noturno): ");
		String op�ao = scan.next();
		
		
		
		if(op�ao.equalsIgnoreCase("m") || op�ao.equalsIgnoreCase("M") ) {
				System.out.println("Bom dia josias " );
		}else 	if(op�ao.equalsIgnoreCase("v") || op�ao.equalsIgnoreCase("V") ) {
			System.out.println("Boa tarde josias " );
	    }else 	if(op�ao.equalsIgnoreCase("n") || op�ao.equalsIgnoreCase("N") ) {
			System.out.println("Boa noite josias " );
	}else{
		System.out.println("Valor Inv�lido!");
	}
		
	}

}
