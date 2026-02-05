package basic.c05_structures;

import java.util.ArrayList;
import java.util.HashSet;

/*
 * Sets: Tipo de estructura especial que únicamente almacena datos únicos, es decir
 * no va permitir duplicados.
 */
public class Sets {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        var numbers = new HashSet<Integer>();

        // Tamaño.
        System.out.println(names.size());

        // Añadir elementos.
        names.add("Jonathan");
        names.add("Pacheco");
        names.add("Jodatrash");
        System.out.println(names.size());
        System.out.println(names);

        // Acceder a los elementos.
        /*
         * No existe un orden, la manera en la que se indexan es con un Hash no un índice,
         * por eso no se puede tener acceso como en los Arrays o ArrayList
         */

        // Buscar elementos.
        System.out.println(names.contains("Jonathan"));
        System.out.println(names.contains("jonathan"));

        // Eliminar elementos.
        System.out.println(names);
        System.out.println(names.size());
        names.remove("Jonathan");
        System.out.println(names);
        System.out.println(names.size());

        //
        System.out.println(names);
        names.add("test");
        names.add("test");
        names.add("test");
        System.out.println(names);

        // Conjuntos
        // names.addAll(numbers); error

        var countries = new HashSet<String>();
        countries.add("México");
        countries.add("España");
        countries.add("Argentina");

        names.addAll(countries); // Añadir los elementos que son iguales entre tipos, es decir String
        System.out.println(names);

        // Eliminar otra colección.
        // names.removeAll(countries);
        System.out.println(names);

        // Dejar solo elementos comunes.
        names.retainAll(countries);
        System.out.println(names);


    }
}
