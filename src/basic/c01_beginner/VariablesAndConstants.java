package basic.c01_beginner;

/*
 * Clase 02 - Variables y constantes (03/02/2026)
 */

public class VariablesAndConstants {
    public static void main(String[] args) {
        // Variables

        // String
        String name = "Jonathan";
        System.out.println(name);

        name = "Jodatrash";
        // int
        int age = 27;
        System.out.println(age);
        System.out.println(name);

        // var

        /*
         * Inferencia de tipos
         */

        var email = "Jonathan.test@test.com";
        System.out.println(email);

        // Constantes

        /*
         * Buenas prácticas con las constantes
         * 1.- Siempre en mayúsculas
         * 2.- Agregar un final para especificar que es una constante.
         */

        final String EMAIL = "Jonathan.test@test.com";
        System.out.println(EMAIL);
    }
}
