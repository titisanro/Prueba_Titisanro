import java.util.Scanner;
public class Nombre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu primer apellido: ");
        String primerApellido = scanner.nextLine();

        System.out.print("Ingresa tu segundo apellido: ");
        String segundoApellido = scanner.nextLine();

        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingresa la letra que deseas contar en tu nombre: ");
        char letra = scanner.next().charAt(0);

        int conteo = contarLetraEnNombre(nombre, letra);

        System.out.println("¿Sabías " + primerApellido + " " + segundoApellido + " " + nombre + " que tu nombre tiene " + conteo + " " + letra + "?");

        System.out.print("¿Deseas probar con otra letra? (si/no): ");
        String respuesta = scanner.next();

        if (respuesta.equalsIgnoreCase("si")) {
            scanner.nextLine();
            System.out.print("Ingresa la letra que deseas contar en tu nombre: ");
            letra = scanner.next().charAt(0);
            conteo = contarLetraEnNombre(nombre, letra);
            System.out.println("¿Sabías " + primerApellido + " " + segundoApellido + " " + nombre + " que tu nombre tiene " + conteo + " " + letra + "?");
        }
    }
    public static int contarLetraEnNombre(String nombre, char letra) {
        int conteo = 0;
        for (int i = 0; i < nombre.length(); i++) {
            if (nombre.charAt(i) == letra) {
                conteo++;
            }
        }
        return conteo;
    }
}