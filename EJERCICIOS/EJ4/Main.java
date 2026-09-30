package ejercicio4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Contenedor<String, Integer> productos = new Contenedor<>();

        productos.agregarPar("Laptop", 5);
        productos.agregarPar("Mouse", 15);
        productos.agregarPar("Teclado", 10);
        productos.agregarPar("Monitor", 8);

        System.out.println("Todos los productos:");
        productos.mostrarPares();

        System.out.println("\nProducto en la posicion 1:");
        System.out.println(productos.obtenerPar(1));

        System.out.println("\nLista completa:");
        System.out.println(productos.obtenerTodosLosPares());

        Stack<Par<String, Integer>> pila = new Stack<>();

        for (Par<String, Integer> par : productos.obtenerTodosLosPares()) {
            pila.push(par);
        }

        System.out.println("\nProductos usando pila:");

        while (!pila.isEmpty()) {
            System.out.println(pila.pop());
        }

        Queue<Par<String, Integer>> cola = new LinkedList<>();

        for (Par<String, Integer> par : productos.obtenerTodosLosPares()) {
            cola.offer(par);
        }

        System.out.println("\nProductos usando cola:");

        while (!cola.isEmpty()) {
            System.out.println(cola.poll());
        }
    }
}