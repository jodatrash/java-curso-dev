package basic.c08_oop.AccessModifiersExercises;

public class AccessModifiersExercises {
    public static void main(String[] args) {
        // 1. Crea una clase Person con atributos privados name y age. Usa los métodos getName(), setName(), getAge() y setAge() para asignar y mostrar valores desde otra clase.
        Person person = new Person("Jonathan", 27);
        System.out.println("Nombre: " + person.getName());
        System.out.println("Edad: " + person.getAge());

        // 2. Crea una clase Product con el atributo privado price. Añade el método setPrice(double price) que solo permita precios mayores a 0.
        Price price = new Price(20); // Se asigna un valor.
        // price.setPrice(10); // se modifica el valor.
        System.out.println("El precio es: $" + price.getPrice());

        // 3. Crea una clase BankAccount con el atributo privado balance. Implementa los métodos deposit(double amount) y withdraw(double amount) que validen las cantidades correctamente.
        BankAccount bankAccount = new BankAccount(0);
        bankAccount.deposit(500);
        System.out.println("Balance: $" + bankAccount.getBalance());
        bankAccount.withdraw(-500);
        System.out.println("Balance: $" + bankAccount.getBalance());

        // 4. Crea una clase Book con el atributo privado title. Permite leerlo con el método getTitle() pero no modificarlo (sin setTitle()). El título debe asignarse solo por el constructor.
        Book book = new Book("El principito");
        System.out.println("El titulo del libro es: " + book.getTitle());

        // 5. Crea una clase Temperature con el atributo privado celsius. El método setCelsius(double celsius) solo debe aceptar valores entre -100 y 100.
        Temperature temperature = new Temperature(0);
        temperature.setCelsius(10);
        temperature.getCelsius();

        // 6. Crea una clase User con los atributos privados username y password. Implementa los métodos setUsername(String username), setPassword(String password) y checkPassword(String inputPassword) que compare contraseñas.
        User user = new User("","");
        user.setUsername("Jodatrash");
        user.setPassword("password0012");
        user.checkPassword("password0012");

        // 7. Crea una clase Employee con el atributo privado salary. Agrega el método raiseSalary(double percent) que solo permita aumentos positivos.

        // 8. Crea una clase Rectangle con los atributos privados width y height. Agrega setters y el método calculateArea() que devuelva el resultado de width * height.

        // 9. Crea una clase Student con el atributo privado grade. Agrega los métodos setGrade(int grade) y isPassed() que retorne true si la nota es mayor o igual a 60.

        // 10. Crea una clase Car con el atributo privado speed. Agrega los métodos accelerate(int amount) que aumente la velocidad (máximo 120) y brake(int amount) que reduzca la velocidad (mínimo 0).
    }
}
