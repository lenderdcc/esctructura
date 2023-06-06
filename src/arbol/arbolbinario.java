/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbol;


public class arbolbinario {
    Nodo raiz;

    public arbolbinario() {
    }
    
    public void arbolbinarioo(){
        raiz=null;
    }

    public arbolbinario(Nodo raiz) {
        this.raiz = raiz;
    }
    public Nodo raizarbol(){
        return raiz;
    }
    
   //comprobar si el arbol esta vacio
    public boolean  esvacio(){
        return raiz==null;
    }
    
    //metodo crear arbol
    public Nodo nuevoarbol(Nodo ramaizq,Object nombre,Nodo ramadere){
        return new Nodo(ramaizq, nombre, ramadere);
    }
}
