public class NotificacionSMS implements Notificable {
    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("[SMS]: Enviando SMS al destinatario: '" + mensaje + "'");
    }
}