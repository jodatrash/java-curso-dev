package basic.c05_structures;

/*
 * Estructura de datos, que no almacena un conjunto de valores, sino que almacena un conjunto de
 * pares clave y valor, como un diccionario.
 *
 * Una especie de tabla de datos y con cada uno de los valores asociados a esa clave, es como
 * se puede acceder.
 *
 *
 * Hash no admite repetidos.
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

        // Verificar elementos.
        /*
         * Verificar correctamente si existe "dev", no de obtener el valor, sino de comprobar que exista cada uno
         * de las keys
         *
         * Recordar que es case sensitive.
         */

        // Existe la clave.
        System.out.println(names.containsKey("Username")); // true
        System.out.println(names.containsKey("dev")); // false

        // Existe el valor.
        System.out.println(names.containsValue("Jonathan")); // true
        System.out.println(names.containsValue("Juan")); // false

        // Eliminar elemento.

        /*
         * Elimina la clave y registro, pero también imprime que se tenía asociado a la clave
         */
        System.out.println(names.remove("Username")); // Eliminar directamente por clave.
        System.out.println(names);


        // Modificar elementos.
        names.put("Nombre", "Jonathan"); // Original
        System.out.println(names);

        /*
         * Si hacemos el put a una clave que ya existe, lo que se hace es modificar en realidad es reemplazar
         * el valor que se tiene inicialmente
         */

        names.put("Nombre", "Maximiliano"); // Actualización / reemplazo y si no existe lo crea desde 0
        System.out.println(names);

        names.replace("Nombre", "Nathan"); // Reemplaza el valor solo si existe.
        System.out.println(names);

        names.putIfAbsent("dev", "Juan"); // Insertalo solo si no existe.
        System.out.println(names);

        System.out.println(names.isEmpty()); // false
        System.out.println(names.values()); // Devuelve solo un listado de valores.

        // Limpiar HashMap
        names.clear();
        System.out.println(names);
    }
}
