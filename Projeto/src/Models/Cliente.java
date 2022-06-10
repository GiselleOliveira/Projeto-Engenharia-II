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
public class Cliente extends Pessoa {
    
    private String cidade;

    public Cliente(String cidade, int id, String nome, String cpf, String telefone, String email, Date data_criacao) {
        super(id, nome, cpf, telefone, email, data_criacao);
        this.cidade = cidade;
    }

    public Cliente(int id, String nome, String cpf, String cidade) {
        super(id, nome, cpf);
        this.cidade = cidade;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    
}
    
    
       
    



    