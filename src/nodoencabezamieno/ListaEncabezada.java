/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nodoencabezamieno;

import javax.swing.JOptionPane;

/**
 *
 * @author jpcc-
 */
public class ListaEncabezada {
    
    private Nodo encabezado;
    private Nodo anterior;
    
    
    public ListaEncabezada(){
    
        encabezado = new Nodo();
    
    }
    
    
    public void agregarNodo(int dato){
        Nodo nuevo = new Nodo();
        nuevo.setDato(dato);
        
        if(encabezado.getLigaSiguiente() ==  null){
            encabezado.setLigaSiguiente(nuevo);
            
        }else{
            anterior.setLigaSiguiente(nuevo);
        
        }
        anterior = nuevo;
        
    }
    
    public void llenarlistaAleatoria(){
        
        for(int i = 0; i < 15; i++){
            Nodo nuevo = new Nodo();
            nuevo.setDato((int) (Math.random() * 100));

            if(encabezado.getLigaSiguiente() ==  null){
                encabezado.setLigaSiguiente(nuevo);

            }else{
                anterior.setLigaSiguiente(nuevo);

            }
            anterior = nuevo;
        }
    }
    
    public void mostrarLista(){
        Nodo aux;
        aux = encabezado;
        String dato = "";
        
        if(aux.getLigaSiguiente() != null){
            while(aux != null){
                if(aux != encabezado){
                    dato += aux.getDato()+ " --> ";
                }
            aux = aux.getLigaSiguiente();
            }
            JOptionPane.showMessageDialog(null, dato);
        }else{
            JOptionPane.showMessageDialog(null,"No tiene elementos la lista");
        
        }
        
        
        
    }
    
    public void crearListacondivi(int div){
        ListaEncabezada lista2 = new ListaEncabezada();
        Nodo aux;
        aux = encabezado;
        String dato = "";
        
        if(aux.getLigaSiguiente() != null){
            while(aux != null){
                if(((aux.getDato() % div) == 0 )&& aux != encabezado){
                    lista2.agregarNodo(aux.getDato());
                }
            aux = aux.getLigaSiguiente();
            }
            lista2.mostrarLista();
        }else{
            JOptionPane.showMessageDialog(null,"No tiene elementos la lista");
        
        }
            

    }
    
    
    
}
