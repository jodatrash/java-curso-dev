package basic.c08_oop.polymorphism.PolymorphismExercises.ex_10;

public class Mage extends Character{
    public Mage(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(name + " Usa magia.");
    }
}
