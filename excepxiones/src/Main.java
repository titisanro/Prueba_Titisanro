import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double base = solicitarNumero("base", scanner);
        double indice = solicitarNumero("exponente", scanner);

        try {
            double resultado = calcularRaiz(base, indice);
            System.out.println("La raíz " + indice + " de " + base + " es: " + resultado);
        } catch (ExcepcionIndiceCero e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ExcepcionIndiceNegativo e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ExcepcionIndicePar e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ExcepcionNumeroGrande e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static double solicitarNumero(String tipo, Scanner scanner) {
        double numero;
            System.out.print("Introduce el número " + tipo + ": ");
            while (!scanner.hasNextDouble()) {
                System.out.println("¡Error! Debes introducir un número válido.");
                System.out.print("Introduce el número " + tipo + ": ");
                scanner.next();
            }
            numero = scanner.nextDouble();
            return numero;
    }

    private static double calcularRaiz(double base, double indice)
            throws  ExcepcionIndiceCero, ExcepcionIndiceNegativo, ExcepcionIndicePar,
            ExcepcionNumeroGrande {
        if (indice == 0) {
            throw new ExcepcionIndiceCero("El índice no puede ser cero.");
        }
        if (indice < 0) {
            throw new ExcepcionIndiceNegativo("El índice no puede ser negativo.");
        }
        if (indice % 1 != 0) {
            throw new ExcepcionIndicePar("El índice no puede ser decimal.");
        }
        if (base < 0 && indice % 2 == 0) {
            throw new ExcepcionIndicePar("No se puede calcular la raíz par de un número negativo.");
        }
        if (base > Double.MAX_VALUE) {
            throw new ExcepcionNumeroGrande("El número introducido es demasiado grande.");
        }
        if ( base < 0 && indice % 2 != 0){
            return -Math.pow(Math.abs(base), 1 / indice);
        }
        return Math.pow(base, 1 / indice);
    }
}
class ExcepcionIndiceCero extends Exception {
    public ExcepcionIndiceCero(String mensaje) {
        super(mensaje);
    }
}

class ExcepcionIndiceNegativo extends Exception {
    public ExcepcionIndiceNegativo(String mensaje) {
        super(mensaje);
    }
}

class ExcepcionIndicePar extends Exception {
    public ExcepcionIndicePar(String mensaje) {
        super(mensaje);
    }
}

class ExcepcionNumeroGrande extends Exception {
    public ExcepcionNumeroGrande(String mensaje) {
        super(mensaje);
    }
}
