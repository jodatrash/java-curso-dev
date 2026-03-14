package basic.c09_exeptions.ex_10;

import basic.c09_exeptions.ex_10.exceptions.LoginFailedException;

public class LoginSystem {
    private final String validUsername = "admin";
    private final String validPassword = "supersecretpassword";

    public void login(String username, String password) throws LoginFailedException {
        System.out.println("Intentando iniciar sesión para el usuario: '" + username + "'...");
        if (username.equals(validUsername) && password.equals(validPassword)) {
            System.out.println("✅ ¡Login exitoso! Bienvenido al panel de control, " + username + ".");
        } else {
            throw new LoginFailedException("Acceso denegado: Usuario o contraseña incorrectos.");
        }
    }
}
