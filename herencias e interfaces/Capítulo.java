public class Capítulo implements Grabar {
    private int númeroCapítulo;
    private String nombre;
    private int duración;

    public Capítulo(int númeroCapítulo, String nombre, int duración) {
        this.númeroCapítulo = númeroCapítulo;
        this.nombre = nombre;
        this.duración = duración;
    }

    public int getNúmeroCapítulo() {
        return númeroCapítulo;
    }

    public void setNúmeroCapítulo(int númeroCapítulo) {
        this.númeroCapítulo = númeroCapítulo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuración() {
        return duración;
    }

    public void setDuración(int duración) {
        this.duración = duración;
    }

    @Override
    public void añadir() {
        System.out.println("Capítulo añadido a la lista de grabaciones.");
    }

    @Override
    public void borrar() {
        System.out.println("Capítulo borrado de la lista de grabaciones.");
    }
}
