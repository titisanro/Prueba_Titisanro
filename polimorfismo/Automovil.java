import java.util.Random;
class Automovil implements Vehiculo {
    private static int contadorAutomoviles = 0;
    private int antiguedad;

    public Automovil() {
        Random random = new Random();
        this.antiguedad = random.nextInt(10) + 1;
        contadorAutomoviles++;
    }
    public void acelerar() {
        System.out.println("Acelerando automovil...");
    }

    public void frenar() {
        System.out.println("Frenando automovil...");
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void abrirPuertas() {
        System.out.println("Abriendo puertas...");
    }

    public static int getContadorAutomoviles() {
        return contadorAutomoviles;
    }
}