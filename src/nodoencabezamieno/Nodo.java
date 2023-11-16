/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nodoencabezamieno;

/**
 *
 * @author jpcc-
 */
public class Nodo {
    
    
    private int dato;
    private Nodo ligaAnterior;
    private Nodo ligaSiguiente;
    
    public Nodo() {
        
        dato = 0;
        ligaAnterior = null;
        ligaSiguiente = null;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getLigaAnterior() {
        return ligaAnterior;
    }

    public void setLigaAnterior(Nodo ligaAnterior) {
        this.ligaAnterior = ligaAnterior;
    }

    public Nodo getLigaSiguiente() {
        return ligaSiguiente;
    }

    public void setLigaSiguiente(Nodo ligaSiguiente) {
        this.ligaSiguiente = ligaSiguiente;
    }
    
    

    
    
}
