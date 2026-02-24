package basic.c08_oop.polymorphism.PolymorphismExercises.ex_02;

public class Shape {
    public static void main(String[] args) {

        var circle = new Circle(5);
        var rectangle = new Rectangle(5, 5);

        System.out.println(circle.area());
        System.out.println(rectangle.area());
    }

    public static class Circle extends Shape {
        private final double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        public double area() {
            return Math.PI * radius * radius;
        }

    }

    public static class Rectangle extends Shape {
        private final double width;
        private final double height;

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        public double area() {
            return width * height;
        }
    }
}
