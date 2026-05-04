package practice.clde;

import java.util.Scanner;

public class GestorNotas {
    private static final String TITLE = "=".repeat(13) + " GESTOR DE NOTAS " + "=".repeat(13);
    private static final String SEPARATOR = "=".repeat(43);

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
                    System.out.println("Ingresa la cantidad de alumnos en el grupo");
                    int totalStudents = userInput.nextInt();
                    if (totalStudents < 1) {
                        System.out.println("La cantidad ingresada no puede ser menor a 1.");
                    }
                    for (int i = 0; i <= totalStudents; i++) {
                        System.out.print("Ingresa la nota del alumno: ");
                        double notes = userInput.nextDouble();
                        notes =+ notes;
                        System.out.printf("Suma de notas: %.2f%n", notes);

                    }
                    break;
                case 2:
                    System.out.println("2");
                    break;
                case 3:
                    System.out.println("3");
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

