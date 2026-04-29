package practice.ex03;

public class AlertaConsola implements Alerta{
    @Override
    public void emitir(String mensaje) {
        System.out.println("log de consola: " + mensaje);
    }
}
