package listasdeexercicios6.aula252627;

public class ContaCorrente {
	String numeroConta;
	String agencia;
	boolean especial;
	double limiteEspecial;
	double valorEspecialUsado;
	double saldo;
	
	
	boolean realizarSaque(double quantiaASacar) {
		
		//tem saldo na conta
		if (saldo >= quantiaASacar){
			saldo -= quantiaASacar;
			return true;
		} else {//nao tem saldo
			if (especial) {
				//verificar se o limite especial tem saldo
				double limite = limiteEspecial + saldo;
				if (limite >= quantiaASacar){
					saldo -= quantiaASacar;
					return true;
				}else {
					return false;
				}
			} else {
				return false;// nao e especial e nao tem saldo suficiente
			}
		}
	}
	
	void depositar(double valorDepositado){
		
		saldo += valorDepositado;
	}
	
	void consultarSaldo(){
		System.out.println("Saldo atual da conta = " + saldo);
	}
	
	boolean verificarUsoChequeEspecial(){
		return saldo < 0;
	}

}