package basic.c08_oop.polymorphism.PolymorphismExercises.ex_09;

public class Product {
    double price;
    String name;

    public Product(String name,double price ) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
