/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.Date;

/**
 *
 * @author Positivo
 */
public class PagamentoTela {
    
    private int id;
    private Cliente cpf;
    private Cliente cliente;
    private int num_quadra;
    private String tipo_quadra;
    private String duracao;
    private float valor_total;
    private Date data_criacao;
    private boolean pagto_efetuado;
    private String tipo_pagto;

    public PagamentoTela(int id, Cliente cpf, Cliente cliente, int num_quadra, String tipo_quadra, String duracao, float valor_total, Date data_criacao, boolean pagto_efetuado, String tipo_pagto) {
        this.id = id;
        this.cpf = cpf;
        this.cliente = cliente;
        this.num_quadra = num_quadra;
        this.tipo_quadra = tipo_quadra;
        this.duracao = duracao;
        this.valor_total = valor_total;
        this.data_criacao = data_criacao;
        this.pagto_efetuado = pagto_efetuado;
        this.tipo_pagto = tipo_pagto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCpf() {
        return cpf;
    }

    public void setCpf(Cliente cpf) {
        this.cpf = cpf;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getNum_quadra() {
        return num_quadra;
    }

    public void setNum_quadra(int num_quadra) {
        this.num_quadra = num_quadra;
    }

    public String getTipo_quadra() {
        return tipo_quadra;
    }

    public void setTipo_quadra(String tipo_quadra) {
        this.tipo_quadra = tipo_quadra;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public float getValor_total() {
        return valor_total;
    }

    public void setValor_total(float valor_total) {
        this.valor_total = valor_total;
    }

    public Date getData_criacao() {
        return data_criacao;
    }

    public void setData_criacao(Date data_criacao) {
        this.data_criacao = data_criacao;
    }

    public boolean isPagto_efetuado() {
        return pagto_efetuado;
    }

    public void setPagto_efetuado(boolean pagto_efetuado) {
        this.pagto_efetuado = pagto_efetuado;
    }

    public String getTipo_pagto() {
        return tipo_pagto;
    }

    public void setTipo_pagto(String tipo_pagto) {
        this.tipo_pagto = tipo_pagto;
    }
    
    
    
    
    
}
