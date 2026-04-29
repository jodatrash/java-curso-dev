package practice.ex02;

import java.util.Scanner;

public class Nodes {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Ingrese el ancho de banda total disponible (en Mbps):");
            String anchoBandaInputText = input.nextLine();
            int anchoBanda = Integer.parseInt(anchoBandaInputText);
            System.out.println("Ingrese la cantidad de nodos a conectar:");
            String nodosTotalesInputText = input.nextLine();
            int nodosTotales = Integer.parseInt(nodosTotalesInputText);

            int distribucion = anchoBanda / nodosTotales;
            System.out.printf("Distribución realizada: %d Mbps", distribucion);
        } catch (NumberFormatException e) {
            System.out.println("Por favor, ingresa solo números enteros (sin letras ni símbolos).");
        } catch (ArithmeticException e) {
            System.out.println("La cantidad de nodos debe ser mayor a 0.");
        }
    }
}
