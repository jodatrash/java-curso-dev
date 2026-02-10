package basic.c08_oop.AccessModifiersExercises;

/*
 * 5. Crea una clase Temperature con el atributo privado celsius.
 * El método setCelsius(double celsius) solo debe aceptar valores entre -100 y 100.
 *
 */

public class Temperature {
    private double celsius;

    public Temperature(double celsius) {
        this.setCelsius(celsius);
    }

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        if (celsius >= -100 && celsius <= 100) {
            this.celsius = celsius;
        } else {
            System.out.println("Solo se aceptan temperaturas en un rango de -100° a 100° Celsius.");
        }
    }

    public void displayTemperature() {
        System.out.println("La temperatura es: " + celsius + "°");
    }
}

