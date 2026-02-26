package basic.c08_oop.abstraction.AbstractionExercises.ex_06;

public class Car implements Movable {
    String brand;
    int doors;

    public Car(String brand, int doors) {
        this.brand = brand;
        this.doors = doors;
    }

    @Override
    public void move() {
        System.out.println("El carro " + brand + " tiene " + doors + " puertas.");
    }
}
