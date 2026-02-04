package basic.c03_strings;

public class StringExercises {
    public static void main(String[] args) {
        // 1. Concatena dos cadenas de texto.
        String greetings = "Saludos desde java, mucho justo: ";
        String name = "Jonathan";
        int age = 0;
        System.out.println(greetings + name);

        // 2. Muestra la longitud de una cadena de texto.

        System.out.println("longitud de la variable greetings: " + greetings.length());

        // 3. Muestra el primer y último carácter de un string.
        System.out.println("La variable a leer es name: " + name);
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(name.length() - 1));
        // 4. Convierte a mayúsculas y minúsculas un string.
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        // 5. Comprueba si una cadena de texto contiene una palabra concreta.
        System.out.println(name.equals("Jonathan")); // true
        // 6. Formatea un string con un entero.
        age = 20;
        System.out.println(String.format("Hola bienvenido tu edad es: %d", age));

        // 7. Elimina los espacios en blanco al principio y final de un string.
        String exampleText = "  esto es un mensaje con espacios al principio y al final  ";
        System.out.println(exampleText);
        System.out.println(exampleText.trim());

        // 8. Sustituye todos los espacios en blanco de un string por un guion (-).
        System.out.println(exampleText.replace(" ", "-"));

        // 9. Comprueba si dos strings son iguales.
        String firstText = "Es igual";
        String secondText = "Es igual";

        System.out.println(firstText.equals(secondText)); // true

        // 10. Comprueba si dos strings tienen la misma longitud.
        int x = firstText.length();
        int y = secondText.length();

        System.out.println(x == y); //true
    }
}
