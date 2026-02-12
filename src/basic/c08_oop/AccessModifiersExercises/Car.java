package basic.c08_oop.AccessModifiersExercises;

/*
 * 10. Crea una clase Car con el atributo privado speed.
 * Agrega los métodos accelerate(int amount) que aumente la velocidad (máximo 120)
 * y brake(int amount) que reduzca la velocidad (mínimo 0).
 */
public class Car {
    private double speed;

    public Car(double speed) {
        this.speed = speed;
    }

    public void accelerate(int amount) {
        if (amount > 0) {
            speed += amount;
            if (speed > 120) {
                speed = 120;
                System.out.println("Velocidad maxíma alcanzada: " + speed + "km/h.");
            }
        } else {
            System.out.println("La cantidad debe ser positiva.");
        }
    }

    public void brake(int amount) {
        if (amount > 0) {
            speed -= amount;
            if (this.speed <= 0) {
                this.speed = 0;
                System.out.println("El auto se ha detenido.");
            }
        } else {
            System.out.println("La cantidad debe ser positiva.");
        }
    }

    public double getSpeed() {
        return speed;
    }
}
