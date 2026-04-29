package practice.ex03;

import java.time.LocalDate;

public class AlertaEmail implements Alerta{
    @Override
    public void emitir(String mensaje) {
        System.out.println("Enviando correo al administrador con el texto: " + mensaje + " - " + LocalDate.now());
    }
}
