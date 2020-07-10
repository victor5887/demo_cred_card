package com.demo.cred_card.persistence.model;

import javax.persistence.*;

@Entity
public class Proposta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    //@RestResource(path = "cliente", rel="clientes")
    @OneToOne//(mappedBy = "cliente")
    @JoinColumn(name = "idcliente" )
    private Cliente cliente;

    @Column(nullable = false)
    private String resultadoAnalise;

    @Column
    private String limiteCreditoCliente;

    @Column(nullable = false)
    private Integer valorCredito;

    public Proposta() {
        super();
    }

    public Proposta(Cliente cliente, String resultadoAnalise, String limiteCreditoCliente, Integer valorCredito) {
        super();
        this.cliente = cliente;
        this.resultadoAnalise = resultadoAnalise;
        this.limiteCreditoCliente = limiteCreditoCliente;
        this.valorCredito = valorCredito;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getResultadoAnalise() {
        return resultadoAnalise;
    }

    public void setResultadoAnalise(String resultadoAnalise) {
        this.resultadoAnalise = resultadoAnalise;
    }

    public String getLimiteCreditoCliente() {
        return limiteCreditoCliente;
    }

    public void setLimiteCreditoCliente(String limiteCreditoCliente) {
        this.limiteCreditoCliente = limiteCreditoCliente;
    }

    public Integer getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(Integer valorCredito) {
        this.valorCredito = valorCredito;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cliente.getNome() == null) ? 0 : cliente.getNome().hashCode());
        result = prime * result + (int) (id ^ (id >>> 32));
        result = prime * result + ((cliente.getCpf() == null) ? 0 : cliente.getCpf().hashCode());
        return result;
    }


    @Override
    public String toString() {
        return "Proposta{" +
                "id=" + id +
                ", cliente=" + cliente.toString() +
                ", resultadoAnalise='" + resultadoAnalise + '\'' +
                ", limiteCreditoCliente='" + limiteCreditoCliente + '\'' +
                ", valorCredito=" + valorCredito +
                '}';
    }
}