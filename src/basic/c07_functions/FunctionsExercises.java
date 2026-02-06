package basic.c07_functions;

import java.util.ArrayList;

public class FunctionsExercises {
    public static void main(String[] args) {
        // 1. Crea una función que imprima "¡Te doy la bienvenida al curso de Java desde cero!".
        welcomeMessage();

        // 2. Escribe una función que reciba un nombre como parámetro y salude a esa persona.
        greetingUser("Jonathan");

        // 3. Haz un método que reciba dos números enteros y devuelva su resta.
        subtraction(5, 3);

        // 4. Crea un método que calcule el cuadrado de un número (n * n).
        System.out.println(sqrtCalc(5));

        // 5. Escribe una función que reciba un número y diga si es par o impar.
        System.out.println("Es par: " + isEven(40));
        //pairOrNot(441);

        // 6. Crea un método que reciba una edad y retorne true si es mayor de edad (y false en caso contrario).
        boolean result = isAdult(18);
        System.out.println("Es mayor de edad: " + result);

        // 7. Implementa una función que reciba una cadena y retorne su longitud.
        int resultText = lengthChain("Hola este es un texto");
        System.out.println("La longitud es: " + resultText);

        //  8. Crea un método que reciba un array de enteros, calcula su media y lo retorna.
        int[] data = {6, 7, 8, 5, 10};
        System.out.println("El promedio es: " + arraysInt(data));

        // 9. Escribe un método que reciba un número y retorna su factorial.
        System.out.println("El factorial es: " + numberFactorial(6)); // 720

        // 10. Crea una función que reciba un ArrayList<String> y lo recorra mostrando cada elemento.
        ArrayList<String> arr = new ArrayList<>();
        arr.add("test_1");
        arr.add("test_2");
        arr.add("test_3");
        arr.add("test_4");
        validateArrayList(arr);
    }

    public static void welcomeMessage() {
        System.out.println("¡Te doy la bienvenida al curso de Java desde cero!");
    }

    public static void greetingUser(String name) {
        System.out.println("Saludos " + name);
    }

    public static void subtraction(int numberOne, int numberTwo) {
        System.out.println("El resultado de la resta es: " + (numberOne - numberTwo));
    }

    public static double sqrtCalc(int numberOne) {
        //System.out.println(Math.sqrt(numberOne));
        return Math.sqrt(numberOne);
    }

    public static boolean isEven(int numberOne) {
        return numberOne % 2 == 0;
    }

    /*
    public static void pairOrNot(int numberOne) {
        if (numberOne % 2 == 0) {
            System.out.println("Es par");
        } else
            System.out.println("No es par");
    }
    */

    public static boolean isAdult(int age) {
        return age >= 18;
    }

    public static int lengthChain(String text) {
        return text.length();
    }

    public static int arraysInt(int[] numbers) {
        int addition = 0;
        for (int number : numbers) {
            addition += number;
        }
        return addition / numbers.length;
    }

    public static int numberFactorial(int number) {
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void validateArrayList(ArrayList<String> items) {
        for (String item : items) {
            System.out.println(item);
        }
    }
}
