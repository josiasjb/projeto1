package listasdeexercicios2;

import java.util.Scanner;

/*Fa�a um Programa que leia tr�s n�meros e mostre-os em ordem
decrescente.*/

public class Exercicio9 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Mostre o numero 1: ");
		int n1 = scan.nextInt();

		System.out.println("Mostre o numero 2: ");
		int n2 = scan.nextInt();
		
		System.out.println("Mostre o numero 3: ");
		int n3 = scan.nextInt();
		
		if (n1 <= n2 && n1 <= n3 && n2 <= n3){
			//num1 � menor
			//num3 � maior
			//num1 < num2 < num3
			System.out.println("Resultado em ordem decrescente " + n3 + "-" + n2 + "-" + n1);
		}else if (n1 <= n2 && n1 <= n3 && n3 <= n2){
			//num1 � menor
			//num2 � maior
			//num1 < num3 < num2
			System.out.println("Resultado em ordem decrescente " + n2 + "-" + n3 + "-" + n1);
	    }else if (n2 <= n1 && n2 <= n3 && n1 <= n3){
	    	//num2 � menor
			//num3 � maior
			//num2 < num1 < num3
			System.out.println("Resultado em ordem decrescente " + n3 + "-" + n1 + "-" + n2);
	   }else if (n2 <= n1 && n2 <= n3 && n3 <= n1){
	    	//num2 � menor
			//num1 � maior
			//num2 < num3 < num1
			System.out.println("Resultado em ordem decrescente " + n1 + "-" + n3 + "-" + n2);
      }else if (n3 <= n1 && n3 <= n2 && n1 <= n2){
	    	//num3 � menor
			//num2 � maior
			//num3 < num1 < num2
			System.out.println("Resultado em ordem decrescente " + n2 + "-" + n1 + "-" + n3);
    }else if (n3 <= n1 && n3 <= n2 && n2 <= n1){
    	//num3 � menor
		//num1 � maior
		//num3 < num2 < num1
		System.out.println("Resultado em ordem decrescente " + n1 + "-" + n2 + "-" + n3);

}
  }
}
