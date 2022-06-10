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
public class Quadra {
    
    private int id;
    private int num_quadra;
    private String   tipo_quadra;
    private boolean coberta;
    private boolean arquibancada;
    private boolean banco;
    private float valor;
    private Date data_criacao;
    

    public Quadra(int id, int num_quadra, String tipo_quadra, boolean coberta, boolean arquibancada, boolean banco, float valor, Date data_criacao) {
        this.id = id;
        this.num_quadra = num_quadra;
        this.tipo_quadra = tipo_quadra;
        this.coberta = coberta;
        this.arquibancada = arquibancada;
        this.banco = banco;
        this.valor = valor;
        this.data_criacao = data_criacao;
                    
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

    public boolean isCoberta() {
        return coberta;
    }

    public void setCoberta(boolean coberta) {
        this.coberta = coberta;
    }

    public boolean isArquibancada() {
        return arquibancada;
    }

    public void setArquibancada(boolean arquibancada) {
        this.arquibancada = arquibancada;
    }

    public boolean isBanco() {
        return banco;
    }

    public void setBanco(boolean banco) {
        this.banco = banco;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Date getData_criacao() {
        return data_criacao;
    }

    public void setData_criacao(Date data_criacao) {
        this.data_criacao = data_criacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    
    
}
