public class Deportista extends Persona {
    private int deporte;
    private int posicion;

    private String[] ndeportes={"Fútbol","Baloncesto","Basket"};

    public Deportista(String nombre, String DNI, double sueldo, int deporte, int posicion) {
        super(nombre, DNI, sueldo);
        this.deporte = deporte;
        this.posicion = posicion;
    }
    public int getDeporte() {
        return deporte;
    }

    public void setDeporte(int deporte) {
        this.deporte = deporte;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
    
    

    @Override
    public String toString() {
        return "Nombre: " +getNombre()+ " juega al deporte " +ndeportes[deporte-1];
    }
}   