/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.DAO;

import Models.Quadra;
import java.util.ArrayList;

/**
 *
 * @author giselle
 */
public class QuadraDAO {
    
    
    /**
     * Insere um servico dentro do banco de dados
     * @param quadra exige que seja passado um objeto do tipo servico
     */
    public void insert(Quadra quadra){
        Banco.quadra.add(quadra);
    }
    
    /**
     * Atualiza um Objeto no banco de dados
     * @param quadra
     * @return 
     */
    public boolean update(Quadra quadra){
        
        for (int i = 0; i < Banco.quadra.size(); i++) {
            if(idSaoIguais(Banco.quadra.get(i),quadra)){
                Banco.quadra.set(i, quadra);
                return true;
            }
        }
        return false;      

    }
    
    /**
     * Deleta um objeto do banco de dados pelo id do servico passado
     * @param quadra
     * @return 
     */
    public boolean delete(Quadra quadra){
        for (Quadra quadraLista : Banco.quadra) {
            if(idSaoIguais(quadraLista,quadra)){
                Banco.quadra.remove(quadraLista);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Retorna um arraylist com todos os servicos do banco de dados
     * @return uma lista com todos os registros do banco
     */
    public ArrayList<Quadra> selectAll(){
        return Banco.quadra;
    }
    
    /**
     * Compara se dois objetos tem a propriedade id igual
     * @param quadra
     * @param quadraAComparar
     * @return verdadeiro caso os id forem iguais e falso se nao forem
     */
    private boolean idSaoIguais(Quadra quadra, Quadra quadraAComparar) {
        return quadra.getId() ==  quadraAComparar.getId();
    }
    
}
