/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nodoencabezamieno;

import javax.swing.JOptionPane;

/**
 *
 * @author jpcc-
 */
public class NodoEncabezamieno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int opcion = 1;
        int dato;
        ListaEncabezada lista1 = new ListaEncabezada();
        
        String menu = "Lista con encabezamiento\n" +
                        "1. Agregar Nodo\n" +
                        "2. Mostrar lista\n" +
                        "3. LLenar con 15 datos aleatorios\n" +
                        "4. lista nueva con divisores\n"+
                        "0. Salir";
        System.out.println("prueba");
        
        
        do{
            
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch(opcion){
                case 1:
                    dato = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el dato del Nodo"));
                    lista1.agregarNodo(dato);
                    break;
                case 2:
                    lista1.mostrarLista();
                    break;
                case 3:
                    lista1.llenarlistaAleatoria();
                    break;
                case 4:
                    dato = 0;
                    do{
                        dato = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero de 1 a 9\n para ver la lista con los multiplos del numero ingresado"));
                    }while(dato > 9);
                    lista1.crearListacondivi(dato);
                     break;
                case 0:
                    break;
            
            }
            
        
        }while(opcion != 0);
    }
    
}
