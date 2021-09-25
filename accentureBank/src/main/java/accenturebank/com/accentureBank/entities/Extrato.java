package accenturebank.com.accentureBank.entities;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonFormat;

import accenturebank.com.accentureBank.entities.enums.TipoDeOperacao;


@Entity
public class Extrato implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm:ss", timezone = "GMT-3")
	private LocalDateTime dataHoraMovimento;
	
	private TipoDeOperacao operacao;
	
	
	public Extrato() {
	}

	public Extrato(LocalDateTime dataHoraMovimento, TipoDeOperacao operacao) {
		super();
		this.dataHoraMovimento = dataHoraMovimento;
		this.operacao = operacao;
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getDataHoraMovimento() {
		return dataHoraMovimento;
	}

	public void setDataHoraMovimento(LocalDateTime dataHoraMovimento) {
		this.dataHoraMovimento = dataHoraMovimento;
	}

	public TipoDeOperacao getOperacao() {
		return operacao;
	}

	public void setOperacao(TipoDeOperacao operacao) {
		this.operacao = operacao;
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
		Extrato other = (Extrato) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
}
