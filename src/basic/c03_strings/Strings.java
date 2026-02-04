package basic.c03_strings;

/*
 * Clase 04 - Cadenas de texto (03/02/2026)
 */
public class Strings {
    public static void main(String[] args) {
        // Cadenas de texto.

        // declaración
        String text = "  Hola esto es un texto  ";
        String name = "Jonathan";
        int age = 17;

        //Concatenación
        System.out.println(name + " " + text);
        //length : longitud
        System.out.println(name.length()); // 8
        // CharAt : Obtener carácter.
        System.out.println(name.charAt(name.length() - 1)); // 8 - 1 = 7 = n
        // Substrings : Subcadenas
        System.out.println(name.substring(1)); // onathan
        System.out.println(name.substring(0, 4)); // Jona
        // toUpperCase
        System.out.println(name.toUpperCase()); // JONATHAN
        // toLowerCase
        System.out.println(name.toLowerCase()); // jonathan

        // Comparar si contiene
        System.out.println("Hola, Java!".contains("Hola"));
        System.out.println("Hola, Java!".contains("!"));
        System.out.println("Hola, Java!".contains("JAVA"));

        // Equals / Comparación
        System.out.println(name);
        System.out.println("Jonathan " + name.equals("Jonathan"));
        System.out.println("jonathan " + name.equalsIgnoreCase("jonathan"));
        System.out.println("jonathan " + name.equalsIgnoreCase("jonatan"));

        // == o equals
        /*
         * equals compara contenido, sin importar el objeto.
         */
        String a = "Joda";
        String b = "Joda";
        String c = new String("Joda");

        System.out.println(a == b); // true
        System.out.println(a == c); // false
        System.out.println(a.equalsIgnoreCase(b)); // true

        // trim y replace
        System.out.println(text);
        System.out.println(text.trim());

        // replace
        System.out.println(text.replace(" ", "-"));

        // format
        /*
         * %s = cadenas de texto
         * %d = números enteros
         * %f = números decimales
         */
        System.out.println(String.format("Hola, %s. tu edad es: %d", name, age));


    }
}
