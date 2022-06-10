/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.DAO;

import Models.Reserva;
import java.util.ArrayList;

/**
 *
 * @author giselle
 */
public class ReservaDAO {
    
    /**
     * Insere uma reserva dentro do banco de dados
     * @param reserva exige que seja passado um objeto do tipo reserva
     */
    public void insert(Reserva reserva){
          
        if(reserva.getId() == 0){
            reserva.setId(proximoId());
            Banco.reserva.add(reserva);
        }
        
        
    }
    
    /**
     * Atualiza um Objeto no banco de dados
     * @param reserva
     * @return 
     */
    public boolean update(Reserva reserva){
        
        for (int i = 0; i < Banco.reserva.size(); i++) {
            if(idSaoIguais(Banco.reserva.get(i),reserva)){
                Banco.reserva.set(i, reserva);
                return true;
            }
        }
        return false;      

    }
    
    /**
     * Deleta um objeto do banco de dados pelo id do reserva passado
     * @param reserva
     * @return 
     */
    public boolean delete(Reserva reserva){
        for (Reserva reservaLista : Banco.reserva) {
            if(idSaoIguais(reservaLista,reserva)){
                Banco.reserva.remove(reservaLista);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Retorna um arraylist com todas as reservas do banco de dados
     * @return uma lista com todos os registros do banco
     */
    public ArrayList<Reserva> selectAll(){
        return Banco.reserva;
    }
    
    /**
     * Compara se dois objetos tem a propriedade id igual
     * @param reserva
     * @param reservaAComparar
     * @return verdadeiro caso os id forem iguais e falso se nao forem
     */
    private boolean idSaoIguais(Reserva reserva, Reserva reservaAComparar) {
        return reserva.getId() ==  reservaAComparar.getId();
    }
    
    private int proximoId(){
        
        int maiorId = 0;
        
        for (Reserva reserva : Banco.reserva) {           
           int id = reserva.getId();
            
            if(maiorId < id){
                maiorId = id;
            }
            
        }
        
        return maiorId + 1;
    }
    
}
