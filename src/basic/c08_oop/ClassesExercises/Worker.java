package basic.c08_oop.ClassesExercises;

public class Worker {
    // 8. Crea una clase Worker que reciba nombre y salario, y un método para mostrar su salario.

    String name;
    int salary;

    public Worker(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

}
