package basic.c08_oop.InheritanceExercises.ex_04;

public class Manager extends Employee {
    private String department;

    public Manager(int salary, String name, String department) {
        super(salary, name);
        this.department = department;
    }

    public void displayInfo() {
        System.out.println("Nombre      : " + getName());
        System.out.println("Salario     : $" + getSalary());
        System.out.println("Departamento: " + getDepartment());
    }

    private String getDepartment() {
        return department;
    }
}
