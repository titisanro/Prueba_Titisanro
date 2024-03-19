import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenúCliente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Título> listaTítulos = new ArrayList<>();
        List<Título> favoritos = new ArrayList<>();

        listaTítulos.add(new Película("Rocky", "Descripción Película 1", new String[]{"Sylvester Stallone", "Adrien"}, "Pelea", 120));
        listaTítulos.add(new Película("En el corazon de la decimocuarta", "Descripción Película 2", new String[]{"Karim", "Vini"}, "La 14", 150));
        listaTítulos.add(new Serie("Aida", "Esperanza Sur", new String[]{"El Luisma", "BaraJudas o JudasBarajas"}, "Nose es rara", "FDF"));
        
        while (true) {
            System.out.println("Menú del Cliente:");
            System.out.println("1. Mostrar listados");
            System.out.println("2. Manejar favoritos");
            System.out.println("3. Poner a grabar");
            System.out.println("4. Salir");

            int opción = scanner.nextInt();

            switch (opción) {
                case 1:
                    System.out.println("Listados:");
                    for (int i = 0; i < listaTítulos.size(); i++) {
                        System.out.println(i + ". " + listaTítulos.get(i).toString());
                    }
                    break;
                case 2:
                System.out.println("Manejar favoritos:");
                    System.out.println("1. Mostrar favoritos");
                    System.out.println("2. Agregar favorito");
                    System.out.println("3. Eliminar favorito");

                    int opciónFavoritos = scanner.nextInt();

                    switch (opciónFavoritos) {
                        case 1:
                            System.out.println("Favoritos:");
                            for (Título favorito : favoritos) {
                                System.out.println(favorito.toString());
                            }
                            break;
                        case 2:
                            System.out.println("Agregar favorito:");
                            System.out.println("Ingrese el índice del título que desea agregar a favoritos:");
                            int índiceAgregar = scanner.nextInt();
                            if (índiceAgregar >= 0 && índiceAgregar < listaTítulos.size()) {
                                Título títuloAgregar = listaTítulos.get(índiceAgregar);
                                favoritos.add(títuloAgregar);
                                System.out.println("Título agregado a favoritos.");
                            } else {
                                System.out.println("Índice no válido.");
                            }
                            break;
                    case 3:
                        System.out.println("Eliminar favorito:");
                        System.out.println("Ingrese el índice del título que desea eliminar de favoritos:");
                        int índiceEliminar = scanner.nextInt();
                        if (índiceEliminar >= 0 && índiceEliminar < favoritos.size()) {
                            Título títuloEliminar = favoritos.remove(índiceEliminar);
                            System.out.println("Título eliminado de favoritos: " + títuloEliminar.toString());
                        } else {
                            System.out.println("Índice no válido.");
                        }
                        break;
                    default:
                        System.out.println("Opción no válida. Volviendo al menú principal.");
                }
                break;
                case 3:
                    System.out.println("Poner a grabar:");
                    System.out.println("Ingrese el índice del título que desea grabar:");
                    int índiceGrabar = scanner.nextInt();
                    if (índiceGrabar >= 0 && índiceGrabar < listaTítulos.size()) {
                        Título títuloGrabar = listaTítulos.get(índiceGrabar);
                        if (títuloGrabar instanceof Película) {
                            ((Película) títuloGrabar).añadir();
                            System.out.println("Película grabada con éxito.");
                        } else {
                            System.out.println("No se puede grabar. El título no es una película.");
                        }
                    } else {
                        System.out.println("Índice no válido.");
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del menú. ¡Hasta luego!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        }
    }
}
