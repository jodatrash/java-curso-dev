package basic.c08_oop.ClassesExercises;

public class Rectangle {

    double base;
    double height;

    public Rectangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        double area = base * height;
        return area;
    }

    public double getPerimeter() {
        double perimeter = 2 * (base + height);
        return perimeter;
    }
}
