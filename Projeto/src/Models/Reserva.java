/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static java.util.Date.parse;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Positivo
 */
public class Reserva {
    
    private int id;
    private Cliente cliente;
    private int num_quadra;
    private Quadra descricao;
    private float valor;
    private Date data_reserva;
    private String hora_inicio;
    private String hora_fim;
    private String hora_entrada;
    private String hora_saida;
    private String tipo_reserva;

    public Reserva(int id, Cliente cliente, int num_quadra, Quadra descricao, float valor, String data_reserva, String hora_inicio, String hora_fim, String hora_entrada, String hora_saida, String tipo_reserva) {
        this.id = id;
        this.cliente = cliente;
        this.num_quadra = num_quadra;
        this.descricao = descricao;
        this.valor = valor;
        try {
            this.data_reserva = new SimpleDateFormat("dd/MM/yyyy").parse(data_reserva);
        } catch (ParseException ex) {
            Logger.getLogger(Reserva.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.hora_inicio = hora_inicio;
        this.hora_fim = hora_fim;
        this.hora_entrada = hora_entrada;;
        this.hora_saida = hora_saida;
        this.tipo_reserva = tipo_reserva;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Quadra getDescricao() {
        return descricao;
    }

    public void setDescricao(Quadra descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Date getData_reserva() {
        return data_reserva;
    }

    public void setData_reserva(Date data_reserva) {
        this.data_reserva = data_reserva;
    }

    public String getHora_inicio() {
        return hora_inicio;
    }

    public void setHora_inicio(String hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public String getHora_fim() {
        return hora_fim;
    }

    public void setHora_fim(String hora_fim) {
        this.hora_fim = hora_fim;
    }

    public String getHora_entrada() {
        return hora_entrada;
    }

    public void setHora_entrada(String hora_entrada) {
        this.hora_entrada = hora_entrada;
    }

    public String getHora_saida() {
        return hora_saida;
    }

    public void setHora_saida(String hora_saida) {
        this.hora_saida = hora_saida;
    }

    public String getTipo_reserva() {
        return tipo_reserva;
    }

    public void setTipo_reserva(String tipo_reserva) {
        this.tipo_reserva = tipo_reserva;
    }
    
    
    
    
    
}
