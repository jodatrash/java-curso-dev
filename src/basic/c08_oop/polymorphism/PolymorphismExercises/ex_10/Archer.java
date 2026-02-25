package basic.c08_oop.polymorphism.PolymorphismExercises.ex_10;

public class Archer extends Character{
    public Archer(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(name + " Ataca con arco y flecha");
    }
}
