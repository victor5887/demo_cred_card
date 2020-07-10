package com.demo.cred_card.persistence.repo;

import com.demo.cred_card.persistence.model.Cliente;
import com.demo.cred_card.persistence.model.Proposta;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PropostaRepository extends CrudRepository<Proposta, Long> {

    List<Proposta> findByCliente(Cliente cliente);

}