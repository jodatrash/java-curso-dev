package basic.c08_oop.ClassesExercises;

public class Dog {
    // 2. Crea una clase Dog con un método bark() que imprima su sonido.
    String sound;

    public Dog(String sound) {
        this.sound = sound;
    }

    public void bark() {
        System.out.println("El sonido es: " + sound);
    }
}
