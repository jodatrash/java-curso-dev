package basic.c08_oop.ClassesExercises;

public class Product {
    // 10. Crea una clase Product y un método que aplique un descuento sobre su precio.
    double price;

    public Product(double price) {
        this.price = price;
    }

    // Se realiza el cálculo del descuento.
    public double applyDiscount(double percentage) {
        if (percentage > 0 && percentage <= 100) {
            double discount = (price * percentage) / 100;
            price -= discount;
        }
        return percentage;
    }

    // Obtenemos el precio final con descuento.
    public double getPrice() {
        return price;
    }
}
