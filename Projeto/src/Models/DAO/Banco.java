/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.DAO;

import Models.Reserva;
import Models.Cliente;
import Models.Quadra;
import Models.Usuario;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author giselle
 */
public class Banco {
    
    public static ArrayList<Usuario> usuario;
    public static ArrayList<Cliente> cliente;
    public static ArrayList<Quadra> quadra;
    public static ArrayList<Reserva> reserva;
    
    static {
        inicia();
    }
    
    public static void inicia(){
    
        //Instancia os Objetos
        usuario = new ArrayList<Usuario>();
        cliente = new ArrayList<Cliente>();
        quadra = new ArrayList<Quadra>();
        reserva = new ArrayList<Reserva>();
        
        //criando elementos
        
        Usuario usuario1 = new Usuario(1, "Giselle Santos", "12345", "Administrador", "12345678911");
        Usuario usuario2 = new Usuario(2, "Gilmar Gomes", "54321", "Zelador", "15643764532");
         
        Cliente cliente1 = new Cliente(1, "João Silva", "53647281949", "Mogi das Cruzes");
        Cliente cliente2 = new Cliente(2, "Leandro José", "99999999999", "Itaquá");
        Cliente cliente3 = new Cliente(3, "Gustavo Moura", "77777777777", "Suzano");
        Cliente cliente4 = new Cliente(4, "Ana Garcia", "11111111111", "Mogi das Cruzes");
        Cliente cliente5 = new Cliente(5, "Matheus Pereira", "12121212121", "Mogi das Cruzes");
        Cliente cliente6 = new Cliente(6, "Rui Barbosa", "22222222222", "Poá");
        Cliente cliente7 = new Cliente(7, "Camile Veiga", "33333333333", "Mogi das Cruzes");
        Cliente cliente8 = new Cliente(8, "Leandro Luque", "44444444444", "Mogi das Cruzes");
        Cliente cliente9 = new Cliente(9, "Adriana Luz", "55555555555", "Mogi das Cruzes");
        Cliente cliente10 = new Cliente(10, "Luana Costa", "88888888888", "Poá");
        
        Quadra quadra1 = new Quadra(1, 10, "Saibro", true, true, true, 70, new Date(2022,5,15));
        Quadra quadra2 = new Quadra(2, 20, "Rápida", true, true, true, 70,  new Date(2022,5,15));
        Quadra quadra3 = new Quadra(3, 30, "Beach tênis", true, true, true, 70,  new Date(2022,5,15));
        Quadra quadra4 = new Quadra(4, 40, "Saibro", false, true, true, 40, new Date(2022,5,15));
        Quadra quadra5 = new Quadra(5, 50, "Rápida", false, false, true, 40,  new Date(2022,5,15));
        Quadra quadra6 = new Quadra(6, 60, "Beach tênis", false, true, false, 40,  new Date(2022,5,15));
        
        
        Reserva reserva1 = new Reserva(1, cliente9, 60, quadra6, 40, "22/05/2022", "16:00", "17:00", "16:05", "16:58", "locação");
        Reserva reserva2 = new Reserva(2, cliente5, 10, quadra1, 70, "24/05/2022", "14:00", "15:30", "14:00", "15:30", "locação");
        Reserva reserva3 = new Reserva(3, cliente7, 20, quadra2, 0, "25/05/2022", "15:00", "16:30", "15:00", "16:15", "Manutenção");
        
        //Adiciona Elementos na lista
        usuario.add(usuario1);
        usuario.add(usuario2);
        
        cliente.add(cliente1);
        cliente.add(cliente2);
        cliente.add(cliente3);
        cliente.add(cliente4);
        cliente.add(cliente5);
        cliente.add(cliente6);
        cliente.add(cliente7);
        cliente.add(cliente8);
        cliente.add(cliente9);
        cliente.add(cliente10);
        
        quadra.add(quadra1);
        quadra.add(quadra2);
        quadra.add(quadra3);
        quadra.add(quadra4);
        quadra.add(quadra5);
        quadra.add(quadra6);
        
        reserva.add(reserva1);
        reserva.add(reserva2);
        reserva.add(reserva3);
        
    }
    
    
}
