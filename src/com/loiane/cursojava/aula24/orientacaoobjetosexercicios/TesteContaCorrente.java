package com.loiane.cursojava.aula24.orientacaoobjetosexercicios;

public class TesteContaCorrente {

	public static void main(String[] args) {

		ContaCorrente conta = new ContaCorrente();
		
		conta.numeroConta = "Aj051986";
		conta.agencia = "5342";
		conta.especial = true;
		conta.limiteEspecial = 4.000;
		conta.saldo = 3.000;
		
		
		System.out.println("Saldo da conta =  " + conta.numeroConta + " = " + conta.saldo);
		
	}

}
