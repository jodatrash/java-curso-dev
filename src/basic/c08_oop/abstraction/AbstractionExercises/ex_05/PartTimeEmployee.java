package basic.c08_oop.abstraction.AbstractionExercises.ex_05;

public class PartTimeEmployee extends Employee {
    double hoursWorked;
    double hourlyRate;

    public PartTimeEmployee(double hoursWorked, double hourlyRate) {
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}
