package practice.technical;

import java.util.HashMap;
import java.util.Scanner;

public class GestorHubApp {
    public static void main(String[] args) {
        HashMap<String, NodoSpoke> nodos = new HashMap<>();

        var nodo1 = new NodoSpoke("USA-WST-01", "192.0.0.1");
        var nodo2 = new NodoSpoke("USA-WST-02", "192.0.0.2");
        var nodo3 = new NodoSpoke("USA-WST-03", "192.0.0.3");

        nodos.put(nodo1.getNombreServidor(), nodo1);
        nodos.put(nodo2.getNombreServidor(), nodo2);
        nodos.put(nodo3.getNombreServidor(), nodo3);

        try(Scanner userInput = new Scanner(System.in)){
            System.out.println("Ingresa el nombre del servidor spoke a conectar.");
            String option = userInput.nextLine();
            System.out.println(nodos.get(option));
        }

    }
}
