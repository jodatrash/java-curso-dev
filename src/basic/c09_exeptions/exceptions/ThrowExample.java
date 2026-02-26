package basic.c09_exeptions.exceptions;

public class ThrowExample {
    //    Avisamos que puede producir una excepción y que se debería capturar.
    public void checkAge(int age) throws IllegalArgumentException {
        if (age < 18) {
            throw new IllegalArgumentException("Tienes que ser mayor de edad"); // Lanzamos la excepción.
        } else {
            System.out.println("Es mayor de edad");
        }
    }

    // Si es una excepción que se hereda de una excepción ya existente no hay necesidad de asignar el throws
    // Pero si es una excepción general y custom, si debe ser declarada en el método.
    public void checkScore(int score) throws CustomException {
        if (score < 0 || score > 100) {
            throw new CustomException("La puntuación debe estar entre 0 y 100");
        } else {
            System.out.println("Puntuación valida " + score);
        }
    }
}
