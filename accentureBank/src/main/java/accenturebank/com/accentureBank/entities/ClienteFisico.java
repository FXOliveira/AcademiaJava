package accenturebank.com.accentureBank.entities;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class ClienteFisico extends Cliente {

	@Column
	private String cpf;
	
	public ClienteFisico(String nome,String fone,String cpf) {
		
		super(nome,fone);
		this.cpf = cpf;
		
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	
}
