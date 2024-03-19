public class Directivo extends Persona {
    private int puesto;

    public Directivo(String nombre, String DNI, double sueldo, int puesto) {
        super(nombre, DNI, sueldo);
        this.puesto = puesto;
    }
    public int getpuesto() {
        return puesto;
    }

    public void setpuesto(int puesto) {
        this.puesto = puesto;
    }

    @Override
    public String toString() {
        return super.toString() + " Puesto: " + puesto;
    }
}