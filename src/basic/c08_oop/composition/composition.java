package basic.c08_oop.composition;

public class composition {
    public static void main(String[] args) {
        /* COMPOSICIÓN
         *
         * Herencia ("es un")
         * Composición ("tiene un")
         */
        var car = new Car();
        car.on();
    }

    public static class Engine {
        public void on() {
            System.out.println("Motor encendido.");
        }
    }

    /*
     * Coche "tiene un motor", no "Es un motor"
     */
    public static class Car {
        private final Engine engine = new Engine();
        public void on() {
            engine.on();
        }
    }
}
