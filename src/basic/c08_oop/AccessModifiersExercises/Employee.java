package basic.c08_oop.AccessModifiersExercises;

/*
 * 7. Crea una clase Employee con el atributo privado salary.
 * Agrega el método raiseSalary(double percent) que solo permita aumentos positivos.
 */

public class Employee {
    private double salary;

    public Employee(double salary) {
        this.salary = salary;
    }

    public void raiseSalary(double percent) {
        if (percent > 0) {
            double amount = (salary * percent) / 100;
            salary += amount;
        } else {
            System.out.println("No se puede realizar la operación.");
        }
    }

    public double getSalary() {
        return salary;
    }
}
