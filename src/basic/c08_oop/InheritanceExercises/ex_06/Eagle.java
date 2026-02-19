package basic.c08_oop.InheritanceExercises.ex_06;

public class Eagle extends Bird {

    @Override
    public void fly() {
        super.fly();
        System.out.println("El águila vuela más alto y veloz!");
    }


}
