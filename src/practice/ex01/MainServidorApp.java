package practice.ex01;

public class MainServidorApp {
    public static void main(String[] args) {
        var servidor = new Servidor("no data","no data", false);

        servidor.setNombre("USA-WST-01");
        servidor.setDireccionIP("192.168.0.0");
        servidor.setEstatusActivo(false);

        System.out.println(servidor.getNombre() + servidor.getDireccionIP() + servidor.isEstatusActivo());
        System.out.printf("Servidor: %s, IP: %s, Activo: %b%n", servidor.getNombre(), servidor.getDireccionIP(), servidor.isEstatusActivo());
    }
}
