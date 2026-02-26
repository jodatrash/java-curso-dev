package basic.c08_oop.abstraction.AbstractionExercises.ex_10;

public class EmployeePayment implements Payable {
    private final String nameEmployee;
    private final double amount;

    public EmployeePayment(String nameEmployee, double amount) {
        this.nameEmployee = nameEmployee;
        this.amount = amount;
    }

    @Override
    public void pay() {
        System.out.println("=".repeat(55));
        System.out.println("Transfiriendo: $" + amount + " para " + nameEmployee);
    }
}
