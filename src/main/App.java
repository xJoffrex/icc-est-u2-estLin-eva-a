package main;

import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {

        // Ejemplo:
        // Entrada: ["Ana", "Luis", "Pedro"]
        // Salida: ["Pedro", "Luis", "Ana"]

        // * Entrada: ["r", "a", "d", "a", "r"] → true
        // * Entrada: ["c", "a", "s", "a"] → false
        LogicaClasificacion asd = new LogicaClasificacion();

        LinkedList<String> lista = new LinkedList<>();
        LinkedList<String> pali = new LinkedList<>();
        LinkedList<String> a = new LinkedList<>();
        lista.add("Ana");
        lista.add("Luis");
        lista.add("Pedro");

        pali.add("r");
        pali.add("a");
        pali.add("d");
        pali.add("a");
        pali.add("r");

        a.add("c");
        a.add("a");
        a.add("s");
        a.add("a");

        asd.invertirColaNombres(lista);
        System.out.println(lista);

        System.out.println(asd.verificarPalindromoCola(pali));
        System.out.println(asd.verificarPalindromoCola(a));
    }
}
