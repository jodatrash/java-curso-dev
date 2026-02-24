package basic.c08_oop.polymorphism;

public class Calculator {
    // 2 - Polimorfismo por sobre carga (Sobre carga de métodos).
    public int sum(int a, int b) {
        return a + b;
    }

    public double sum(double a, double b) {
        return a + b;
    }
}
