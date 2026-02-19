package basic.c08_oop.InheritanceExercises.ex_08;

/*
 * 8. Account tiene un saldo y métodos para deposit() y withdraw().
 * SavingsAccount hereda y agrega un método addInterest().
 */

public class Account {

    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void displayBalance() {
        System.out.println("Saldo               : $" + getBalance());
    }

    public void deposit(double amount) {
//        System.out.println("Saldo actual: $" + balance);
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposito            : " + amount);
        } else {
            System.out.println("Deposita montos en positivo.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Retiro              : $" + amount);
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
