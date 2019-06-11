package com.lae.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lae.cursomc.domain.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository <Cliente, Integer>{
	
}
