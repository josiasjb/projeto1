package listasdeexercicios2;

import java.util.Scanner;

//Fa�a um Programa que pe�a dois n�meros e imprima o maior deles.
public class Exercicio1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
        System.out.println("Digite o primeiro numero");
        int n1 = scan.nextInt();
        
        System.out.println("Digite o segundo numero");
        int n2 = scan.nextInt();
        
       if(n1 > n2){
    	   System.out.println("n1 � maoir que n2: " ); 
       
       } else if( n1 < n2){
    	   System.out.println("n2 � maoir que n1: " );
    	   
       }else if(n1 == n2){
    	   System.out.println("Sao iguais " );
    	   
       }
        
        
	}

}
