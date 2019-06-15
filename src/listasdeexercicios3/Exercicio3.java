package listasdeexercicios3;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		boolean infoValida = false;
		String nome;
		int idade;
		double salario;
		String sexo;
		String estCivil;
		
		do {
		
		System.out.println("Entre como nome (acima de 3 letras):  ");
		nome = scan.next();
		
		if (nome.length() >+ 3){
			infoValida = true;
		} else{ 
			System.out.println("Nome precisa no minimo 3 caracteres." );
		}
	   } while (!infoValida);
		
		
		infoValida = false;
		do {
			
			System.out.println("Entre com a idade:  ");
			idade = scan.nextInt();
			
			if (idade >= 0 && idade <= 150){
				infoValida = true;
			} else{ 
				System.out.println("Idade precisa ser um numero de 0 a 150." );
			}
		   } while (!infoValida);
		
		
		infoValida = false;
		do {
			
			System.out.println("Entre com o salario:  ");
			salario = scan.nextDouble();
			
			if (salario > 0){
				infoValida = true;
			} else{ 
				System.out.println("Salario tem que ser maior que zero." );
			}
		   } while (!infoValida);
		
		
		infoValida = false;
		do {
			
			System.out.println("Entre com sexo (F - M):  ");
			sexo = scan.next();
			
			if (sexo.equalsIgnoreCase("f") ||
					sexo.equalsIgnoreCase("m")){
				infoValida = true;
			} else{ 
				System.out.println("Sexo precisa ser 'm' ou 'f'." );
			}
		   } while (!infoValida);
		
		
		
		infoValida = false;
		do {
			
			System.out.println("Estado civil (s, c, d, v):  ");
			estCivil = scan.next();
			
			if (estCivil.equalsIgnoreCase("s") ||
					estCivil.equalsIgnoreCase("c") ||
					estCivil.equalsIgnoreCase("d") ||
					estCivil.equalsIgnoreCase("v")){
				infoValida = true;
			} else{ 
				System.out.println("Estado civil precisa ser 's', 'c', 'd', 'v'." );
			}
		   } while (!infoValida);
		
		System.out.println("Nome " + nome);
		System.out.println("Idade " + idade);
		System.out.println("Salario " + salario);
		System.out.println("Sexo " + sexo);
		System.out.println("Estado Civil " + estCivil);
		}
  }
