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
    private String name;
    int age;
    final private String id; // Eliminamos la posibilidad de poder editar "id";

    // Constructor.
    /*
     * Con esto obligamos al usuario a meter el nombre de la persona y la edad.
     */
    public Person(String name, int age, String id) {
        this.name = name;
        this.setAge(age);
        this.id = id;
    }

    // Métodos.
    public void greetings() {
        System.out.println("Hola, soy " + name + " y tengo " + age + " años. " + id);
    }

    // Crear método auxiliar para acceder al valor.
    // Tenemos la oportunidad de acceder al id, pero no de modificarlo.
    // Getter.
    public String getId() {
        return id;
    }

    // Con los setter nos permite establecer un criterio, para este caso establecer la edad.
    // Setter
    /*
     * Caso de uso:
     * No se requiere que el usuario ingrese números en negativos.
     */
    // Creando un getter para poder obtener la edad sin exponer el atributo age.

    public int getAge() {
        return age;
    }

    public int setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Edad no valida!");
        }
        return age;
    }

}
