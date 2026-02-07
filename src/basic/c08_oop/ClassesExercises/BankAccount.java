package basic.c08_oop.ClassesExercises;

public class BankAccount {
    // 6. Crea una clase BankAccount con atributo balance y un método deposit() que sume el saldo.

    int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount) {
        System.out.println("Saldo actual: " + balance);
        if (amount > 0) {
            balance += amount;
            System.out.println("Has depositado: " + amount);
        } else
            System.out.println("Deposita montos en positivo.");
    }

}
