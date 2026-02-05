package basic.c05_structures;

/*
 * Estructura de datos, que no almacena un conjunto de valores, sino que almacena un conjunto de
 * pares clave y valor, como un diccionario.
 *
 * Una especie de tabla de datos y con cada uno de los valores asociados a esa clave, es como
 * se puede acceder.
 *
 */

import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {

        //Declaración.
        HashMap<String, String> names = new HashMap<>();
        var numbers = new HashMap<Integer, String>();

        // Tamaño.
        System.out.println(names.size());

        // Añadir elementos.
        names.put("Nombre", "Jonathan");
        names.put("Apellido", "Pacheco");
        names.put("Username", "Jodatrash");
        System.out.println(names);
        System.out.println(names.size());

        /*
         * Al ser Hash como en los sets, son elementos desordenados, por lo tanto, no se puede tener
         * acceso a los datos directamente como se hace con los Arrays y ArraysList, que es por índices.
         *
         */

        // Acceso a elementos por clave (Case sensitive).
        System.out.println(names.get("Nombre"));
        System.out.println(names.get("Apellido"));
        System.out.println(names.get("Username"));
        // Intentando entrar a una clave que no existe.
        System.out.println(names.get("dev")); // null
        // Intentando entrar a una clave mal escrita.
        System.out.println(names.get("username")); // null - recordando que se debe respetar mayúsculas y minúsculas.

    }
}
