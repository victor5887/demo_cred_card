package com.demo.cred_card.web;

import com.demo.cred_card.persistence.model.Cliente;
import com.demo.cred_card.persistence.repo.ClienteRepository;
import com.demo.cred_card.web.exception.ClienteIdMismatchException;
import com.demo.cred_card.web.exception.ClienteNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping
    public Iterable<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    @GetMapping("/nome/{clienteNome}")
    public List<Cliente> findByNome(@PathVariable String clienteNome) {
        return clienteRepository.findByNome(clienteNome);
    }

    @GetMapping("/{id}")
    public Cliente findOne(@PathVariable long id) {
        return clienteRepository.findById(id)
          .orElseThrow(ClienteNotFoundException::new);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente create(@RequestBody Cliente cliente) {
        Cliente cliente1 = clienteRepository.save(cliente);
        return cliente1;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        clienteRepository.findById(id)
          .orElseThrow(ClienteNotFoundException::new);
        clienteRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public Cliente updateCliente(@RequestBody Cliente cliente, @PathVariable long id) {
        if (cliente.getId() != id) {
            throw new ClienteIdMismatchException();
        }
        clienteRepository.findById(id)
          .orElseThrow(ClienteNotFoundException::new);
        return clienteRepository.save(cliente);
    }
}
