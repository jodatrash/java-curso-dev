package basic.c08_oop;

public class Classes {
    public static void main(String[] args) {
        Person person = new Person("Jonathan", 27);
        person.greetings();

        String surname = person.name = "Jodatrash";
        System.out.println(surname);
    }

}

