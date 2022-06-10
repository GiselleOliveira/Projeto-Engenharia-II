/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Models.Cliente;
import Models.Pessoa;
import Models.Quadra;
import Models.Reserva;
import Models.Usuario;

/**
 *
 * @author Positivo
 */
public class main {
    
    
    public static void main(String[] args){
    
        String nome = "Giselle";
        System.out.println(nome);
    
       Quadra quadra = new Quadra (1, 10, "saibro", true, true, true, 70, null);
       
       System.out.println(quadra.getValor());
       System.out.println(quadra.getTipo_quadra());
       
       Cliente cliente = new Cliente(1, "Giselle", "1111111111111", "poa");
       
       System.out.println(cliente.getNome());
       
       Usuario usuario = new Usuario(1, "Giselle", "senha", "nivel 01", "02");
       System.out.println(usuario.getNome());
       
       Reserva reserva = new Reserva (1, cliente, 02, quadra, 70, "17/05/2022", "13:00", "13:00", "13:04", "13:58", "locação");
       
       System.out.println(reserva.getCliente().getNome());
       
       
       
       
       
               
            
    }
    
    
}
