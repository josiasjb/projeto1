package listadeexercicios1;

import java.util.Scanner;

//Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
//salário bruto.
//quanto pagou ao INSS.
//quanto pagou ao sindicato.
//o salário líquido.
//calcule os descontos e o salário líquido, conforme a tabela abaixo:
//+ Salário Bruto : R$
//- IR (11%) : R$
//- INSS (8%) : R$
//- Sindicato ( 5%) : R$
//= Salário Liquido : R$
public class Exericio15 {

	

	public static void main(String[] args) {

    Scanner scan = new Scanner (System.in);
		
		
		System.out.println("Quanto você ganha por hora: " );
		double valorHora = scan.nextDouble();
		
        System.out.println("E o numero de horas trabalhadas no mês: "  );
        double horasMes = scan.nextDouble();
		
		double salarioBruto = valorHora * horasMes;
		double inss = (salarioBruto / 100) * 8;
		double sindicato = (salarioBruto / 100) * 5;
		double ir = (salarioBruto / 100) * 11;
		double totalDescontos = inss + sindicato +ir ;
		double salarioLiquido = salarioBruto - totalDescontos;
		
		System.out.println("O salario bruto:  " + salarioBruto);
		System.out.println("O inss:  " + inss);
		System.out.println("O ir:  " + ir);
		System.out.println("O totalDescontos:  " + totalDescontos);
		System.out.println("O sindicato:  " + sindicato);
		System.out.println("O salario liquido:  " + salarioLiquido);
		
	}

}
