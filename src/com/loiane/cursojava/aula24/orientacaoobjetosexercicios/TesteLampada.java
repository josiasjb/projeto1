package com.loiane.cursojava.aula24.orientacaoobjetosexercicios;

public class TesteLampada {
	
	public static void main(String[] args) { 
		
	Lampada led = new Lampada();
	led.modelo = "A60";
	led.tensao = "Bivolt";
	led.garantiaMeses = 36;
	led.potencia = 7;
	led.cor = "Amarela";
	led.tipoLuz = "Amarela";
	led.tipoAbajur = true;
	
	led.tipos = new String[5];
	led.tipos[0] = "Abajur";
	led.tipos[1] = "Lampeões";
  }
}
