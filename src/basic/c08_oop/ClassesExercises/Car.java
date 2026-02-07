package basic.c08_oop.ClassesExercises;

public class Car {
    // 4. Crea una clase Car con atributos brand y model y un método showData().
    String brand;
    String model;

    public void showData() {
        System.out.printf("La marca es: %s%n", brand);
        System.out.printf("La modelo es: %s%n", model);
    }
}
