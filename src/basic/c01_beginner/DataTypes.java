package basic.c01_beginner;
/*
 * Clase 02 - Tipos de datos (03/02/2026)
 */
public class DataTypes {
    public static void main(String[] args) {
        // Tipos de datos primitivos.

        // int: enteros sin decimales.
        int myInt = 27;
        System.out.println("myInt = " + myInt);

        //double: enteros con decimales.
        double myDouble = 1.70;
        System.out.println("myDouble = " + myDouble);

        // float, long, byte -> otras interpretaciones a la hora de trabajar con números.

        // char: solo un carácter.
        char character = 'a';
        System.out.println("character = " + character);

        // Boolean: verdadero o falso.
        boolean myBoolean = true;
        System.out.println("myBoolean = " + myBoolean);

        // String: Cadenas de texto, no es primitivo simplemente se usa mucho.
        String myString = "Hola Mundo!";
        System.out.println("myString = " + myString);

        // Saber el tipo de dato en tiempo de compilación.
        /*
         * Esto solo funciona con la clase, es decir String
         * con tipo de datos primitivos (int, char, float, etc. Es posible, pero no viene al caso).
         */
        System.out.println(myString.getClass().getSimpleName());
    }
}
