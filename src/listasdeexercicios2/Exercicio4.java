package listasdeexercicios2;

import java.util.Scanner;

/*Fa�a um Programa que verifique se uma letra digitada � vogal ou
consoante.*/

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner scan =new Scanner(System.in);
		
		System.out.println("Digite uma letra ");
		String letra = scan.next();
		
		/*if(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || 
			letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || 
			letra.equalsIgnoreCase("u")){
			System.out.println("� uma vogal");
		}else{
			System.out.println("� uma consoante");
		}*/
		if (letra.length() > 1){
			System.out.println("N�o � uma letra v�lida");
			
		}else{
		switch(letra){
		case "a" :
		case "e" :
		case "i" :
		case "o" :
		case "u" :
		case "A" :
		case "E" :
		case "I" :
		case "O" :
		case "U" :
			System.out.println("� uma vogal");break;
			default: System.out.println("� uma consoante");
		}
	}

}
}
