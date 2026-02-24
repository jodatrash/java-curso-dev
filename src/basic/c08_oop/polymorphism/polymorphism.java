package basic.c08_oop.polymorphism;

public class polymorphism {
    public static void main(String[] args) {
        // ¿Qué es el polimorfismo?
        /*
         * Permite que distintos objetos, respondan de manera diferente al mismo mensaje/método
         * a la misma operación/función.
         *
         * Permite que un método o una clase se comporte de diferentes maneras según el contexto
         * 2 tipos de polimorfismo.
         *
         * 1 - Polimorfismo por herencia (Sobre escritura).
         */

        var animal = new Animal();
        animal.sound();

        var dog = new Dog();
        dog.sound();

        /*
         * 2 - Polimorfismo por sobre carga (Sobre carga de métodos).
         *
         * Definir varios métodos con un mismo nombre pero con parámetros diferentes.
         */

        var calculator = new Calculator();
        System.out.println(calculator.sum(3, 5));
        System.out.println(calculator.sum(3.5, 5.5));
    }
}
