package basic.c08_oop.abstraction.AbstractionExercises.ex_09;

public class WordDocument extends Document {
    String nameDocument;
    String format;

    public WordDocument(String nameDocument, String format) {
        this.nameDocument = nameDocument;
        this.format = format;
    }

    @Override
    public void print() {
        System.out.println("El documento " + nameDocument + " con formato " + format);
    }
}
