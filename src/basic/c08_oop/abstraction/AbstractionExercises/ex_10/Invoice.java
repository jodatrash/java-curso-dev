package basic.c08_oop.abstraction.AbstractionExercises.ex_10;

public class Invoice implements Payable {
    private final String vendor;
    private final double amount;

    public Invoice(String vendor, double amount) {
        this.vendor = vendor;
        this.amount = amount;
    }

    @Override
    public void pay() {
        System.out.println("=".repeat(55));
        System.out.println("Generando ticket con la cantidad: $" + amount + " para " + vendor);
    }
}
