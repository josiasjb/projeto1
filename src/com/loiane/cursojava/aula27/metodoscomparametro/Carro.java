package com.loiane.cursojava.aula27.metodoscomparametro;

public class Carro {


	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	void exibirAutonomia() {
		System.out.println("A autonomia do carro �: " + capCombustivel * consumoCombustivel + " Km ");
	}
	
	double obterAutonomia(){
		
		System.out.println("M�todo obterAutonomia foi chamado.");
		
		return capCombustivel * consumoCombustivel;
		
	}
	
	double calcularcombustivel(double Km){
		
		double qtdCombutivel = Km/consumoCombustivel;
		
		return qtdCombutivel;
	}
}

