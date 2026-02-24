package basic.c08_oop.polymorphism.PolymorphismExercises.ex_01;

public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("El perro hace: Woof!");
    }
}
