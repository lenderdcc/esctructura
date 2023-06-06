/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbol;

class Nodo {
   Object nombre;
    Nodo hijoIzquierdo;
    Nodo hijoDerecho;
   

    public Nodo(Object nombre) {
        this.nombre = nombre;
        this.hijoIzquierdo = null;
        this.hijoDerecho = null;
    }

  Nodo(Nodo ramaizq, Object nombre, Nodo ramadere) {
    this.hijoIzquierdo = ramaizq;
    this.hijoDerecho = ramadere;
    this.nombre = nombre;
}

}
