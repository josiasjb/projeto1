package listadeexercicios1;

import java.util.Scanner;

//Faça um programa que peça o tamanho de um arquivo para download (em MB) e a 
//velocidade de um link de Internet (em Mbps), calcule e informe o tempo aproximado 
//de download do arquivo usando este link (em minutos).
public class Exercicio14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite o tamanho do arquivo: ");
        double tamanho = scan.nextDouble();
        
        System.out.println("Velocidade de um link de internet: ");
        double velocidade = scan.nextDouble();
        
        double tempo = tamanho / velocidade;
        
        System.out.println("tempo aproximado de download do arquivo: " + tempo);

        
        
        
        
	}

}
