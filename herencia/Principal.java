import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList <Deportista> deportistas;
    static Equipo equipo = null;
    public static void main(String[] args) throws NullPointerException{
        deportistas=new ArrayList<Deportista>();
        crearDeportistas();
        System.out.println(deportistas.get(0).toString());
        System.out.println(deportistas.get(1).toString());
        System.out.println(deportistas.get(2).toString());

        while (true) {
            System.out.println("Menú:");
            System.out.println("1. Añadir deportista");
            System.out.println("2. Borrar deportista");
            System.out.println("3. Modificar datos de deportista");
            System.out.println("4. Crear equipo");
            System.out.println("5. Mostrar información del equipo");
            System.out.println("6. Calcular el sueldo");
            System.out.println("7. Añadir directivo");
            System.out.println("0. Salir");
        
            System.out.print("Ingrese la opción deseada: ");
            int opcion = scanner.nextInt();
        
            switch (opcion) {
                case 1:
                    if (equipo != null) {
                        System.out.print("Nombre: ");
                        String nombre = scanner.next();
                        System.out.print("DNI: ");
                        String dni = scanner.next();
                        System.out.print("Sueldo: ");
                        double sueldo = scanner.nextDouble();
                        scanner.nextLine();
                        System.out.print("Deporte: ");
                        String deporte = scanner.nextLine();
                        System.out.print("Posición: ");
                        int posicion = scanner.nextInt();

                        Deportista nuevoDeportista = new Deportista(nombre, dni, sueldo, opcion, posicion);
                        equipo.agregarDeportista(nuevoDeportista);
                        System.out.println("Deportista añadido al equipo.");
                    } else {
                        System.out.println("Primero cree un equipo antes de añadir deportistas.");
                    }
                    break;
                case 2:
                    if (equipo != null) {
                        System.out.print("Nombre del deportista a borrar: ");
                        String nombreBorrar = scanner.nextLine();
                        if (equipo.borrarDeportista(nombreBorrar)) {
                            System.out.println("Deportista borrado del equipo.");
                        } else {
                            System.out.println("No se encontró un deportista con el nombre proporcionado.");
                        }
                    } else {
                        System.out.println("No hay equipo creado.");
                    }
                    break;
                
                case 3:
                    if (equipo != null) {
                        System.out.print("Nombre del deportista a modificar: ");
                        String nombreModificar = scanner.nextLine();
                        if (equipo.modificarDatosDeportista(nombreModificar, scanner)) {
                            System.out.println("Datos del deportista modificados correctamente.");
                        } else {
                            System.out.println("No se encontró un deportista con el nombre proporcionado.");
                        }
                    } else {
                        System.out.println("No hay equipo creado.");
                    }
                    break;
        
                case 4:
                    System.out.print("Nombre del equipo: ");
                    String nombreEquipo = scanner.next();
                    System.out.print("Deporte del equipo: ");
                    String deporteEquipo = scanner.next();
                    equipo = new Equipo(nombreEquipo, deporteEquipo, new Deportista[0]);
                    System.out.println("Equipo creado.");
                    break;
        
                case 5:
                    if (equipo != null) {
                        System.out.println(equipo.toString());
                    } else {
                        System.out.println("No hay equipo creado.");
                    }
                    break;

                    case 6:
                        if (equipo != null) {
                            System.out.println("El sueldo total del equipo es: " + equipo.calcularSueldo());
                        } else {
                            System.out.println("No hay equipo creado.");
                        }
                        break;

                    case 7:
                        if (equipo != null) {
                            System.out.print("Nombre del directivo: ");
                            String nombreDirectivo = scanner.next();
                            System.out.print("DNI del directivo: ");
                            String dniDirectivo = scanner.next();
                            System.out.print("Sueldo del directivo: ");
                            double sueldo = scanner.nextDouble();
                            System.out.print("Puesto del directivo: ");
                            int puestoDirectivo = scanner.nextInt();
                    
                            Directivo nuevoDirectivo = new Directivo(nombreDirectivo, dniDirectivo, sueldo, puestoDirectivo);
                            equipo.agregarDirectivo(nuevoDirectivo);
                            System.out.println("Directivo añadido al equipo.");
                        } else {
                            System.out.println("No hay equipo creado.");
                        }
                        break;
                            
                case 0:
                    System.out.println("Saliendo del programa.");
                    System.exit(0);
                    break;
        
                default:
                    System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
            }
        }
}

private static void crearDeportistas() throws NullPointerException {
    deportistas.add(new Deportista("Lucas", "00112233D", 1500, 1, 2));
    deportistas.add(new Deportista("Zamorano", "00000456Ñ", 2000, 2,3));
    deportistas.add(new Deportista("Ramos", "93149314Z", 2500, 3,4));
}

}

