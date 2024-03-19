import java.util.ArrayList;
import java.util.List;

public class Serie extends Título implements Favoritos {
    private String plataforma;
    private List<Temporada> temporadas;

    public Serie(String nombre, String descripción, String[] actores, String género, String plataforma) {
        super(nombre, descripción, actores, género);
        this.plataforma = plataforma;
        this.temporadas = new ArrayList<>();
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public List<Temporada> getTemporadas() {
        return temporadas;
    }

    public void agregarTemporada(int número) {
        temporadas.add(new Temporada(número));
    }

    @Override
    public String toString() {
        return "Serie: " + getNombre() + " - Plataforma: " + plataforma;
    }

    @Override
    public void guardar() {
        System.out.println("Serie agregada a la lista de favoritos.");
    }

    @Override
    public void quitar() {
        System.out.println("Serie eliminada de la lista de favoritos.");
    }
}
