package basic.c08_oop.abstraction.AbstractionExercises.ex_07;

public class WashingMachine extends Appliance {
    @Override
    public void turnOn() {
        System.out.println("La lavadora esta encendida...");
    }

    @Override
    public void turnOff() {
        System.out.println("La lavadora esta apagada...");
    }
}
