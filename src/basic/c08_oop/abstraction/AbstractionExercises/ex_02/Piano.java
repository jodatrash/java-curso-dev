package basic.c08_oop.abstraction.AbstractionExercises.ex_02;

public class Piano implements Playable {
    @Override
    public void play() {
        System.out.println("Esto es un piano.");
    }
}
