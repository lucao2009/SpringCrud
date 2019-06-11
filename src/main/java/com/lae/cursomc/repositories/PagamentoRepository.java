package com.lae.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lae.cursomc.domain.Pagamento;

@Repository
public interface PagamentoRepository extends JpaRepository <Pagamento, Integer>{
	
}
