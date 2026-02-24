package basic.c08_oop.polymorphism.PolymorphismExercises.ex_06;

public class SMSNotification extends Notification {
    @Override
    public void send() {
        System.out.println("Enviando SMS...");
    }
}
