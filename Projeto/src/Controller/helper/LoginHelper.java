/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.helper;

import Models.Usuario;
import View.Login;

/**
 *
 * @author Positivo
 */
public class LoginHelper {
    
    private final Login View;
    
    public LoginHelper(Login View){
        this.View = View;
    }
    
    public Usuario obterModelo(){
        
       String nome = View.getTextUsuario().getText();
       String senha = View.getTextSenha().getText();
        
       Usuario modelo = new Usuario(0, nome, senha, "acesso", "cpf");  /// verificar para deixar apenas os campos id, nome, senha
       return modelo;
       
    }
    
    public void setarModelo(Usuario modelo){
      String nome = modelo.getNome();
      String senha = modelo.getSenha();
      
      View.getTextUsuario().setText(nome);
      View.getTextSenha().setText(senha);
      
    }
    
    public void limparTela(){
        View.getTextUsuario().setText("");
        View.getTextSenha().setText("");
        
    }
}
