package accenturebank.com.accentureBank.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import accenturebank.com.accentureBank.entities.Extrato;

public interface ExtratoRepository extends JpaRepository<Extrato, Integer> {

	
}