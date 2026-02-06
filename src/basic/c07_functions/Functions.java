package basic.c07_functions;

/*
 * Función o Método, es un bloque de código que realiza una tarea especifica y no solo eso, esa función/método/bloque
 * de código lo podemos invocar desde otra parte del programa, para reutilizar ese comportamiento.
 */

import java.util.ArrayList;
import java.util.Arrays;

public class Functions {
    public static void main(String[] args) {

        // Funciones.
        for (int i = 0; i < 5; i++) {
            sendEmail();
        }

        sendEmail();
        sendEmailToUser("Jonathan.dev@test.com");
        sendEmailToUser("Jonathan.dev@test.com", "Jodatrash");
        var users = new ArrayList<>(Arrays.asList("Jonathan.dev@test.com", "Jonathan.test@test.com"));
        sendEmailToUser(users);

        // String status = String.valueOf(sendEmailIsOk()); Guarda el valor del booleano en una string.
        var status = sendEmailIsOk("jonathan@test.com");
        System.out.println(status);

        System.out.println(sendEmailIsOk(""));

        /*
         * public - Se puede acceder desde cualquier parte del código.
         * void - Si no se quiere retornar nada.
         * boolean - Si se quiere retornar true o false.
         * nombreDeLaFuncion - sintaxis lowerCamelCase.
         * () - Parámetros ¿Le quiero mandar información a esa función?
         *
         * static - meter un modificador en la función indicándole que también es estático, igual que la función
         * desde la que se llama.
         * */

    }

    // Función sin parámetros ni retorno
    public static void sendEmail() {
        System.out.println("Hola, Java!");
    }

    // Función con parámetros
    public static void sendEmailToUser(String email) {
        System.out.println("Se envía el email: " + email);
    }

    // Sobrecarga de funciones.
    public static void sendEmailToUser(String email, String username) {
        System.out.printf("Se envía el email al user: %s(%s)%n", username, email); // %n salto de linea.
    }

    public static void sendEmailToUser(ArrayList<String> emails) {
        for (String email : emails) {
            sendEmailToUser(email);
        }
    }

    /*
     * La sobre carga de funciones no funciona si se cambia el tipo de retorno
     * esta solo funciona si se comparten el mismo nombre y a medida que se van cambiando los parámetros.
     *
     */

    // Funciones con retorno
    public static boolean sendEmailIsOk(String email) {
        if (email.isEmpty()){
            return false;
        }
        System.out.println("Se envía el email a: " + email);
        return true;
    }
}
