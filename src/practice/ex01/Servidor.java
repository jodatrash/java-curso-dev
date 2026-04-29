package practice.ex01;

public class Servidor {
    private String nombre;
    private String direccionIP;
    private boolean estatusActivo;

    public Servidor(String nombre, String direccionIP, boolean estatusActivo) {
        this.nombre = nombre;
        this.direccionIP = direccionIP;
        this.estatusActivo = estatusActivo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccionIP() {
        return direccionIP;
    }

    public void setDireccionIP(String direccionIP) {
        this.direccionIP = direccionIP;
    }

    public boolean isEstatusActivo() {
        return estatusActivo;
    }

    public void setEstatusActivo(boolean estatusActivo) {
        this.estatusActivo = estatusActivo;
    }
}
