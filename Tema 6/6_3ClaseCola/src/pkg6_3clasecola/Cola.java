/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6_3clasecola;

/**
 *
 * @author Bonoso
 */
public class Cola {
    Lista lista = new Lista();
    
    public Object ExtraeDeCola (){
        Object objeto = lista.extraePrimero();
        return objeto;
    }
    
    public void PonPrimero(Object ob){
        lista.ponPrimero(ob);
    }
    
    public boolean Vacio(){
        return lista.estaVacia();
    }
    
    public void Frente(){
        lista.visualizaElementos();
    }
}
