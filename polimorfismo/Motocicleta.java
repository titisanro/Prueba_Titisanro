import java.util.Random;
class Motocicleta implements Vehiculo {
    private static int contadorMotocicletas = 0;
    private int antiguedad;

    public Motocicleta() {
        Random random = new Random();
        this.antiguedad = random.nextInt(5) + 1;
        contadorMotocicletas++;
    }

    public void acelerar() {
        System.out.println("Acelerando motocicleta...");
    }

    public void frenar() {
        System.out.println("Frenando motocicleta...");
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void hacerCaballito() {
        System.out.println("Haciendo caballito con la motocicleta...");
    }

    public static int getContadorMotocicletas() {
        return contadorMotocicletas;
    }
}
