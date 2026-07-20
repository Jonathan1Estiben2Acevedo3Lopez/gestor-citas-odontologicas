import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el nombre del paciente: ");
        String patientName = scanner.nextLine();

        int patientAge = 0;
        boolean isAgeInputValid = false;

        while (!isAgeInputValid) {

            System.out.print("Digite la edad del paciente: ");
            String ageText = scanner.nextLine();

            try {
                patientAge = Integer.parseInt(ageText);
                boolean isAgeWithinAllowedRange = patientAge >= 0 && patientAge <= 125;

                if (!isAgeWithinAllowedRange) {
                    System.out.println("Edad no válida. La edad debe estar entre 0 y 125.");
                } else {
                    isAgeInputValid = true;
                }

            } catch (NumberFormatException exception) {
                System.out.println("La edad debe ser un número entero.");
            }
        }

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

        if (patientAge < 18) {
            System.out.println("El paciente es menor de edad");
        } else {
            System.out.println("El paciente es mayor de edad");
        }
        scanner.close();
    }
}