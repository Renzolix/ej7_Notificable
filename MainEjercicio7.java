import java.util.ArrayList;
import java.util.List;

public class MainEjercicio7 {
    public static void main(String[] args) {
        List<Notificable> canalNotificaciones = new ArrayList<>();

        canalNotificaciones.add(new NotificacionEmail());
        canalNotificaciones.add(new NotificacionSMS());
        canalNotificaciones.add(new NotificacionPush());

        System.out.println("--- Transmitiendo Notificaciones ---");
        for (Notificable n : canalNotificaciones) {
            n.enviarNotificacion("Su código de verificación es 8849");
        }
    }
}