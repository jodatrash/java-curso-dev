package basic.c08_oop.polymorphism.PolymorphismExercises.ex_06;

public class EmailNotification extends Notification {
    @Override
    public void send() {
        System.out.println("Enviando email...");
    }
}
