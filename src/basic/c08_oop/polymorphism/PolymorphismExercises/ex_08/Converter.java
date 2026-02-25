package basic.c08_oop.polymorphism.PolymorphismExercises.ex_08;

public class Converter {
    public String convert(int number) {
        return "En binario es: " + Integer.toBinaryString(number);
    }

    public String convert(double number) {
        return "En double es: " + String.format("%.2f", number);
    }

    public String convert(String text){
        return "Texto a mayúsculas: " + text.toUpperCase();
    }
}
