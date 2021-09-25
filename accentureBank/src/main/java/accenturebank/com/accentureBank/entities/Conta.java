package accenturebank.com.accentureBank.entities;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@MappedSuperclass
public class Conta implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private String numeroConta;
	
	@OneToOne
    @JoinColumn(name = "cliente_id", unique = true)
	private Cliente cliente;
	
	@OneToMany
    @JoinColumn(name = "extrato_id", unique = true)
	private Extrato extrato;
	
	@ManyToOne
	@JoinColumn(name = "agencia_id")
	private Agencia agencia;
	
	public Conta() {
	}

	public Conta(Agencia agencia, String numeroConta, Cliente cliente) {
		super();
		this.agencia = agencia;
		this.numeroConta = numeroConta;
		this.cliente = cliente;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Agencia getContaCorrenteAgencia() {
		return agencia;
	}

	public void setContaCorrenteAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

	public String getNumeroConta() {
		return this.numeroConta;
	}

	public void setContaCorrenteNumero(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(ClienteFisico cliente) {
		this.cliente = cliente;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
}
