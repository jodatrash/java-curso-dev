package basic.c08_oop.AccessModifiersExercises;

/*
 * 4. Crea una clase Book con el atributo privado title.
 * Permite leerlo con el método getTitle() pero no modificarlo (sin setTitle()).
 * El título debe asignarse solo por el constructor.
 */

public class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
