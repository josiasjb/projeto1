package listasdeexercicios2;

import java.util.Scanner;

/*As Organiza��es Tabajara resolveram dar um aumento de sal�rio aos
seus colaboradores e lhe contraram para desenvolver o programa que
calcular� os reajustes.
o Fa�a um programa que recebe o sal�rio de um colaborador e o
reajuste segundo o seguinte crit�rio, baseado no sal�rio atual:
o sal�rios at� R$ 280,00 (incluindo) : aumento de 20%
o sal�rios entre R$ 280,00 e R$ 700,00 : aumento de 15%
o sal�rios entre R$ 700,00 e R$ 1500,00 : aumento de 10%
o sal�rios de R$ 1500,00 em diante : aumento de 5% Ap�s o
aumento ser realizado, informe na tela:
o o sal�rio antes do reajuste;
o o percentual de aumento aplicado;
o o valor do aumento;
o o novo sal�rio, ap�s o aumento.*/

public class Exercicio11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu salario mensal: ");
		
		double salario =scan.nextDouble();
		double aumento1 = (salario * 20)/100;
		double aumento2 = (salario * 15)/100;
		double aumento3 = (salario * 10)/100;
		double aumento4 = (salario * 5)/100;
		double resultado1 = salario + aumento1;
		double resultado2 = salario + aumento2;
		double resultado3 = salario + aumento3;
		double resultado4 = salario + aumento4;
		double reajuste = aumento4 ;
		
		if(salario <= 280 ){
			System.out.println("Seu salario atual e: " + resultado1 );
		}else if (salario == 280 && 280 <= 700){
			System.out.println("Seu salario atual e: " + resultado2 );
		}else if  (salario >= 700 && 700 <= 1500){
			System.out.println("Seu salario atual e: " + resultado3 );
		}else if (salario > 1500){
			System.out.println(" O sal�rio antes do reajuste e: " + salario + " mais 5% reajuste no valor de: " + reajuste + " salario apos o aumento e de: " + resultado4 );
		
		}
	}

}
