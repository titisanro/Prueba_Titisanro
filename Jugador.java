public class Jugador {
    
    private int id;
    private String nombre;
    private int precio;
    private String posicion;
    private boolean fichado;

    public Jugador(int id, String nombre, int precio, String posicion) {
        this.id=id;
        this.nombre = nombre;
        this.precio = precio;
        this.posicion = posicion;
        fichado=false;
    }
    
    void imprimir () {
        System.out.println(nombre+" "+ precio+" "+posicion);
    }
    
    void fichar () {
        fichado=true;
    }
    
    void imprimirFichados () {
        if (fichado) {
               imprimir();
        }
    }
    
    void imprimirPosicion (String pos) {
        if (this.posicion==pos) {
            imprimir();
            }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public boolean isFichado() {
        return fichado;
    }

    public void setFichado(boolean fichado) {
        this.fichado = fichado;
    }
    
     public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
}
