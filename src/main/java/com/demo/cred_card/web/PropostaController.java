package com.demo.cred_card.web;

import com.demo.cred_card.persistence.model.Proposta;
import com.demo.cred_card.persistence.repo.ClienteRepository;
import com.demo.cred_card.persistence.repo.PropostaRepository;
import com.demo.cred_card.web.exception.PropostaIdMismatchException;
import com.demo.cred_card.web.exception.PropostaNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/propostas")
public class PropostaController {

    @Autowired
    private PropostaRepository propostaRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping
    public Iterable<Proposta> findAll() {
        return propostaRepository.findAll();
    }

    @GetMapping("/clienteCpf/{clienteCpf}")
     public List<Proposta> findByClienteCpf(@PathVariable Long clienteCpf) {
        return propostaRepository.findByCliente(clienteRepository.findOneByCpf(clienteCpf));
    }

    @GetMapping("/{id}")
    public Proposta findOne(@PathVariable long id) {
        return propostaRepository.findById(id)
          .orElseThrow(PropostaNotFoundException::new);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Proposta create(@RequestBody Proposta proposta) {
        Proposta proposta1 = propostaRepository.save(proposta);
        return proposta1;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        propostaRepository.findById(id)
          .orElseThrow(PropostaNotFoundException::new);
        propostaRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public Proposta updateProposta(@RequestBody Proposta proposta, @PathVariable long id) {
        if (proposta.getId() != id) {
            throw new PropostaIdMismatchException();
        }
        propostaRepository.findById(id)
          .orElseThrow(PropostaNotFoundException::new);
        return propostaRepository.save(proposta);
    }
}
