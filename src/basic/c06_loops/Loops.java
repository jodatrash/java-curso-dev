package basic.c06_loops;

/*
 * Loops / bucles / ciclos:
 * Un bucle lo que nos permite es ejecutar un mismo bloque de código varias veces.
 * Sirve para repetir ejecuciones.
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Loops {
    public static void main(String[] args) {
        // loops
        System.out.println("Hola, Java!\n".repeat(5));

        // - for
        System.out.println("==== for ====");
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }
        String[] names = {"Jonathan", "Pacheco", "Cruz", "Jodatrash"};
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        // - for-each (para cada uno de los elementos).
        /*
         * Es el bucle correcto para recorrer listas
         */
        System.out.println("==== for-each ====");
        for (String name : names) {
            System.out.println(name);
        }
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        for (int number : numbers) {
            System.out.println(number);
        }
        System.out.println("=".repeat(10));

        /*
         * No es tan sencillo, recordemos que para el map, se tiene pares de valores (String, String)
         */

        HashMap<String, String> users = new HashMap<>();
        users.put("Jonathan", "Jodatrash");
        users.put("Miguel", "MiguelBrav0");
        users.put("Jazid", "JazidPrkz");

        /*
         * Que se tiene aquí, una variable "user" que es de tipo **entry** que a su vez
         * representa una clave (String, String)
         *
         * Como tal el mapa users no se puede recorrer directamente, pero sí lo podemos transformar en un set y para ello
         * existe una operación que lo transforma directamente en un set.
         */

        for (Map.Entry<String, String> user : users.entrySet()) {
            // Obtenemos el par de valores dentro de users.
            System.out.println(user);
            // Como entrar solo a la clave (persona)
            System.out.println("Persona: " + user.getKey());
            // Como entrar solo al valor (username)
            System.out.println("Usernames: " + user.getValue());
        }
        System.out.println("=".repeat(10));
        for (String usernames : users.values()) {
            System.out.println("Usernames: " + usernames);
        }
        System.out.println("=".repeat(10));
        for (String emailUser : users.keySet()) {
            System.out.println("Persona: " + emailUser);
        }
        // - while
        /*
         * En algunos casos puede ser más óptimo que el bucle for, porque se repite
         * mientras la condición sea verdadera.
         *
         * Es decir quiero repetir algo, pero solo basándome únicamente en la condición del contador.
         */
        System.out.println("==== while ====");
        int i = 0;
        while (i < 5) {
            System.out.println("Hola, Java!");
            i++;
        }

        System.out.println("=".repeat(100));
        i = 0;
        while (i < names.length) {
            System.out.println(names[i]);
            if (names[i].equals("kodatrash")) {
                System.out.println("Se encontró el nombre: " + names[i]);
            }
            i++;
        }

        System.out.println("=".repeat(100));
        i = 0;
        boolean find = false;
        while (!find) {
            System.out.println(names[i]);
            if (names[i].equals("Jodatrash")) {
                System.out.println("Se encontró el nombre: " + names[i]);
                find = true;
            }
            i++;
        }
        //- do-while
        System.out.println("==== do-while ====");
        /*
         * Funciona de manera parecida al while, pero con la variante de que se va a ejecutar la primera vez siempre.
         *
         * Si se requiere ejecutar un código la primera vez y después ya veremos, se tiene el do-while.
         */

        int index = 0;
        do {
            System.out.println("Hola, Java!");
            index++;
        } while (index < 0);

        // Control de bucles
        // - break
        for (String name : names) {
            if (name.equals("Jodatrash")) {
                break; // Nos saca del bucle
            }
            System.out.println(name);
        }

        // Continue
        for (int ix = 0; ix < 5; ix++) {
            if ( ix == 3){
                continue; // Fuerza la siguiente ejecución del bucle.
            }
            System.out.println(ix);
        }
    }
}
