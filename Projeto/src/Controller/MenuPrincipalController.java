/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;



import View.Agenda;
import View.ClienteTela;
import View.Menuprincipal;
import View.Pagamento;
import View.Quadras;
import View.Relatórios;
import View.UsuarioTela;

/**
 *
 * @author Positivo
 */
public class MenuPrincipalController {
    
    private final Menuprincipal View;

    public MenuPrincipalController(Menuprincipal View) {
        this.View = View;
    }
    
    
    public void navegarParaAgenda(){
        
        Agenda agenda = new Agenda();
        agenda.setVisible(true); 
    }
    
    public void navegarParaPagamento(){
        
        Pagamento pagamento = new Pagamento();
        pagamento.setVisible(true); 
    }
    
    public void navegarParaCliente(){
        
        ClienteTela cliente = new ClienteTela();
        cliente.setVisible(true); 
    }
    
    public void navegarParaQuadra(){
        
        Quadras quadra = new Quadras();
        quadra.setVisible(true); 
    }
    
    public void navegarParaUsuario(){
        
        UsuarioTela usuario = new UsuarioTela();
        usuario.setVisible(true); 
    }
    
    public void navegarParaRelatorios(){
        
        Relatórios relatorio = new Relatórios();
        relatorio.setVisible(true); 
    }
    
}
