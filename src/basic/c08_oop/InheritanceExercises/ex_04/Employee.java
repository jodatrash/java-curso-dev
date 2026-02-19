package basic.c08_oop.InheritanceExercises.ex_04;

/*
 * 4. La clase Employee tiene los atributos name y salary.
 * Manager hereda de Employee y agrega el atributo department.
 */

public class Employee {
    private int salary;
    private String name;

    public Employee(int salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }
}
