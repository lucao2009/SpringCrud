package com.lae.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lae.cursomc.domain.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository <Pedido, Integer>{
	
}
