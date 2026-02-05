package basic.c05_structures;
/*
 * ArrayList: Estructura dinámica, permite almacenar elementos igual que el
 * array, pero en este caso no se declara el tamaño fijo.
 */

import java.util.ArrayList;

public class ArrList {
    public static void main(String[] args) {
        //Creación y declaración de array list
        ArrayList<String> names = new ArrayList<>(); // Clásica
        var numbers = new ArrayList<Integer>(); // Nueva
        // Añadir elementos.
        names.add(0,"test0"); // Añadir valores al índice.
        names.add(1,"test1");
        names.add(2,"test2");
        names.add(3,"test3");

        // Obtener el tamaño del índice.
        System.out.println(names.size());

        // Acceder a los elementos.
        System.out.println(names.getFirst()); // Obtener el primer índice.
        System.out.println(names.get(1)); // Obtener cierta posición del índice.
        System.out.println(names.get(2));
        System.out.println(names.getLast()); // Obtener el último índice.

        // Modificar los elementos.
        names.set(0,"Jonathan.dev@test.com"); // Modificar el índice.
        System.out.println(names.getFirst());

        // Eliminar elemento.
        names.remove(3); // Eliminar uno en específico.
//        System.out.println(names.get(3));
        System.out.println(names.getLast());
        names.removeAll(names); // Eliminar el arrayList
        System.out.println(names.size());

        // Buscar elementos.
        names.add(0, "test_0");
        names.add(1, "test1");
        names.add(2, "Jonathan.dev@test.com");
        System.out.println(names.size());
        System.out.println(names.contains("test1"));
        System.out.println(names.contains("Jonathan.dev@test.com"));
        System.out.println(names.contains("Jonathan"));

        // Limpiar el ArrayList
        System.out.println("Cuantos elementos actualmente tiene el ArrayList names: " + names.size());
        names.clear();
        System.out.println("Cuantos elementos tiene el ArrayList names después de un clear: " + names.size());

        names.add(0,"test_0");
        names.add(1,"test_1");
        names.add(2,"test_2");
        System.out.println(names);
    }
}
