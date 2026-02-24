package basic.c08_oop.polymorphism.PolymorphismExercises.ex_01;

public class Cow extends Animal {
    @Override
    public void makeSound() {
        System.out.println("La vaca hace: Muu!");
    }
}
