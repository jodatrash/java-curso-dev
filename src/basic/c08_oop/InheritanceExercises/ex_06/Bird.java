package basic.c08_oop.InheritanceExercises.ex_06;

/*
 * 6. Crea una clase Bird con el método fly().
 * Luego crea Eagle que sobrescriba fly() pero también llame al método original con super.fly().
 */

public class Bird {
    public void fly() {
        System.out.println("El pájaro está volando!");
    }
}
