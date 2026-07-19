public class App {

    public static void main(String[] args) {

        String patientName = "Jonathan";
        int patientAge = 23;
        String patientEmail = "jonathan@example.com";
        boolean hasScheduledAppointment = true;

        System.out.println("Nombre: " + patientName);
        System.out.println("Edad: " + patientAge);
        System.out.println("Correo: " + patientEmail);

        if (hasScheduledAppointment) {
            System.out.println("Tiene cita programada");
        } else {
            System.out.println("No tiene cita programada");
        }

    }
}