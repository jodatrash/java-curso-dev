package basic.c08_oop.abstraction.AbstractionExercises.ex_07;

public class TV extends Appliance {
    @Override
    public void turnOn() {
        System.out.println("La televisión esta encendida...");
    }

    @Override
    public void turnOff() {
        System.out.println("La televisión esta apagada...");
    }
}
