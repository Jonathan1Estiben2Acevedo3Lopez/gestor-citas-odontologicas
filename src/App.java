import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el nombre del paciente: ");
        String patientName = scanner.nextLine();

        System.out.print("Digite la edad del paciente: ");
        String ageText = scanner.nextLine();
        int patientAge = Integer.parseInt(ageText);


        String patientEmail = "jonathan@example.com";
        boolean hasScheduledAppointment = true;
        boolean isAgeWithinAllowedRange = patientAge >= 0 && patientAge <= 125;

        System.out.println("Nombre: " + patientName);
        System.out.println("Edad: " + patientAge);
        System.out.println("Correo: " + patientEmail);

        if (hasScheduledAppointment) {
            System.out.println("Tiene cita programada");
        } else {
            System.out.println("No tiene cita programada");
        }

        if (!isAgeWithinAllowedRange) {
            System.out.println("Edad no válida");
        } else if (patientAge < 18) {
            System.out.println("El paciente es menor de edad");
        } else {
            System.out.println("El paciente es mayor de edad");
        }
        scanner.close();
    }
}