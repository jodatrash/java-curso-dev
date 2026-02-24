package basic.c08_oop.polymorphism;

public class Dog extends Animal {
    // 1 - Polimorfismo por herencia (Sobre escritura).
    @Override
    public void sound() {
        System.out.println("Woof!");
    }
}
