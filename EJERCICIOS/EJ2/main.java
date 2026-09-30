package EJERCICIOS;

import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class main {
    public static void main(String[] args) {
        
        Stack<ej2Par<String, Integer>> pila = new Stack<>();
        pila.push(new ej2Par<>("Araceli", 21));
        pila.push(new ej2Par<>("Maria", 22));

        Queue<ej2Par<String, Integer>> cola = new LinkedList<>();
        cola.add(new ej2Par<>("Araceli", 21));
        cola.add(new ej2Par<>("Pedro", 30));

        ej2Par<String, Integer> p1 = pila.peek();   //lifo
        ej2Par<String, Integer> p2 = cola.peek();   //fifo

        System.out.println("\nPila: " + p1);
        System.out.println("\nCola: " + p2);
        System.out.println("Son iguales: " + p1.esIgual(p2)); 

        ej2Par<String, Integer> p3 = new ej2Par<>("Maria", 22);
        System.out.println("¿p1 es igual a p3? " + p1.esIgual(p3)); 
    }
}