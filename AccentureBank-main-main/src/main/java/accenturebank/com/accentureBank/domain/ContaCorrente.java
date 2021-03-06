package accenturebank.com.accentureBank.domain;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;



@Entity
public class ContaCorrente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "agencia_id")
	private Agencia agencia;

	@Column
	private String contaCorrenteNumero;

	@Column
	private double contaCorrenteSaldo;

	@OneToOne
	@JoinColumn(name = "cliente_id", unique = true)
	private Cliente cliente;

	public ContaCorrente() {
	}

	public ContaCorrente(Long id, Agencia agencia, String contaCorrenteNumero, double contaCorrenteSaldo,
			Cliente cliente) {
		super();
		this.id = id;
		this.agencia = agencia;
		this.contaCorrenteNumero = contaCorrenteNumero;
		this.contaCorrenteSaldo = contaCorrenteSaldo;
		this.cliente = cliente;
	}

	public ContaCorrente(Agencia agencia, String contaCorrenteNumero, double contaCorrenteSaldo, Cliente cliente) {
		super();
		this.agencia = agencia;
		this.contaCorrenteNumero = contaCorrenteNumero;
		this.contaCorrenteSaldo = contaCorrenteSaldo;
		this.cliente = cliente;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

	public String getContaCorrenteNumero() {
		return contaCorrenteNumero;
	}

	public void setContaCorrenteNumero(String contaCorrenteNumero) {
		this.contaCorrenteNumero = contaCorrenteNumero;
	}

	public double getContaCorrenteSaldo() {
		return contaCorrenteSaldo;
	}

	public void setContaCorrenteSaldo(double contaCorrenteSaldo) {
		this.contaCorrenteSaldo = contaCorrenteSaldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContaCorrente other = (ContaCorrente) obj;
		return Objects.equals(id, other.id);
	}

}