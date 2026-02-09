package basic.c08_oop.AccessModifiersExercises;

/*
 * 3. Crea una clase BankAccount con el atributo privado balance.
 * Implementa los métodos deposit(double amount) y withdraw(double amount)
 * que validen las cantidades correctamente.
 */

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Éxito: Se ha depositado correctamente la cantidad de : $" + amount);
        } else {
            errorMessage();
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Éxito: Se ha retirado correctamente la cantidad de : $" + amount);
        } else {
            errorMessage();
        }
    }

    public void errorMessage() {
        System.out.println("Error: El monto ingresado no es correcto, o no cuentas con fondos suficientes.");
    }

    public double getBalance() {
        return balance;
    }
}
