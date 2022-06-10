/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.helper.LoginHelper;
import Models.DAO.UsuarioDAO;
import Models.Usuario;
import View.Login;
import View.Menuprincipal;

/**
 *
 * @author Positivo
 */
public class loginController {

    private final Login View;
    private LoginHelper helper;
    
    public loginController(Login View) {
        this.View = View;
        this.helper = new LoginHelper(View);
        
      
    }
    
    public void entrarNoSistema(){
        
         //Pegar um usuário da view
       Usuario usuario = helper.obterModelo();
       
      
              // Pesquisa usuario no banco
        
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usuarioAutenticado = usuarioDAO.selectPorNomeESenha(usuario);
        
        //Se usuário da view tiver mesmo usuário e senha que o usuário vindo do banco direcionar para Menu Principal
        //Senão mostrar uma mensagem ao usuário "usuário e senha inválidos"
        
        if(usuarioAutenticado != null){
            // navegar para menu principal
            Menuprincipal menu = new Menuprincipal();
            menu.setVisible(true);
            this.View.dispose();
        }else {
            View.exibeMensagem("Usuário ou senha inválidos");
            
        }
        
        ////Se o usuário da view tiver o mesmo usuario e senha vindo do banco direcionar para menu
        // senão mostrar uma mensagem ao usuário "Usuário ou senha inválidos"
        
    }
    
    
    public void fizTarefa(){
        System.out.println("Busquei algo do banco de dados");
        
        this.View.exibeMensagem("Executei o fiz tarefa");
        
        
        
    }
    
    
    
}
