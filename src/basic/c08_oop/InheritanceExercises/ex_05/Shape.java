package basic.c08_oop.InheritanceExercises.ex_05;

/*
 * 5. Crea una clase abstracta Shape con un método calculateArea().
 * Luego implementa ese método en Circle y Rectangle.
 *
 */

public abstract class Shape {
    public abstract double calculateArea();

    public void displayData() {
        System.out.println("El area es: " + calculateArea());
    }
}
