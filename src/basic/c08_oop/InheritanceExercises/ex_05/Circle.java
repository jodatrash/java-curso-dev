package basic.c08_oop.InheritanceExercises.ex_05;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void displayData() {
        super.displayData();
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
