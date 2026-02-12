package basic.c08_oop.AccessModifiersExercises;

/*
 * 9. Crea una clase Student con el atributo privado grade.
 * Agrega los métodos setGrade(int grade) y isPassed() que retorne true si la nota es mayor o igual a 60.
 */

public class Student {
    private int grade;

    public Student(int grade) {
        this.grade = grade;
    }

    public void setGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        } else {
            System.out.println("SOLO PUEDES TENER CALIFICACIÓN DE 0 A 100");
        }
    }

    public boolean isPassed() {
        return grade >= 60;
    }

    public void displayStatus() {
        if (isPassed()) {
            System.out.println("Felicidades, estas aprobado: " + grade);
        } else {
            System.out.println("Lamentablemente, no aprobaste: " + grade);
        }
    }
}
