package listadeexercicios1;

import java.util.Scanner;

//Fa�a um Programa que pergunte quanto voc� ganha por hora e o n�mero de horas trabalhadas no m�s. Calcule e mostre o total do seu sal�rio no referido m�s, sabendo-se que s�o descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, fa�a um programa que nos d�:
//sal�rio bruto.
//quanto pagou ao INSS.
//quanto pagou ao sindicato.
//o sal�rio l�quido.
//calcule os descontos e o sal�rio l�quido, conforme a tabela abaixo:
//+ Sal�rio Bruto : R$
//- IR (11%) : R$
//- INSS (8%) : R$
//- Sindicato ( 5%) : R$
//= Sal�rio Liquido : R$
public class Exericio15 {

	

	public static void main(String[] args) {

    Scanner scan = new Scanner (System.in);
		
		
		System.out.println("Quanto voc� ganha por hora: " );
		double valorHora = scan.nextDouble();
		
        System.out.println("E o numero de horas trabalhadas no m�s: "  );
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
