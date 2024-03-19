import java.util.Arrays;
import java.util.Scanner;

public class Equipo {
    private String nombre;
    private String deporte;
    private Deportista[] deportistas;

    public Equipo(String nombre, String deporte, Deportista[] deportistas) {
        this.nombre = nombre;
        this.deporte = deporte;
        this.deportistas = deportistas;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Equipo: " + nombre + ", Deporte: " + deporte + "Deportistas: ");

        for (Deportista deportista : deportistas) {
            result.append(deportista.toString()).append("");
        }

        return result.toString();
    }

    public double calcularSueldo() {
        double totalSueldo = 0;
        for (Deportista deportista : deportistas) {
            totalSueldo += deportista.getSueldo();
        }
        return totalSueldo;
    }

    public void agregarDeportista(Deportista nuevoDeportista) {
        Deportista[] nuevoArray = Arrays.copyOf(deportistas, deportistas.length + 1);
        nuevoArray[deportistas.length] = nuevoDeportista;
        deportistas = nuevoArray;
    }

    public boolean borrarDeportista(String nombre) {
        for (int i = 0; i < deportistas.length; i++) {
            if (deportistas[i].getNombre().equalsIgnoreCase(nombre)) {
                Deportista[] nuevoArray = new Deportista[deportistas.length - 1];
                System.arraycopy(deportistas, 0, nuevoArray, 0, i);
                System.arraycopy(deportistas, i + 1, nuevoArray, i, deportistas.length - i - 1);
                deportistas = nuevoArray;
                return true;
            }
        }
        return false;
    }

    public boolean modificarDatosDeportista(String nombre, Scanner scanner) {
        scanner.nextLine();
        for (int i = 0; i < deportistas.length; i++) {
            if (deportistas[i].getNombre().equalsIgnoreCase(nombre)) {
                System.out.print("Nuevo nombre: ");
                deportistas[i].setNombre(scanner.nextLine().trim());
                System.out.print("Nuevo sueldo: ");
                deportistas[i].setSueldo(Double.parseDouble(scanner.nextLine()));
                System.out.print("Nueva posición: ");
                deportistas[i].setPosicion(Integer.parseInt(scanner.nextLine()));
                return true;
            }
        }
        return false;
    }

    private Directivo[] directivos;

    public void agregarDirectivo(Directivo nuevoDirectivo) {
        Directivo[] nuevoArray = Arrays.copyOf(directivos, directivos.length + 1);
        nuevoArray[directivos.length] = nuevoDirectivo;
        directivos = nuevoArray;
    }
}
