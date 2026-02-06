package basic.c06_loops;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LoopsExercises {
    public static void main(String[] args) {
        // 1. Imprime los números del 1 al 10 usando while.
        int numbers = 1;
        while (numbers <= 10) {
            System.out.println(numbers);
            numbers++;
        }
        // 2. Usa do-while para mostrar todos los valores de un ArrayList.
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Value_0");
        stringArrayList.add("Value_1");
        stringArrayList.add("Value_2");
        stringArrayList.add("Value_3");
        stringArrayList.add("Value_4");
        int index = 0;
        do {
            System.out.println(stringArrayList.get(index));
            index++;
        } while (index < stringArrayList.size());

        // 3. Imprime los múltiplos de 5 del 1 al 50 usando for.
        int multiplos;
        for (multiplos = 0; multiplos <= 50; multiplos += 5) {
            System.out.println(multiplos);
        }

        // 4. Recorre un Array de 5 números e imprime la suma total.
        int[] suma = {5, 5, 5, 5, 5};
        int sumaTotal = 0;
        for (int i = 0; i < suma.length; i++) {
            sumaTotal += suma[i];
        }
        // 5. Usa un for para recorrer un Array y mostrar sus valores.
        System.out.println("Suma total es: " + sumaTotal);
        String[] values = {"Valor_1", "Valor_2", "Valor_3", "Valor_4", "Valor_5"};

        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
        // 6. Usa for-each para recorrer un HashSet y un HashMap.
        HashSet<String> stringHashSet = new HashSet<>();
        stringHashSet.add("for-each-1");
        stringHashSet.add("for-each-2");
        stringHashSet.add("for-each-3");
        for (String elementos : stringHashSet) {
            System.out.println(elementos);
        }
        HashMap<Integer, String> stringHashMap = new HashMap<>();
        stringHashMap.put(1, "value_map_01");
        stringHashMap.put(2, "value_map_02");
        stringHashMap.put(3, "value_map_03");
        for (Map.Entry<Integer, String> data : stringHashMap.entrySet()) {
            System.out.println(data.getKey() + ":");
            System.out.println(data.getValue());
        }
        for (Integer data : stringHashMap.keySet()) {
            System.out.println(data);
        }
        for (String data : stringHashMap.values()) {
            System.out.println(data);
        }

        // 7. Imprime los números del 10 al 1 (descendiente) con un bucle for.
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        // 8. Usa continue para saltar los múltiplos de 3, iniciando del 1 al 20.
        System.out.println("Usa continue para saltar los múltiplos de 3, iniciando del 1 al 20.");
        for (int i = 0; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
        // 9. Usa break para detener un bucle cuando encuentres un número negativo en un array.
        int[] negativeArray = {10, 2, 7, 9, -1, 100, 4};
        System.out.println("Contenido completo del array: ");
        for (int i = 0; i < negativeArray.length; i++) {
            System.out.println(negativeArray[i]);
        }
        System.out.println("Contenido del array: ");
        for (int i = 0; i < negativeArray.length; i++) {
            System.out.println(negativeArray[i]);
            if (negativeArray[i] < 0) {
                System.out.println("Se termina, se encontró en el array: " + negativeArray[i]);
                break;
            }
        }
        // 10. Crea un programa que calcule el factorial de un número dado.
        int numero = 6;
        int fact = 1;

        for (int i = 1; i <= numero; i++) {
            fact *= i;
        }
        System.out.println("El factorial de " + numero + ", es: " + fact);

    }
}
