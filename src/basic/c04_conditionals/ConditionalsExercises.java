package basic.c04_conditionals;

public class ConditionalsExercises {
    public static void main(String[] args) {
        // 1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a 18).
        int age = 18;
        if (age > 18) {
            System.out.println("Puedes votar");
        } else if (age == 18) {
            System.out.println("Acabas de cumplir los 18");
        } else
            System.out.println("No puedes votar");

        // 2. Declara dos números y muestra cuál es mayor, o si son iguales.
        int numOne, numTwo;
        numOne = 15;
        numTwo = 5;
        if (numOne > numTwo) {
            System.out.println("Número 1 es mayor");
        } else if (numOne == numTwo) {
            System.out.println("Los números son iguales");
        } else
            System.out.println("El número 2 es mayor");

        // 3. Dado un número, verifica si es positivo, negativo o cero.
        int numVal = 10;
        if (numVal > 0) {
            System.out.println("El número es positivo");
        } else if (numVal == 0) {
            System.out.println("El número es 0");
        } else
            System.out.println("El numero es negativo");

        // 4. Crea un programa que diga si un número es par o impar.
        int numPar = 10;
        if (numPar % 2 == 0) {
            System.out.println("Es par");
        } else
            System.out.println("No es par");
        // 5. Verifica si un número está en el rango de 1 a 100.
        int range = 0;
        if (range >= 1 && range <= 100) {
            System.out.println("Esta en el rango del 1 al 100");
        } else
            System.out.println("Esta fuera del rango");
        // 6. Declara una variable con el día de la semana (1-7) y muestra su nombre con switch.
        int dayOfWeek = 1;
        String message;
        switch (dayOfWeek) {
            case 1 -> {
                message = "Lunes";
                System.out.println(message);
            }
            case 2 -> {
                message = "Martes";
                System.out.println(message);
            }
            case 3 -> {
                message = "Miércoles";
                System.out.println(message);
            }
            case 4 -> {
                message = "Jueves";
                System.out.println(message);
            }
            case 5 -> {
                message = "Viernes";
                System.out.println(message);
            }
            case 6 -> {
                message = "Sábado";
                System.out.println(message);
            }
            case 7 -> {
                message = "Domingo";
                System.out.println(message);
            }
        }
        // 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o "Suspenso" según la nota (0-100).
        int note = 100;
        if (note < 70 ){
            System.out.println("Suspenso");
        }else if (note == 100){
            System.out.println("Sobresaliente");
        }else
            System.out.println("Aprobado");
        // 8. Escribe un programa que determine si puedes entrar al cine: debes tener al menos 15 años o ir acompañado.

        // 9. Crea un programa que diga si una letra es vocal o consonante.

        // 10. Usa tres variables a, b, c y muestra cuál es el mayor de las tres.
    }
}
