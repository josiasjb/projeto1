package listasdeexercicios6.aula252627;
/*
 * Escreva uma classe para representar uma lampada.Desenvolva m�todos
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
		    	System.out.println("L�mpada est� ligada ");
		    }else {
		    	    System.out.println("L�mpada est� desligada");

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

