package basic.c08_oop.InheritanceExercises.ex_08;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(double balance, double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }

    @Override
    public void displayBalance() {
        super.displayBalance();
    }

    public void addInterest() {
        double interest = getBalance() * interestRate;
        deposit(interest);
        System.out.println("Interés aplicado    : $" + interest);
    }
}
