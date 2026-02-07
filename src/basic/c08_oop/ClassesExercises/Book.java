package basic.c08_oop.ClassesExercises;

public class Book {
    // 1. Crea una clase Book con atributos title y author. Crea un objeto y muestra sus datos.

    String title;
    String author;

    // 3. Añade un constructor a la clase Book que reciba title y author.
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void information() {
        System.out.println("El libro es : " + title);
        System.out.println("El autor es : " + author);
    }

}
