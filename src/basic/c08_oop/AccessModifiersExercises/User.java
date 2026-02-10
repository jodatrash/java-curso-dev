package basic.c08_oop.AccessModifiersExercises;

/*
 * 6. Crea una clase User con los atributos privados username y password.
 * Implementa los métodos
 * 1.- setUsername(String username)
 * 2.- setPassword(String password)
 * 3.- checkPassword(String inputPassword) que compare contraseñas.
 */

public class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void checkPassword(String passwordTwo) {
        if (!password.equals(passwordTwo)) {
            System.out.println("Contraseña incorrecta.");
        } else {
            System.out.println("Bienvenido: " + username);
        }
    }
}
