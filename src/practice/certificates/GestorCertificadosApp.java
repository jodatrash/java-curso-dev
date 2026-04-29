package practice.certificates;

import java.util.ArrayList;
import java.util.Scanner;

public class GestorCertificadosApp {
    public static void main(String[] args) {
        try (Scanner inputUser = new Scanner(System.in)) {

            System.out.println("Días restantes para la expiración: ");
            String diasRestantes = inputUser.nextLine();
            int conversion = Integer.parseInt(diasRestantes);

            ArrayList<Renovable> listaRenovable = new ArrayList<>();

            var certificadoSSL = new CertificadoSSL("jonathanpacheco.dev");
            var certificadoVPN = new CertificadoVPN("steam4noobs.net");

            listaRenovable.add(certificadoSSL);
            listaRenovable.add(certificadoVPN);

            for (Renovable renovacion : listaRenovable){
                renovacion.procesarRenovacion("test@test.com");
            }

        }catch (NumberFormatException e){
            System.out.println("Por favor, ingresa solo números enteros (sin letras ni símbolos).");
        }

    }
}
