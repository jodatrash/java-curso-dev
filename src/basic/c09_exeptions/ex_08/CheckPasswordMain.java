package basic.c09_exeptions.ex_08;

import basic.c09_exeptions.ex_08.exceptions.WeakPasswordException;

public class CheckPasswordMain {
    public static void main(String[] args) throws WeakPasswordException {
        var checkPassword = new CheckPassword();
        String attemptPassword = "admin121";

        try {
            checkPassword.checkPassword(attemptPassword);
            System.out.println("Guardando contraseña...");
        } catch (WeakPasswordException e) {
            System.out.println("Error de validación: " + e.getMessage());
        }
    }
}
