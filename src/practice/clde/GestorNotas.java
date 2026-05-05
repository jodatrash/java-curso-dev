package practice.clde;

import java.util.Random;
import java.util.Scanner;

public class GestorNotas {
    private static final String TITLE = "=".repeat(13) + " GESTOR DE NOTAS " + "=".repeat(13);
    private static final String SEPARATOR = "=".repeat(43);
    private static final char CLEAR_TERMINAL = ' ';
    private static final int MAX_BLANK_LINES = 100;
    private static final int MAX_ATTEMPTS = 7;

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String[] menu = {
                "[1] Ingresar notas de un grupo de alumnos.",
                "[2] Mostrar tabla de multiplicar.",
                "[3] Adivinar el número.",
                "[0] Salir."
        };

        int option;
        do {
            System.out.println(TITLE);
            for (String displayMenu : menu) {
                System.out.println(displayMenu);
            }
            System.out.println(SEPARATOR);
            System.out.print("Selecciona una opción: ");
            option = userInput.nextInt();


            switch (option) {
                case 1:
                    for (int cls = 0; cls <= MAX_BLANK_LINES - 1; cls++) {
                        System.out.println(CLEAR_TERMINAL);
                    }

                    System.out.print("Ingresa la cantidad de alumnos en el grupo: ");
                    int totalStudents = userInput.nextInt();
                    if (totalStudents <= 0) {
                        System.out.println("El número de alumnos debe ser mayor a 0.");
                    } else {
                        double addition = 0;
                        int approved = 0;
                        int failed = 0;
                        double noteMin = Integer.MAX_VALUE, noteMax = Integer.MIN_VALUE;

                        for (int i = 0; i < totalStudents; i++) {
                            System.out.printf("Ingresa la nota del alumno [%d]: ", i + 1);
                            double notes = userInput.nextDouble();

                            while (notes < 0 || notes > 10) {
                                System.out.println("Nota invalida...");
                                System.out.printf("Ingresa la nota del alumno [%d]: ", i + 1);
                                notes = userInput.nextDouble();
                            }
                            addition += notes;
                            if (notes > noteMax) noteMax = notes;
                            if (notes < noteMin) noteMin = notes;

                            if (notes >= 6.0) {
                                approved++;
                            } else {
                                failed++;
                            }
                        }
                        System.out.println(SEPARATOR);
                        System.out.printf("Promedio del grupo: %.2f%n", addition / totalStudents);
                        System.out.printf("La calificación más alta es: %.1f%n", noteMax);
                        System.out.printf("La calificación más baja es: %.1f%n", noteMin);
                        System.out.printf("Alumnos aprobados: %d%n", approved);
                        System.out.printf("Alumnos reprobados: %d%n", failed);
                        System.out.println(SEPARATOR);
                    }
                    break;
                case 2:
                    for (int cls = 0; cls <= MAX_BLANK_LINES - 1; cls++) {
                        System.out.println(CLEAR_TERMINAL);
                    }
                    System.out.print("Que tabla de multiplicar deseas ver: ");
                    int number = userInput.nextInt();
                    System.out.print("Hasta que limite desea multiplicar: ");
                    int limit = userInput.nextInt();
                    for (int i = 0; i <= limit; i++) {
                        System.out.printf("%d * %d = %d%n", number, i, number * i);
                    }
                    break;
                case 3:
                    Random random = new Random();
                    int secretNumber = random.nextInt(100) + 1;
                    boolean guess = false;

                    for (int cls = 0; cls <= MAX_BLANK_LINES - 1; cls++) {
                        System.out.println(CLEAR_TERMINAL);
                    }

                    for (int attempt = 1; attempt <= MAX_ATTEMPTS; attempt++) {
                        System.out.printf("Intento: #%d ¿Cuál crees que es?:", attempt);
                        int userInputNumber = userInput.nextInt();
                        if (userInputNumber == secretNumber) {
                            System.out.printf("¡FELICIDADES!, haz acertado al número: %d, a los %d intentos%n", secretNumber, attempt);
                            guess = true;
                            break;
                        } else if (secretNumber > userInputNumber) {
                            System.out.println("El número secreto es mayor.");
                        } else {
                            System.out.println("El número secreto es menor.");
                        }
                        if (!guess) {
                            System.out.printf("Se te acabaron los intentos, el número era: %d%n", secretNumber);
                        }
                    }
                    break;
                case 0:
                    System.out.println("Saliendo del aplicativo.");
                    break;
                default:
                    System.out.println("No existe esa opción.");
            }
        } while (option != 0);
    }

}

