package listasdeexercicios3;
/*Fa�a um programa que pe�a um n�mero inteiro e determine se ele �
ou n�o um n�mero primo. Um n�mero primo � aquele que � divis�vel
somente por ele mesmo e por 1.*/
import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Entre com um numero  inteiro pra saber se ele e primo: ");
		int num = scan.nextInt();
		
		boolean primo = true;
		
		for (int i=2; i<num; i++){
			if (num % i == 0){
				System.out.println("N�o � primo - divisivel po " + i);
				primo =false;
			}
		}
		
		if (primo){
			System.out.println("� numero primo ");
		}
		
	}

}
