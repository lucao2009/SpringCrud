package com.lae.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lae.cursomc.domain.Cliente;
import com.lae.cursomc.domain.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository <Endereco, Integer>{
	
}
