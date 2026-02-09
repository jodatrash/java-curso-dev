package basic.c08_oop;

public class Classes {
    public static void main(String[] args) {
        Person person = new Person("Jonathan", 27, "123456789A");
        person.greetings();

        // No se puede acceder directamente al "id" como atributo o propiedad.
        // System.out.println(person.id);

        // Pero se tiene la función para acceder y obtener el "id"
        System.out.println(person.getId());

        // Con esto si se puede acceder y actualizar la edad, ya que se tiene un setter.
        person.setAge(50);
        System.out.println(person.getAge()); // Pero se tiene la función para acceder y obtener "age"

        // String surname = person.name = "Jodatrash";
        // System.out.println(surname);
    }

}

