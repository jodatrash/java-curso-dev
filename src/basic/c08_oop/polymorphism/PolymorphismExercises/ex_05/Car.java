package basic.c08_oop.polymorphism.PolymorphismExercises.ex_05;

public class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("El coche anda por motor con gasolina.");
    }
}
