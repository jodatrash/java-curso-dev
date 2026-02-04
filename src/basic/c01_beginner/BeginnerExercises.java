package basic.c01_beginner;

public class BeginnerExercises {
    public static void main(String[] args) {
        // 1.- Declara una variable de tipo String y asígnale tu nombre.
        String name = "Jonathan";
        System.out.println("name = " + name);

        // 2. Crea una variable de tipo int y asígnale tu edad.
        int age = 27;
        System.out.println("age = " + age);

        // 3. Crea una variable double con tu altura en metros.
        double stature = 1.70;
        System.out.println("stature = " + stature);

        // 4. Declara una variable de tipo boolean que indique si te gusta programar.
        boolean iLikeProg = true;
        System.out.println("Me gusta programar? = " + iLikeProg);

        // 5. Declara una constante con tu email.
        final String EMAIL = "Jonathan.dev@test.com";
        System.out.println("EMAIL = " + EMAIL);

        // 6. Crea una variable de tipo char y guárdale tu inicial.
        char initial = 'J';
        System.out.println("initial = " + initial);

        // 7. Declara una variable de tipo String con tu localidad, y a continuación cambia su valor y vuelve a imprimirla.
        String location = "Veracruz";
        System.out.println("location = " + location);
        location = "Tamaulipas";
        System.out.println("location = " + location);

        // 8. Crea una variable int llamada a, otra b, e imprime la suma de ambas.
        int a, b;
        a = 10;
        b = 5;
        System.out.println("a + b = " + (a + b));

        // 9. Imprime el tipo de dos variables creadas anteriormente.
        System.out.println(((Object) name).getClass().getSimpleName());
        System.out.println(((Object) initial).getClass().getSimpleName());

        // 10. Intenta declarar una variable sin inicializarla y luego asígnale un valor antes de imprimirla.
        int x;
        x = 10;
        System.out.println(x);

    }
}
