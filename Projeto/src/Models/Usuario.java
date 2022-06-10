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
public class Usuario extends Pessoa {
    
    
    protected String senha;
    protected String nivel_acesso;

    public Usuario(int id, String nome,String senha, String nivel_acesso, String cpf) {
        super(id, nome, cpf);
        this.senha = senha;
        this.nivel_acesso = nivel_acesso;
    }

  
    public Usuario(String senha, String nivel_acesso, int id, String nome, String cpf, String telefone, String email, Date data_criacao) {
        super(id, nome, cpf, telefone, email, data_criacao);
        this.senha = senha;
        this.nivel_acesso = nivel_acesso;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNivel_acesso() {
        return nivel_acesso;
    }

    public void setNivel_acesso(String nivel_acesso) {
        this.nivel_acesso = nivel_acesso;
    }
    
    
    

}