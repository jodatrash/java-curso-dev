package basic.c08_oop.polymorphism.PolymorphismExercises.ex_05;

public class Truck extends Vehicle {
    @Override
    public void start() {
        System.out.println("El camión anda por diesel.");
    }
}
