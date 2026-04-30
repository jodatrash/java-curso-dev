package practice.technical;

public class NodoSpoke implements Enlazable {
    private String nombreServidor;
    private String direccionIP;

    public NodoSpoke(String nombreServidor, String direccionIP) {
        this.nombreServidor = nombreServidor;
        this.direccionIP = direccionIP;
    }

    public String getNombreServidor() {
        return nombreServidor;
    }

    public void setNombreServidor(String nombreServidor) {
        this.nombreServidor = nombreServidor;
    }

    public String getDireccionIP() {
        return direccionIP;
    }

    public void setDireccionIP(String direccionIP) {
        this.direccionIP = direccionIP;
    }

    @Override
    public void inicializarTunel() {
        System.out.printf(
                "Túnel VPN establecido. Hub conectado con el spoke %s en la IP %s", nombreServidor, direccionIP
        );
    }
}
