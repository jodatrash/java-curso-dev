package basic.c08_oop.AccessModifiersExercises;

/*
 * 2. Crea una clase Product con el atributo privado price.
 * Añade el método setPrice(double price) que solo permita precios mayores a 0.
 */

public class Price {
    private double price;

    public Price(double price) {
        this.setPrice(price);
    }

    public double getPrice() {
        return price;
    }

    public double setPrice(double price) {
        if (price <= 0) {
            System.out.println("Solo se permiten precios mayores a 0.");
        }
        this.price = price;
        return price;
    }
}
