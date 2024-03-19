public class Película extends Título implements Grabar, Favoritos {
    private int duración;

    public Película(String nombre, String descripción, String[] actores, String género, int duración) {
        super(nombre, descripción, actores, género);
        this.duración = duración;
    }

    public int getDuración() {
        return duración;
    }

    public void setDuración(int duración) {
        this.duración = duración;
    }

    @Override
    public String toString() {
        return "Película: " + getNombre() + " - Duración: " + duración + " minutos";
    }

    @Override
    public void añadir() {
        System.out.println("Película añadida a la lista de grabaciones.");
    }

    @Override
    public void borrar() {
        System.out.println("Película borrada de la lista de grabaciones.");
    }

    @Override
    public void guardar() {
        System.out.println("Película agregada a la lista de favoritos.");
    }

    @Override
    public void quitar() {
        System.out.println("Película eliminada de la lista de favoritos.");
    }
}
