package basic.c05_structures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class StructuresExercises {
    public static void main(String[] args) {
        // 1. Crea un Array con 5 valores e imprime su longitud.
        String[] arr = {"valor_1", "valor_2", "valor_3","valor_4","valor_5"};
        System.out.println("La longitud del array es: " + arr.length);
        // 2. Modifica uno de los valores del Array e imprime el valor del índice antes y después de modificarlo.
        System.out.println("Valor del indice[0]: " + arr[0]);
        arr[0] = "valor_modificado";
        System.out.println("Valor del indice[0] modificado: " + arr[0]);
        // 3. Crea un ArrayList vacío.
        ArrayList<String> emptyArrayList= new ArrayList<>();
        // 4. Añade 4 valores al ArrayList y elimina uno a continuación.
        emptyArrayList.add("valor 00");
        emptyArrayList.add("valor 01");
        emptyArrayList.add("valor 02");
        emptyArrayList.add("valor 03");
        System.out.println(emptyArrayList);
        emptyArrayList.remove(2);
        System.out.println(emptyArrayList);
        // 5. Crea un HashSet con 2 valores diferentes.
        HashSet<String> twoValues = new HashSet<>();
        twoValues.add("Jonathan");
        twoValues.add("Cruz");
        System.out.println(twoValues);
        // 6. Añade un nuevo valor repetido y otro sin repetir al HashSet.
        twoValues.add("Jonathan");
        twoValues.add("Jodatrash");
        System.out.println(twoValues);
        // 7. Elimina uno de los elementos del HashSet.
        twoValues.remove("Cruz");
        System.out.println(twoValues);
        // 8. Crea un HashMap donde la clave sea un nombre y el valor el número de teléfono. Añade tres contactos.
        HashMap<String, String> regyster = new HashMap<>();
        regyster.put("Contact_1", "+00-000-000-00-01");
        regyster.put("Contact_2", "+00-000-000-00-02");
        regyster.put("Contact_3", "+00-000-000-00-03");
        System.out.println(regyster);
        // 9. Modifica uno de los contactos y elimina otro.
        regyster.replace("Contact_1", "+01-111-111-11-11");
        regyster.remove("Contact_3");
        System.out.println(regyster);

        // 10. Dado un Array, transfórmalo en un ArrayList, a continuación en un HashSet y finalmente en un HashMap con clave y valor iguales.
        String[] strings = new String[5];
        strings[0] = "Java";
        strings[1] = "Python";
        strings[2] = "Python";
        strings[3] = "JavaScript";
        strings[4] = "TypeScript";
        System.out.println(Arrays.toString(strings));

        ArrayList<String> stringArrayList = new ArrayList<>(Arrays.asList(strings));
        System.out.println(stringArrayList);

        HashSet<String> stringHashSet = new HashSet<>(stringArrayList);
        System.out.println(stringHashSet);

        HashMap<String, String> stringHashMap = new HashMap<>();
        for (String elemento : stringHashSet){
            stringHashMap.put(elemento, elemento);
        }
        System.out.println(stringHashMap.values());

    }
}
