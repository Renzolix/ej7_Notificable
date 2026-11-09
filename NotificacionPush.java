public class NotificacionPush implements Notificable {
    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("[PUSH]: Disparando alerta Push al móvil: '" + mensaje + "'");
    }
}