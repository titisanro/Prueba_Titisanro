import java.util.Scanner;

public class hexadecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa un número decimal: ");
        int decimal = scanner.nextInt();
        
        System.out.print("Ingresa un número hexadecimal (sin el prefijo 0x): ");
        String hexString = scanner.next();
        
        int hexadecimal = Integer.parseInt(hexString, 16);
        
        System.out.println("Operaciones disponibles:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.print("Selecciona una operación (1/2/3/4): ");
        int opcion = scanner.nextInt();
        
        int resultado = 0;
        String resultadoHex = "";
        
        switch (opcion) {
            case 1:
                resultado = decimal + hexadecimal;
                resultadoHex = Integer.toHexString(resultado).toUpperCase();
                break;
            case 2:
                resultado = decimal - hexadecimal;
                resultadoHex = Integer.toHexString(resultado).toUpperCase();
                break;
            case 3:
                resultado = decimal * hexadecimal;
                resultadoHex = Integer.toHexString(resultado).toUpperCase();
                break;
            case 4:
                if (hexadecimal != 0) {
                    resultado = decimal / hexadecimal;
                    resultadoHex = Integer.toHexString(resultado).toUpperCase();
                } else {
                    System.out.println("La división por cero no está permitida.");
                    return;
                }
                break;
            default:
                System.out.println("Opción no válida");
                return;
        }
        
        System.out.println("Resultado en Decimal: " + resultado);
        System.out.println("Resultado en Hexadecimal: 0x" + resultadoHex);
        
        scanner.close();
    }
}
