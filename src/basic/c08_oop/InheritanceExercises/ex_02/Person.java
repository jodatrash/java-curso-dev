package basic.c08_oop.InheritanceExercises.ex_02;

/*
 * 2. Define una clase Person con los atributos name y age.
 * Luego crea una clase Student que agregue el atributo grade y un método study().
 */

public class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
