package ejercicio3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static <K, V> void imprimirPar(Par<K, V> par) {
        System.out.println(par);
    }

    public static void main(String[] args) {

        Par<String, Integer> par1 = new Par<>("Edad", 20);
        Par<Double, Boolean> par2 = new Par<>(15.5, true);

        Persona persona = new Persona("Juan", 18);
        Par<Persona, Integer> par3 = new Par<>(persona, 100);

        System.out.println("Pares:");
        imprimirPar(par1);
        imprimirPar(par2);
        imprimirPar(par3);

        Stack<Par<?, ?>> pila = new Stack<>();

        pila.push(par1);
        pila.push(par2);
        pila.push(par3);

        System.out.println("\nPila:");

        while (!pila.isEmpty()) {
            imprimirPar(pila.pop());
        }

        Queue<Par<?, ?>> cola = new LinkedList<>();

        cola.offer(par1);
        cola.offer(par2);
        cola.offer(par3);

        System.out.println("\nCola:");

        while (!cola.isEmpty()) {
            imprimirPar(cola.poll());
        }
    }
}