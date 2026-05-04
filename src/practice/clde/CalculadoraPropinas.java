package practice.clde;

import java.util.Scanner;

public class CalculadoraPropinas {
    private static final String TITLE = "=".repeat(13) + " RESUMEN " + "=".repeat(13);
    private static final String SEPARADOR = "=".repeat(35);
    private static final double PERCENTAGE_BASE = 100.0;

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        String name;
        double billAmount;
        int tip, peopleCount;

        System.out.print("Ingresa tu nombre: ");
        name = userInput.nextLine();
        System.out.print("Ingresa el monto total de la cuenta: ");
        billAmount = userInput.nextDouble();
        System.out.print("Que porcentaje de propina deseas dejar: ");
        tip = userInput.nextInt();
        System.out.print("Entre cuantas personas se dividirá la cuenta: ");
        peopleCount = userInput.nextInt();


        double totalTip = billAmount * (tip / PERCENTAGE_BASE);
        double totalBill = billAmount + totalTip;
        double pricePerPersons = totalBill / peopleCount;


        System.out.println(TITLE);
        System.out.printf("Cuenta original: $%.2f%n", billAmount);
        System.out.printf("Propina (%d%%): $%.2f%n", tip, totalTip);
        System.out.printf("Total a pagar: $%.2f%n", totalBill);
        System.out.printf("Cada persona paga: $%.2f%n", pricePerPersons);
        System.out.println(SEPARADOR);
        System.out.printf("¡Gracias %s, vuelve pronto!%n", name);

        userInput.close();
    }
}
