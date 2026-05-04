package practice.clde;

import java.util.Scanner;

public class EvaluacionEmpleado {
    private static final String TITLE = "=".repeat(13) + " EVALUACIÓN " + "=".repeat(13);
    private static final String SEPARATOR = "=".repeat(38);

    private static final int BONUS_LOW = 5_000;
    private static final int BONUS_MID = 10_000;
    private static final int BONUS_HIGH = 20_000;


    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Ingresa el nombre del empleado: ");
        String name = userInput.nextLine();
        System.out.print("Ingresa los años de antigüedad del empleado: ");
        int yearsOfService = userInput.nextInt();
        System.out.print("Ingresa la calificación de desempeño anual [0.0 - 10.0]: ");
        double annualReview = userInput.nextDouble();
        System.out.println("Lista de departamentos.");
        System.out.printf("[1] - Ventas.%n[2] - Tecnología.%n[3] - RRHH.%n[4] - Operaciones.%n");
        System.out.print("Selecciona la opción correspondiente [1 - 4]: ");
        int department = userInput.nextInt();

        String employeeDepartment = switch (department) {
            case 1 -> "Ventas";
            case 2 -> "Tecnología";
            case 3 -> "RRHH";
            case 4 -> "Operaciones";
            default -> "No existe la opción: " + department;
        };

        int bonus;
        if (yearsOfService < 2) {
            bonus = BONUS_LOW;
        } else if (yearsOfService <= 5) {
            bonus = BONUS_MID;
        } else {
            bonus = BONUS_HIGH;
        }

        double multiplier;
        String resultOfEvaluation;
        if (annualReview < 6.0) {
            multiplier = 0.5;
            resultOfEvaluation = "Necesita mejorar";
        } else if (annualReview < 8.0) {
            multiplier = 1.0;
            resultOfEvaluation = "Desempeño aceptable";
        } else if (annualReview < 9.0) {
            multiplier = 1.5;
            resultOfEvaluation = "Buen desempeño";
        } else {
            multiplier = 2.0;
            resultOfEvaluation = "Desempeño excelente";
        }

        double finalBonus = bonus * multiplier;

        System.out.println(TITLE);
        System.out.printf("Empleado: %s%n", name);
        System.out.printf("Departamento: %s%n", employeeDepartment);
        System.out.printf("Antigüedad: %d años%n", yearsOfService);
        System.out.printf("Calificación: %.1f%n", annualReview);
        System.out.printf("Desempeño: %s%n", resultOfEvaluation);
        System.out.printf("Bono a recibir: $%.2f%n", finalBonus);
        System.out.println(SEPARATOR);

        userInput.close();
    }
}
