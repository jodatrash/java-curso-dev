package basic.c08_oop.polymorphism.PolymorphismExercises.ex_01;

public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("El gato hace: Meow!");
    }
}
