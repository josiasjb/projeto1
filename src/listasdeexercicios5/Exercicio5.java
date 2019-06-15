package listasdeexercicios5;

import java.util.Scanner;

/*
 * Modifique o programa anterior de maneira a guardar os
compromissos de todo o ano, organizados por m�s, dia e hora
(s� 8 horas por dia).
 */
public class Exercicio5 {

	public static void main(String[] args) {

		Scanner scan  = new Scanner (System.in);
		
		String[][][] compromissos = new String[12][31][8];
		
		boolean sair = false;
		byte op�ao;
		while (!sair){
			
			System.out.println("Digite 1 para adicionar compromisso.");
			System.out.println("Digite 2 para verificar compromisso.");
			System.out.println("Digite 0 para sair.");
			
			op�ao = scan.nextByte();
			
			if (op�ao == 1){//acionar compromisso
				
				boolean mesValido = false;
				int mes = 0;
				while (!mesValido){
					System.out.println("Entre com o m�s");
					mes = scan.nextInt();
					if (mes > 0 && mes <= 12){
						mesValido = true;
					} else {
						System.out.println("M�s invalido, digite novamente");
					}
				}
				
				boolean diaValido = false;
				int dia = 0;
				while (!diaValido){
					System.out.println("Entre com o dia do m�s");
					dia = scan.nextInt();
					if (dia > 0 && dia <= 31){
						diaValido = true;
					} else {
						System.out.println("Dia inv�lido, digite novamente");
					}
				}
				
				boolean horaValida = false;
				int hora = 0;
				while (!horaValida){
					System.out.println("Entre com a hora do m�s");
					hora = scan.nextInt();
					if (hora >= 0 && hora <= 8){
						horaValida = true;
					} else {
						System.out.println("Hora inv�lido, digite novamente");
					}
				}
				
				mes--;
				dia--;
				System.out.println("Digite compromisso");
				compromissos[mes][dia][hora] = scan.next();
				
			} else if (op�ao == 2){//verificar compromisso
				
				boolean mesValido = false;
				int mes = 0;
				while (!mesValido){
					System.out.println("Entre com o m�s");
					mes = scan.nextInt();
					if (mes > 0 && mes <= 12){
						mesValido = true;
					} else {
						System.out.println("M�s invalido, digite novamente");
					}
				}
				
				boolean diaValido = false;
				int dia = 0;
				while (!diaValido){
					System.out.println("Entre com o dia do m�s");
					dia = scan.nextInt();
					if (dia > 0 && dia <= 31){
						diaValido = true;
					} else {
						System.out.println("Dia inv�lido, digite novamente");
					}
				}
				
				boolean horaValida = false;
				int hora = 0;
				while (!horaValida){
					System.out.println("Entre com a hora do m�s");
					hora = scan.nextInt();
					if (hora >= 0 && hora <= 24){
						horaValida = true;
					} else {
						System.out.println("Hora inv�lido, digite novamente");
					}
				}
				
				mes--;
				dia--;
				System.out.println("O compromisso agendado e:");
				System.out.println(compromissos[mes][dia][hora]);
				
			} else if (op�ao == 0){
				sair = true;
			} else {
				System.out.println("Op��o inv�lida, digite novamente");
			}
		}
		
	}

}