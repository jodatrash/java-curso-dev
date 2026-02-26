package basic.c08_oop.abstraction.AbstractionExercises.ex_06;

public class Robot implements Movable {
    String model;
    double price;

    public Robot(String model, double price) {
        this.model = model;
        this.price = price;
    }

    @Override
    public void move() {
        System.out.println("El robot " + model + " tiene un precio de: $" + price);
    }
}
