public abstract class Título {
    private String nombre;
    private String descripción;
    private String[] actores;
    private String género;

    public Título(String nombre, String descripción, String[] actores, String género) {
        this.nombre = nombre;
        this.descripción = descripción;
        this.actores = actores;
        this.género = género;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public String[] getActores() {
        return actores;
    }

    public void setActores(String[] actores) {
        this.actores = actores;
    }

    public String getGénero() {
        return género;
    }

    public void setGénero(String género) {
        this.género = género;
    }

    public abstract String toString();
}
