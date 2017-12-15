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
import java.util.Vector;
public class Lista {
    Vector lista = new Vector();
    public Lista(){
        lista = new Vector();
    }
    
    public void ponPrimero(Object ob){
        lista.add(0, ob);
    }
    
    public void ponUltimo(Object ob){
        lista.addElement(ob);
    }
    
    public boolean estaVacia(){
        boolean vacia = lista.isEmpty();
        return vacia;
    }
    
    public Object extraePrimero(){
        Object objeto = lista.firstElement();
        lista.removeElementAt(0);
        return objeto;
    }
    
    public Object extraeUltimo(){
        Object objeto = lista.lastElement();
        lista.removeElementAt(lista.size() - 1);
        return objeto;
    }
    
    public void visualizaElementos(){
        for (int i = 0; i < lista.size(); i++){
            System.out.println(lista.elementAt(i));
        }
    }
    
}
