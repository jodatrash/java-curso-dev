package basic.c08_oop.abstraction.AbstractionExercises;

import basic.c08_oop.abstraction.AbstractionExercises.ex_01.Circle;
import basic.c08_oop.abstraction.AbstractionExercises.ex_01.Rectangle;
import basic.c08_oop.abstraction.AbstractionExercises.ex_02.Guitar;
import basic.c08_oop.abstraction.AbstractionExercises.ex_02.Piano;
import basic.c08_oop.abstraction.AbstractionExercises.ex_03.Animal;
import basic.c08_oop.abstraction.AbstractionExercises.ex_03.Cat;
import basic.c08_oop.abstraction.AbstractionExercises.ex_03.Dog;
import basic.c08_oop.abstraction.AbstractionExercises.ex_04.Drawable;
import basic.c08_oop.abstraction.AbstractionExercises.ex_04.Square;
import basic.c08_oop.abstraction.AbstractionExercises.ex_04.Triangle;
import basic.c08_oop.abstraction.AbstractionExercises.ex_05.Employee;
import basic.c08_oop.abstraction.AbstractionExercises.ex_05.FullTimeEmployee;
import basic.c08_oop.abstraction.AbstractionExercises.ex_05.PartTimeEmployee;
import basic.c08_oop.abstraction.AbstractionExercises.ex_06.Car;
import basic.c08_oop.abstraction.AbstractionExercises.ex_06.Movable;
import basic.c08_oop.abstraction.AbstractionExercises.ex_06.Robot;
import basic.c08_oop.abstraction.AbstractionExercises.ex_07.Appliance;
import basic.c08_oop.abstraction.AbstractionExercises.ex_07.TV;
import basic.c08_oop.abstraction.AbstractionExercises.ex_07.WashingMachine;
import basic.c08_oop.abstraction.AbstractionExercises.ex_08.Duck;
import basic.c08_oop.abstraction.AbstractionExercises.ex_09.PDFDocument;
import basic.c08_oop.abstraction.AbstractionExercises.ex_09.WordDocument;
import basic.c08_oop.abstraction.AbstractionExercises.ex_10.EmployeePayment;
import basic.c08_oop.abstraction.AbstractionExercises.ex_10.Invoice;
import basic.c08_oop.abstraction.AbstractionExercises.ex_10.Payable;

import java.util.ArrayList;
import java.util.List;

public class AbstractionExercisesMain {
    public static void main(String[] args) {
        /*
         * 1. Crea una clase abstracta Shape con el método calculateArea().
         * Luego implementa dos subclases: Circle y Rectangle,
         * y haz que cada una calcule su propia área.
         */
        var circle = new Circle(5);
        var rectangle = new Rectangle(5, 5);
        System.out.println(circle.calculateArea());
        System.out.println(rectangle.calculateArea());

        /*
         * 2. Crea una interfaz Playable con el método play().
         * Luego implementa esa interfaz en dos clases: Guitar y Piano.
         * Cada una debe mostrar un mensaje diferente al ejecutarse.
         */
        var guitar = new Guitar();
        var piano = new Piano();
        guitar.play();
        piano.play();

        /*
         * 3. Define una clase abstracta Animal con el método makeSound().
         * Implementa Dog y Cat para que hagan sonidos distintos.
         * Crea un array de Animal para mostrar polimorfismo.
         */
        Animal[] animals = {
                new Cat(),
                new Dog()
        };
        for (Animal list : animals) {
            list.makeSound();
        }

        /*
         * 4. Crea una interfaz Drawable.
         * Implementa las clases Circle, Square, y Triangle
         * que muestren cómo se dibuja cada figura usando draw().
         */

        List<Drawable> shapes = new ArrayList<>();
        shapes.add(new Triangle());
        shapes.add(new basic.c08_oop.abstraction.AbstractionExercises.ex_04.Circle());
        shapes.add(new Square());
        for (Drawable shape : shapes) {
            shape.draw();
        }

        /*
         * 5. Crea una clase abstracta Employee con un método calculateSalary().
         * Implementa FullTimeEmployee y PartTimeEmployee con lógica diferente para calcular el salario.
         */
        Employee[] employees = {
                new FullTimeEmployee(500),
                new PartTimeEmployee(40, 12.0)
        };
        for (Employee emp : employees) {
            System.out.println("Salario es: " + emp.calculateSalary());
        }

        /*
         * 6. Crea una interfaz Movable con el método move().
         * Haz que las clases Car y Robot implementen ese método con comportamientos diferentes.
         */
        Movable[] type = {
                new Car("Toyota", 4),
                new Robot("tesla", 10000)
        };
        for (Movable items : type) {
            items.move();
        }

        /*
         * 7. Crea una clase abstracta Appliance con método turnOn() y turnOff().
         * Implementa TV y WashingMachine con mensajes diferentes al encender y apagar.
         */

        /* var washingMachine = new WashingMachine();
         * System.out.println(washingMachine.turnOn());
         * System.out.println(washingMachine.turnOff());
         * var tv = new TV();
         * System.out.println(tv.turnOn());
         * System.out.println(tv.turnOff());
         */

        List<Appliance> item = new ArrayList<>();
        item.add(new TV());
        item.add(new WashingMachine());

        for (Appliance on : item) {
            on.turnOn();
        }
        for (Appliance off : item) {
            off.turnOff();
        }

        /*
         * 8. Crea dos interfaces Flyable y Swimmable.
         * Crea una clase Duck que implemente ambas interfaces y muestre cómo puede volar y nadar.
         */
        var duck = new Duck();
        duck.fly();
        duck.swim();

        /*
         * 9. Crea una clase abstracta Document con el método print().
         * Luego crea PDFDocument y WordDocument, cada una con su forma de imprimir.
         */
        var word = new WordDocument("TEST", ".docx");
        var pdf = new PDFDocument("Lista", ".pdf");
        word.print();
        pdf.print();

        /*
         * 10. Crea una interfaz Payable con el método pay().
         * Luego implementa las clases Invoice y EmployeePayment,
         * cada una mostrando un mensaje de pago diferente.
         */
        Payable[] pay = {
                new Invoice("Servicios de Hosting Cloud", 100.00),
                new EmployeePayment("Jonathan (DevOps)", 2800.00)
        };
        for (Payable p : pay) {
            p.pay();
        }
    }
}
