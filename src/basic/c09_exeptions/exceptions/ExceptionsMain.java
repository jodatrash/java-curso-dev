package basic.c09_exeptions.exceptions;

public class ExceptionsMain {
    public static void main(String[] args) {

        /*
         * Manejo de exceptions.
         *
         * Java proporciona mecanismos para detectar y manejar las situaciones
         * de una manera segura, aunque se produzca un error, que el programa no se rompa
         * y que el desarrollador sea capaz de detectar cuál es el error en tiempo de ejecución
         * y llegar a controlarlo.
         */

        // Manejo de excepciones try-catch
        try {
            /*
             * Debe ir el código que potencialmente es susceptible a un error,
             * que potencialmente puede acabar fallando, y en el caso de que falle
             * el programa no se detenga y se rompa.
             */
            var result = 10 / 0;
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
        }

        try {
            var result = 10 / 5;
            System.out.println(result);

            var name = "Jonathan";
            name = null;
            System.out.println("Nombre: " + name.toUpperCase());
        } catch (ArithmeticException e) {
            System.out.println("error: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("[ERROR] Null pointer exception");
        }

        // finally: Capturar errores pero haciendo algo en concreto.
        try {
            var result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("error: " + e.getMessage());
        } finally {
            System.out.println("Acabo el bloque try-catch");
        }

        // throw -> para lanzar excepciones manuales
        var throwExample = new ThrowExample();
//        throwExample.checkAge(16);
        try {
            throwExample.checkAge(15);
        } catch (IllegalArgumentException e) {
            System.out.println("Error revisando la edad: " + e.getMessage()); // Capturando la excepción.
        }

        // Exception personalizada.
        try {
            throwExample.checkScore(415);
        } catch (CustomException e) {
            System.out.println("[ERROR] Revisando puntuación: " + e.getMessage());
        }

        System.out.println("Fin");
    }
}
