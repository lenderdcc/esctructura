/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbol;



import javax.swing.JOptionPane;

public class PilaVector {
    private Object cima;

    public PilaVector() {
        cima = null;
    }

    public void insertar(Object nuevoNodo) {
        cima = nuevoNodo;
    }

    public boolean estaVacia() {
        return cima == null;
    }

    public Object quitar() {
        Object nodoEliminado = cima;
        cima = null;
        return nodoEliminado;
    }
}

