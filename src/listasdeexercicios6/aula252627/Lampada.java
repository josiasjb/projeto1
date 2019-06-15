package listasdeexercicios6.aula252627;
/*
 * Escreva uma classe para representar uma lampada.Desenvolva métodos
 * para ligar,desligar a lampada.
 */
public class Lampada {

	String modelo;
	String tensao;
	int potencia;
	String cor;
	String tipoLuz;
	int garantiaMeses;
	String[] tipos;
	boolean tipoAbajur;
	boolean ligado;

	void ligar(){
		ligado= true;		
	}
	
	void desligar(){
		ligado = false;
	}
	
	void mostrarEstado(){
		   if (ligado){
		    	System.out.println("Lâmpada está ligada ");
		    }else {
		    	    System.out.println("Lâmpada está desligada");

	  }
		   
	}
	
	void mudarEstado(){
		if (ligado){
			desligar();
		} else {
			ligar();
		}
	}
}

