package accenturebank.com.accentureBank.entities;

import javax.persistence.Entity;

@Entity
public class ContaCorrente extends Conta {

	public ContaCorrente(Agencia agencia,String numeroConta,Cliente cliente){
		
		super(agencia,numeroConta,cliente);
		
	}
	
	
	
	
}
