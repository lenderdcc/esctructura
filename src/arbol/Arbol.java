/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arbol;



import javax.swing.JOptionPane;
public class Arbol {
    arbolbinario arbol;
    Nodo raiz, a1, a2, a3,a4, a5,a6,a7,a8,a9,a10,a11;
    
    public static void main(String[] args) {
        Arbol miArbol = new Arbol();
        miArbol.crear();
        miArbol.mostrarTodos();
    }



    public void crear() {
        arbol = new arbolbinario();
        a1 = arbol.nuevoarbol(null, "Eva", null);
        a2 = arbol.nuevoarbol(null, "Nicolas", null);
        a3 = arbol.nuevoarbol(null, "maria", null);
        a4 = arbol.nuevoarbol(null, "Alonso", null);
        a5 = arbol.nuevoarbol(null, "Juan", null);
        a6 = arbol.nuevoarbol(null, "Carolina", null);
        a7 = arbol.nuevoarbol(null, "Jesus", null);
        a8 = arbol.nuevoarbol(null, "Ana", null);
        a9 = arbol.nuevoarbol(null, "Laura", null);
        a10 = arbol.nuevoarbol(null, "Sofia", null);

        raiz = arbol.nuevoarbol(arbol.nuevoarbol(a3, "Eva", arbol.nuevoarbol(a8, "Nicolas", a7)), "Loreto", arbol.nuevoarbol(a5, "Alonso", arbol.nuevoarbol(a9, "Carolina",a10)));
   
    }

    public void mostrarTodos() {
        mostrarRecursivo(raiz, 0);
    }
  
    private void mostrarRecursivo(Nodo nodo, int nivel) {
        if (nodo != null) {
            for (int i = 0; i < nivel; i++) {
                System.out.print("    ");
            }
            System.out.println(nodo.nombre);
            mostrarRecursivo(nodo.hijoIzquierdo, nivel + 1);
            mostrarRecursivo(nodo.hijoDerecho, nivel + 1);
        }
    }
}




