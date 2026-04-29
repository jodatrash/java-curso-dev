package practice.certificates;

public class CertificadoSSL implements Renovable {
    private String nombreDominio;

    public CertificadoSSL(String nombreDominio) {
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
        System.out.printf("Renovando SSL para el dominio: %s | Notificando a: %s \n", nombreDominio, emailAdmin);
    }
}
