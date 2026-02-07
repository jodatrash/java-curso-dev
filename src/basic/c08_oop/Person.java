package basic.c08_oop;

/*
 * Tienen 2 principales características
 * puede almacenar comportamientos y atributos.
 */

public class Person {

    /*
     * Estructura:
     * Habitualmente se crea:
     * 1.- Atributos
     * 2.- Constructores
     * 3.- Métodos.
     *
     * Constructor.
     *
     * Mecanismo más importante dentro de las clases y dentro de la programación orientada a objetos.
     *
     * ¿Qué es el constructor?
     * El constructor de clase, permite inicializar el objeto con valores, desde el momento de su creación,
     * obligando a que si se requiere instanciar una clase, la clase debe contener valores.
     */

    // Atributos.
    String name;
    int age;

    // Constructor.
    /*
     * Con esto obligamos al usuario a meter el nombre de la persona y la edad.
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Métodos.
    public void greetings() {
        System.out.println("Hola, soy " + name + " y tengo " + age + " años.");
    }


}
