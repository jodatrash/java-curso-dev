package basic.c09_exeptions;

import basic.c09_exeptions.ex_01.Division;

public class ExceptionsExercisesMain {
    public static void main(String[] args) {
        // 1. Divide dos números almacenados en dos variables. Maneja la división por cero con try-catch.
        var division = new Division();
        System.out.println(division.getResult());

        int number1 = 25, number2 = 0;

        try {
            int result = number1 / number2;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Error no se puede dividir entre 0");
        }

        // 2. Crea un array de 3 elementos e intenta acceder al índice 5. Captura el ArrayIndexOutOfBoundsException.
        String[] arr = {
                "elemento 0",
                "elemento 1",
                "elemento 2",
        };
        try {
            System.out.printf(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.printf("No puedes acceder: " + e.getMessage());
        }
        // 3. Crea una variable String nula e intenta imprimir su longitud. Maneja el NullPointerException.

        // 4. Escribe una función que transforma texto a número. Usa try-catch para manejar entradas no válidas (NumberFormatException).

        // 5. Escribe un programa con un bloque finally que se ejecute siempre, haya o no error.
        try {
            var result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Error");
        } finally {
            System.out.println("Acaba el proceso.");
        }

        // 6. Usa throw para lanzar un IllegalArgumentException si un número introducido es negativo.
        var validate = new ValidatorNum();
        validate.numberValidate(-10);
        // 7. Crea una clase TemperatureChecker que lanza una excepción personalizada si la temperatura es menor a -50 o mayor a 50.

        // 8. Crea un programa con varios bloques catch: uno para ArithmeticException, otro para ArrayIndexOutOfBoundsException.

        // 9. Crea una función checkPassword(String pass) que lance una excepción si la contraseña es demasiado corta.

        // 10. Implementa una clase LoginSystem que use una excepción personalizada LoginFailedException si el usuario o contraseña son incorrectos.
    }

    public static class ValidatorNum {
        public void numberValidate(int number) throws IllegalArgumentException {
            if (number < 0) {
                throw new IllegalArgumentException("No puedes ingresar números negativos");
            }
        }

    }
}
