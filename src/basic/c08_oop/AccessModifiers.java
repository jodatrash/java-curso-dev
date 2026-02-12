package basic.c08_oop;


public class AccessModifiers {
    public static void main(String[] args) {
        /*
         * Encapsulamiento (Modificadores de acceso):
         * Es proteger los datos de una clase para controlar el acceso desde afuera
         * y para eso es lo que se utiliza los modificadores de acceso.
         *
         * Los principales son:
         * public -> Se puede acceder desde cualquier parte del programa.
         * private -> Solo desde adentro de la clase.
         * protected -> Desde la misma clase, subclases y paquete.
         * default -> Solo permite trabajar dentro del mismo paquete.
         *
         * Las clases por buena práctica, siempre van a ser públicas.
         */

        /*
         * getters & setters.
         * Diferentes métodos / funciones, que se crean para poder permitir el acceso a la variable en cuestión.
         *
         * getter = siempre retornan valor, nunca se trabaja la lógica
         * setter = Pueden realizar lógica, validar, realizar logs, limpieza de datos, etc.
         *
         * Clases de ejemplos:
         * Classes.java
         * Person.java
         */

        /*
         * Sin encapsular, los problemas que se tendrían serían los siguientes:
         * Cualquiera podría cambiar valores
         * No se podría controlar el acceso
         * No se podría validar
         * El código sería mucho más susceptible a errores/fragil/inseguro.
         *
         *
         * Buenas prácticas.
         * La buena práctica, es cuanto más se restrinja el acceso, mejor.
         * Que significa esto, que por defecto hacer todo privado, es casi la practica general, si se queda como regla
         * Hazlo todo privado y en función de lo que se vaya requiriendo/necesitando ve abriéndolo (getter & setter).
         *
         */

    }
}
