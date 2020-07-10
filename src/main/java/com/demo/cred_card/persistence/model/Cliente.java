package com.demo.cred_card.persistence.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false, unique = true)
    private String nome;

    @Column(nullable = false, unique = true)
    private Long cpf;

    @Column(nullable = false)
    private String sexo;

    @Column(nullable = false)
    private Integer idade;

    @Column(nullable = false)
    private String estadoCivil;

    @Column(nullable = false)
    private String uf;

    @Column(nullable = false)
    private Integer quantidadeDependentes;

    @Column(nullable = false)
    private Integer renda;

    public Cliente() {
        super();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }


    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public Cliente(String nome, Long cpf, String sexo, Integer idade, String estadoCivil, String uf, Integer quantidadeDependentes, Integer renda) {
        super();
        this.nome = nome;
        this.cpf = cpf;
        this.sexo = sexo;
        this.idade = idade;
        this.estadoCivil = estadoCivil;
        this.uf = uf;
        this.quantidadeDependentes = quantidadeDependentes;
        this.renda = renda;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return id == cliente.id &&
                nome.equals(cliente.nome) &&
                cpf.equals(cliente.cpf) &&
                sexo.equals(cliente.sexo) &&
                idade.equals(cliente.idade) &&
                estadoCivil.equals(cliente.estadoCivil) &&
                uf.equals(cliente.uf) &&
                quantidadeDependentes.equals(cliente.quantidadeDependentes) &&
                renda.equals(cliente.renda);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, cpf, sexo, idade, estadoCivil, uf, quantidadeDependentes, renda);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cpf=" + cpf +
                ", sexo='" + sexo + '\'' +
                ", idade=" + idade +
                ", estadoCivil='" + estadoCivil + '\'' +
                ", uf='" + uf + '\'' +
                ", quantidadeDependentes=" + quantidadeDependentes +
                ", renda=" + renda +
                '}';
    }


    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public Integer getQuantidadeDependentes() {
        return quantidadeDependentes;
    }

    public void setQuantidadeDependentes(Integer quantidadeDependentes) {
        this.quantidadeDependentes = quantidadeDependentes;
    }

    public Integer getRenda() {
        return renda;
    }

    public void setRenda(Integer renda) {
        this.renda = renda;
    }
}