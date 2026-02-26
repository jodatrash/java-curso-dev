package basic.c08_oop.abstraction.AbstractionExercises.ex_05;

public class FullTimeEmployee extends Employee {
    private final double baseSalary;

    public FullTimeEmployee(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double calculateSalary() {
        return baseSalary;
    }
}
