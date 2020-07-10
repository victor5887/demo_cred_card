package com.demo.cred_card.persistence.repo;


import com.demo.cred_card.persistence.model.Cliente;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {
    List<Cliente> findByNome(String nome);

    Cliente findOneByCpf(Long cpf);

}