/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6_2clasepila;

/**
 *
 * @author Bonoso
 */
public class Pila {
    Lista lista = new Lista();
    
    public Object Pop(){
        Object objeto = lista.extraePrimero();
        return objeto;
    }
    
    public void Push(Object ob){
        lista.ponPrimero(ob);
    }
    
    public boolean Vacia(){
        return lista.estaVacia();
    }
    
    public void Cima(){
        lista.visualizaElementos();
    }
}
