public class Persona {
    protected String nombre;
    protected String DNI;
    protected double sueldo;

    public Persona(String nombre, String DNI, double sueldo) {
        this.nombre = nombre;
        boolean correcto=comprobarDNI(DNI);
        if (correcto){
            this.DNI = DNI;
        }else{
            this.DNI="DNI incorrecto";
            System.out.println("El DNI de "+nombre+" es incorrecto, intentelo de nuevo");
        }
        this.sueldo = sueldo;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        comprobarDNI(DNI);
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    @Override
    public String toString() {
        return "Nombre: " + nombre + " DNI: " + DNI + " Sueldo: " + sueldo;
    }

    private boolean comprobarDNI(String DNI) {
        String snum=DNI.substring(0, 8);
        int num=Integer.parseInt(snum);
        char letra=DNI.charAt(8);
        char[] restos={'Q','W','E','R','T','Y','U','I','O','P','A','S','D','F','G','H','J','K','L','Ñ','Z','X','C','V','B','N','M'};
        int resto=num%23;
        if (restos[resto]==letra) {
            return true;
        } else {
            return false;
        }
    }

    
}
