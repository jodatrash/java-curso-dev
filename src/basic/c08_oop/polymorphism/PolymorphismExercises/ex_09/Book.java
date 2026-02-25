package basic.c08_oop.polymorphism.PolymorphismExercises.ex_09;

public class Book extends Product {
    public Book(String name, double price) {
        super(name, price);
    }

    @Override
    public double getPrice() {
        return price * 0.90;
    }
}
