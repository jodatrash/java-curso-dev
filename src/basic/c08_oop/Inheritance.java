package basic.c08_oop;

public class Inheritance {
    public static void main(String[] args) {
        /*
         * Va a permitir que una clase herede atributos y métodos de otra
         */
        var animal = new Animal("miAnimal");
        animal.eat();
        var dog = new Dog("miPerro", 5);
        dog.eat();
        var cat = new Cat("miGato");
        cat.eat();
        var bird = new Bird("miPajaro");
        bird.eat();
        bird.fly();
    }

    public static class Animal {
        public Animal(String name) {
            this.name = name;
        }
        String name;
        public void eat() {
            System.out.println("El animal " + name + " está comiendo.");
        }
    }

    public static class Dog extends Animal {
        int age;
        public Dog(String name, int age) {
            super(name);
            this.age = age;
        }
        @Override
        public void eat() {
            super.eat();
        }
    }

    public static class Cat extends Animal {
        public Cat(String name) {
            super(name);
        }
    }

    public static class Bird extends Animal {
        public Bird(String name) {
            super(name);
        }
        public void fly() {
            System.out.println("Está volando");
        }
    }
}
