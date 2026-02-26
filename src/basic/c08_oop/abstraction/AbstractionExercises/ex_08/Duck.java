package basic.c08_oop.abstraction.AbstractionExercises.ex_08;

public class Duck implements Flyable, Swimmable {
    @Override
    public void fly() {
        System.out.println("El pato puede volar");
    }

    @Override
    public void swim() {
        System.out.println("El pato puede nadar");
    }
}
