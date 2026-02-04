package basic.c02_operators;
/*
 * Clase 03 - Operadores (03/02/2026)
 */
public class Operators {
    public static void main(String[] args) {
        // Operadores

        // Aritméticos: Operaciones matemáticas, suma, resta, multiplicación y division.

        var a = 5;
        var b = 3;
        System.out.println("Suma           = " + (a + b));
        System.out.println("Resta          = " + (a - b));
        System.out.println("Multiplicación = " + (a * b));
        System.out.println("Division       = " + (a / b));
        System.out.println("Modulo         = " + (a % b));

        // Asignación: Asignar valores a las variables.

        a = b;
        System.out.println("a = " + a); // 3
        a = b * 2;
        System.out.println("a = " + a); // 6
        a += 1;
        System.out.println("a = " + a); // 7
        a -= 1;
        System.out.println("a = " + a); // 6
        a *= 2;
        System.out.println("a = " + a); // 12
        a /= 2;
        System.out.println("a = " + a); // 6
        a %= 2;
        System.out.println("a = " + a); // 0

/*        a = b;
        System.out.println("a = " + a++);
        System.out.println("a = " + a);
        a = b;
        System.out.println("a = " + ++a);*/

        // Comparación (relacionales)

        System.out.println("a = " + a);
        System.out.println(a == b);
        System.out.println(a == 0);

        System.out.println(a != b); //true
        System.out.println(a > b); // false
        System.out.println(a >= b); // false
        System.out.println(a < b); // true
        System.out.println(a <= b); // true

        // Lógicos: ||, &&, !

        // && (Y, AND)
        System.out.println(false && false); // false
        System.out.println(false && true); // false
        System.out.println(true && false); // false
        System.out.println(true && true); // true

        System.out.println(3 > 2 && 5 == 2); // false

        // || (O, OR)
        System.out.println(false || false); // false
        System.out.println(false || true); // true
        System.out.println(true || false); // true
        System.out.println(true || true); // true

        System.out.println(3 > 2 || 5 == 2); // true

        // ! NOT
        System.out.println(!true); // false
        System.out.println(!false); // true

        System.out.println(!(3 > 2) || 5 == 2); // false

        // Unarios.
        System.out.println("b = " + b);
        System.out.println(+b);
        System.out.println(-b);
        System.out.println(b++); // 3 + 1 = 4 primero imprime, luego aumenta
        System.out.println(++b); // 4 + 1 = 5 primero aumenta, luego imprime

    }
}
