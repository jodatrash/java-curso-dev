package practice.ex03;

import java.util.ArrayList;

public class SistemaMonitoreo {
    public static void main(String[] args) {
        ArrayList<Alerta> listaAlertas = new ArrayList<>();

        var alertaConsola = new AlertaConsola();
        var alertaEmail = new AlertaEmail();

        listaAlertas.add(alertaConsola);
        listaAlertas.add(alertaEmail);

        for (Alerta alert : listaAlertas){
            alert.emitir("El nodo VPN ha perdido conexión");
        }

    }
}
