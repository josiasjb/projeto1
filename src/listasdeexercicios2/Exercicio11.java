package listasdeexercicios2;

import java.util.Scanner;

/*As Organizações Tabajara resolveram dar um aumento de salário aos
seus colaboradores e lhe contraram para desenvolver o programa que
calculará os reajustes.
o Faça um programa que recebe o salário de um colaborador e o
reajuste segundo o seguinte critério, baseado no salário atual:
o salários até R$ 280,00 (incluindo) : aumento de 20%
o salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
o salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
o salários de R$ 1500,00 em diante : aumento de 5% Após o
aumento ser realizado, informe na tela:
o o salário antes do reajuste;
o o percentual de aumento aplicado;
o o valor do aumento;
o o novo salário, após o aumento.*/

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
			System.out.println(" O salário antes do reajuste e: " + salario + " mais 5% reajuste no valor de: " + reajuste + " salario apos o aumento e de: " + resultado4 );
		
		}
	}

}
