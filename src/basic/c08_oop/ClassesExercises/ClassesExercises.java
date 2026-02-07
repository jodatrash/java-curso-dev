package basic.c08_oop.ClassesExercises;

import java.util.ArrayList;

public class ClassesExercises {
    public static void main(String[] args) {
        // 1. Crea una clase Book con atributos title y author. Crea un objeto y muestra sus datos.
        Book book = new Book("", "");
        book.title = "El principito.";
        book.author = "Antoine de Saint-Exupéry.";
        book.information();

        // 2. Crea una clase Dog con un método bark() que imprima su sonido.
        Dog dog = new Dog("Guau");
        dog.bark();

        // 3. Añade un constructor a la clase Book que reciba title y author.
        Book book2 = new Book("Donde viven los monstruos.", "Maurice Sendak.");
        book2.information();

        // 4. Crea una clase Car con atributos brand y model y un método showData().
        Car car = new Car();
        car.brand = "Nissan";
        car.model = "Versa";
        car.showData();

        // 5. Crea una clase Student con atributo score y un método que diga si aprobó (mayor o igual a 60).
        Student student = new Student(60);
        System.out.println("El estudiante aprobó: " + student.isApproved());

        // 6. Crea una clase BankAccount con atributo balance y un método deposit() que sume el saldo.
        BankAccount bankAccount = new BankAccount(30);
        bankAccount.deposit(50);
        System.out.println("El saldo actualizado es de: " + bankAccount.balance);

        // 7. Crea una clase Rectangle con métodos para calcular el área y el perímetro.
        Rectangle rectangle = new Rectangle(7, 15);
        System.out.println("El area del rectángulo es: " + rectangle.getArea());
        System.out.println("El perimetro del rectángulo es: " + rectangle.getPerimeter());

        // 8. Crea una clase Worker que reciba nombre y salario, y un método para mostrar su salario.
        Worker worker = new Worker("Jonathan", 25000);
        System.out.println("El salario es: $" + worker.getSalary());

        // 9. Crea varios objetos Person y guárdalos en un ArrayList.
        ArrayList<Person> peopleList = new ArrayList<>();
        peopleList.add(new Person("Miguel", 28));
        peopleList.add(new Person("Jonathan", 27));
        peopleList.add(new Person("Jazid", 26));
        for (Person person : peopleList) {
            System.out.println("Nombre: " + person.getName() + " edad: " + person.getAge());
        }

        // 10. Crea una clase Product y un método que aplique un descuento sobre su precio.
        Product product = new Product(150); // Definimos precio total.
        System.out.println("El precio antes de descuento es: $" + product.price);
        double discount = product.applyDiscount(16); // Definimos el porcentaje.
        System.out.println("Precio total del producto con " + discount + "% de descuento es: $" + product.getPrice());

    }
}
