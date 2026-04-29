package practice.certificates;

public class CertificadoVPN implements Renovable {
    private String nombreDominio;

    public CertificadoVPN(String nombreDominio) {
        this.nombreDominio = nombreDominio;
    }

    public String getNombreDominio() {
        return nombreDominio;
    }

    public void setNombreDominio(String nombreDominio) {
        this.nombreDominio = nombreDominio;
    }

    @Override
    public void procesarRenovacion(String emailAdmin) {
        System.out.printf("Actualizando llaves VPN para: %s | Enviando alerta a: %s \n", nombreDominio, emailAdmin);
    }
}
