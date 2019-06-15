package listasdeexercicios3;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		boolean loginSucesso =  false;
		String login;
		String senha;
		
		do{
		
		System.out.println("Entre com o login: ");
	    login = scan.next();
		
		System.out.println("Entre com a senha: ");
		senha = scan.next();
		
		
		if (login.equalsIgnoreCase(senha)){
			//loginSucesso = false;
			System.out.println("Senha igual a usuario digite novamente. ");

		} else {
			loginSucesso = true;
			System.out.println("login e senha validos. ");

		}
		}while (!loginSucesso);
}

}