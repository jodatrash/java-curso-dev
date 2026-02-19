package basic.c08_oop.InheritanceExercises.ex_02;

public class Student extends Person{
    private double grade;

    public Student(String name, int age, double grade) {
        super(name, age);
        this.grade = grade;
    }

    public void study() {
        System.out.println("Nombre: " + getName());
        System.out.println("Edad: " + getAge());
        System.out.println("Grado: " + getGrade());
    }

    private double getGrade() {
        return grade;
    }
}
