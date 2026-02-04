package basic.c04_conditionals;

public class conditionals {
    public static void main(String[] args) {
        int age = 17;

        // if - else / else if
        if (age > 18){
            System.out.println("Mayor de edad");
        } else if (age == 18) {
            System.out.println("Acabas de cumplir 18");
        } else
            System.out.println("Menor de edad");

        // switch
        int day = 4;
        switch (day){
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miércoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            default -> System.out.println("No hay día seleccionado");
        }
    }
}
