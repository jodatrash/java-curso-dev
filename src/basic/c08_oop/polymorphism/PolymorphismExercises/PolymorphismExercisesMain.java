package basic.c08_oop.polymorphism.PolymorphismExercises;

import basic.c08_oop.polymorphism.PolymorphismExercises.ex_01.Animal;
import basic.c08_oop.polymorphism.PolymorphismExercises.ex_01.Cat;
import basic.c08_oop.polymorphism.PolymorphismExercises.ex_01.Cow;
import basic.c08_oop.polymorphism.PolymorphismExercises.ex_01.Dog;
import basic.c08_oop.polymorphism.PolymorphismExercises.ex_03.Printer;
import basic.c08_oop.polymorphism.PolymorphismExercises.ex_04.Greeter;
import basic.c08_oop.polymorphism.PolymorphismExercises.ex_05.Bike;
import basic.c08_oop.polymorphism.PolymorphismExercises.ex_05.Car;
import basic.c08_oop.polymorphism.PolymorphismExercises.ex_05.Truck;
import basic.c08_oop.polymorphism.PolymorphismExercises.ex_05.Vehicle;
import basic.c08_oop.polymorphism.PolymorphismExercises.ex_06.EmailNotification;
import basic.c08_oop.polymorphism.PolymorphismExercises.ex_06.Notification;
import basic.c08_oop.polymorphism.PolymorphismExercises.ex_06.SMSNotification;
import basic.c08_oop.polymorphism.PolymorphismExercises.ex_07.Animals;
import basic.c08_oop.polymorphism.PolymorphismExercises.ex_07.Horse;

import java.util.ArrayList;
import java.util.List;

public class PolymorphismExercisesMain {
    public static void main(String[] args) {

        /*
         * 1. Crea una clase Animal con el método makeSound().
         * Luego crea subclases Dog, Cat y Cow que sobrescriban ese método con sonidos diferentes.
         * Llama al método desde una lista de Animal.
         */

        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Cow());

        for (Animal sound : animals) {
            sound.makeSound();
        }

        /*
         * 2. Crea una clase Shape con el método calculateArea().
         * Luego implementa subclases Circle y Rectangle con sus propias fórmulas.
         * Usa una lista de Shape para recorrer e imprimir el área de varias figuras.
         */



        /*
         * 3. Crea una clase Printer con varios métodos print() sobrecargados
         * que acepten diferentes tipos de parámetros (String, int, double).
         * Llama a cada uno desde main.
         */

        var printer = new Printer();
        printer.display();
        System.out.println(printer.value(1));
        System.out.println(printer.value("Hola"));
        System.out.println(printer.value(3.5));


        /*
         * 4. Crea una clase Greeter con dos métodos greet():
         * uno que salude con “Hello”, y otro que reciba un
         * nombre y salude con “Hello, [nombre]”.
         * */

        var greeter = new Greeter();
        greeter.greet();
        greeter.greet("Jonathan");

        /*
         * 5. Crea una clase Vehicle con un método start().
         * Luego crea Car, Bike y Truck que sobrescriban ese método.
         * Recorre una lista ArrayList<Vehicle> para llamar a start() en cada uno.
         * */

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car());
        vehicles.add(new Bike());
        vehicles.add(new Truck());

        for (Vehicle vehicle : vehicles) {
            vehicle.start();
        }

        /*
         * 6. Crea una clase Notification con método send(),
         * y subclases EmailNotification, SMSNotification.
         * Luego crea una función sendNotification(Notification n) que reciba cualquier tipo y lo ejecute.
         */

        var email = new EmailNotification();
        var sms = new SMSNotification();

        endNotification(email);
        endNotification(sms);

        endNotification(new EmailNotification());
        endNotification(new SMSNotification());
        endNotification(new Notification());

        /*
         * 7. Crea una función showAnimalType(Animal animal) que imprima el tipo de animal.
         * Pasa diferentes subclases (Dog, Cat, Horse) para que cada una imprima su tipo con su
         * propio getType() sobrescrito.
         */

        showAnimalType(new basic.c08_oop.polymorphism.PolymorphismExercises.ex_07.Cat());
        showAnimalType(new basic.c08_oop.polymorphism.PolymorphismExercises.ex_07.Dog());
        showAnimalType(new Horse());

        // 8. Crea una clase Converter con métodos convert(int), convert(double), y convert(String) que devuelvan diferentes formatos de texto.

        // 9. Crea una clase Product con el método getPrice(). Luego, Book y Electronic deben sobrescribirlo con su propia lógica de descuento. Recorre una lista de Product e imprime el precio final de cada uno.

        // 10. Crea una clase Character con método attack(). Luego crea subclases Warrior, Archer, Mage con ataques diferentes. En main, crea un array de Character y llama a attack() para cada uno.
    }

    public static void endNotification(Notification n) {
        n.send();
    }

    public static void showAnimalType(Animals animal) {
        System.out.println("El animal es: " + animal.getType());
    }
}
