import java.util.Scanner;

public class CorregirNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número con posibles espacios erróneos: ");
        String entrada = scanner.nextLine();

        scanner.close();

        int numeroCorregido = corregirNumero(entrada);

        if (numeroCorregido != -1) {
            System.out.println("Número corregido: " + numeroCorregido);
        } else {
            System.out.println("No se pudo corregir el número. Asegúrese de ingresar un número válido sin caracteres no numéricos.");
        }
    }

    public static int corregirNumero(String cadena) {
        String numeroCorregido = cadena.replaceAll("\\s+", "");

        try {
            int numeroEntero = Integer.parseInt(numeroCorregido);
            return numeroEntero;
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}
