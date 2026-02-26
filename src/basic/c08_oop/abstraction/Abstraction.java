package basic.c08_oop.abstraction;

public class Abstraction {
    public static void main(String[] args) {
        /*
         * Ya la palabra lo está diciendo, está abstrayendo algo
         *
         * ¿Qué abstrae?
         *
         * Consiste en ocultar la implementación y solo mostrar lo esencial, así
         * podemos definir comportamientos sin obligar a describir a detalle como funciona
         * hasta que se necesite.
         *
         * Existen 2 tipos de abstracciones.
         *
         * 1.- Clase abstracta
         * Que nos va a permitir la clase abstracta hacer
         * generar métodos/funciones que tengan implementación como una clase normal, pero que no la tengan
         * si nosotros queremos.
         *
         * 2.- Interface
         * Lo que se define únicamente a nivel general, son solo los métodos a nivel
         * declaración, sin la implementación
         *
         *
         * Cuando usar clase abstracta vs. interface
         * clase abstracta tiene sentido usarla cuando hay que compartir código común
         * interface solo si se requiere limitar a un comportamiento exclusivo y se puede
         * implementar varios interfaces dentro de la clase
         * */

        var dog = new Dog();
        dog.sleep();
        dog.sound();

        var cat = new Cat();
        cat.sleep();
        cat.sound();

        var bird = new Bird();
        bird.sound();
        bird.fly();

        var bat = new Bat();
        bat.sound();
        bat.fly();
    }

    // Clase abstracta
    public static abstract class Animal {
        public abstract void sound();

        public void sleep() {
            System.out.println("duerme");
        }
    }

    public static class Dog extends Animal {
        @Override
        public void sound() {
            System.out.println("Woof!");
        }

        @Override
        public void sleep() {
            super.sleep();
        }
    }

    public static class Cat extends Animal {
        @Override
        public void sound() {
            System.out.println("Meow!");
        }

        @Override
        public void sleep() {
            super.sleep();
        }
    }

    // Interface

    /*Se pueden usar varias implementaciones en un solo método*/
    public interface Flying {
        void fly();
    }

    public interface Running {
        void run();
    }

    public static class Bird extends Animal implements Flying, Running {
        @Override
        public void sound() {
            System.out.println("pio pio");
        }

        @Override
        public void fly() {
            System.out.println("El pájaro vuela");
        }

        @Override
        public void run() {

        }
    }

    public static class Bat extends Animal implements Flying {
        @Override
        public void sound() {
            System.out.println("...");
        }

        @Override
        public void fly() {
            System.out.println("El murciélago también vuela");
        }
    }
}
