package listasdeexercicios2;

import java.util.Scanner;

/*Fa�a um Programa que pe�a um n�mero correspondente a um
determinado ano e em seguida informe se este ano � ou n�o bissexto.
 * */
public class Exercicio17 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite o ano : ");
		int ano = scan.nextInt();
		
		if ((ano % 4 == 0 && ano %100 !=0) || ano % 400 == 0 ){
			System.out.println("O ano informado e Bissexto: " + ano);
			
		}else {
			
		}   System.out.println("O ano informado nao e Bissexto: " + ano);

	}

}
