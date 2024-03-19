import java.util.ArrayList;
import java.util.List;

public class Temporada {
    private int número;
    private List<Capítulo> capítulos;

    public Temporada(int número) {
        this.número = número;
        this.capítulos = new ArrayList<>();
    }

    public int getNúmero() {
        return número;
    }

    public void setNúmero(int número) {
        this.número = número;
    }

    public List<Capítulo> getCapítulos() {
        return capítulos;
    }

    public void agregarCapítulo(int númeroCapítulo, String nombreCapítulo, int duración) {
        capítulos.add(new Capítulo(númeroCapítulo, nombreCapítulo, duración));
    }
}
