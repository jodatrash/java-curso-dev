package basic.c08_oop.polymorphism.PolymorphismExercises.ex_10;

public class Warrior extends Character {
    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(name + " Usa la fuerza.");
    }
}
