package com.loiane.cursojava.aula27.metodoscomparametro;

import com.loiane.cursojava.aula27.metodoscomparametro.Carro;

public class TesteCarro {

	public static void main(String[] args) {

		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		
		van.exibirAutonomia();
		
		double autonomia = van.obterAutonomia();
		System.out.println("A autonomia do carro �: " + autonomia);
		System.out.println("A autonomia do carro �: " + van.obterAutonomia());
	
	    double qtdCombustivel10 = van.calcularcombustivel(10);
	    double qtdCombustivel15 = van.calcularcombustivel(15);
	    
	    System.out.println("qtdCombustivel10 = " + qtdCombustivel10);
	    System.out.println("qtdCombustivel15 = " + qtdCombustivel15);
	    
	}

}

