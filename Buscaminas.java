import java.util.Random;
import java.util.Scanner;

public class Buscaminas {
    private char[][] tablero;
    private char[][] tableroVisible;
    private int filas;
    private int columnas;
    private int minas;
    private int casillasSinAbrir;

    public Buscaminas(int filas, int columnas, int minas) {
        this.filas = filas;
        this.columnas = columnas;
        this.minas = minas;
        this.tablero = new char[filas][columnas];
        this.tableroVisible = new char[filas][columnas];
        this.casillasSinAbrir = filas * columnas;
        inicializarTablero();
        colocarMinas();
        calcularNumeros();
    }

    private void inicializarTablero() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                tablero[i][j] = ' ';
                tableroVisible[i][j] = '-';
            }
        }
    }

    private void colocarMinas() {
        Random random = new Random();
        int minasColocadas = 0;

        while (minasColocadas < minas) {
            int fila = random.nextInt(filas);
            int columna = random.nextInt(columnas);

            if (tablero[fila][columna] != '*') {
                tablero[fila][columna] = '*';
                minasColocadas++;
            }
        }
    }

    private void calcularNumeros() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (tablero[i][j] != '*') {
                    int minasAlrededor = contarMinasAlrededor(i, j);
                    if (minasAlrededor > 0) {
                        tablero[i][j] = (char) (minasAlrededor + '0');
                    }
                }
            }
        }
    }

    private int contarMinasAlrededor(int fila, int columna) {
        int minasAlrededor = 0;

        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                int nuevaFila = fila + i;
                int nuevaColumna = columna + j;

                if (nuevaFila >= 0 && nuevaFila < filas && nuevaColumna >= 0 && nuevaColumna < columnas) {
                    if (tablero[nuevaFila][nuevaColumna] == '*') {
                        minasAlrededor++;
                    }
                }
            }
        }

        return minasAlrededor;
    }

    private void descubrirCasilla(int fila, int columna) {
        if (fila < 0 || fila >= filas || columna < 0 || columna >= columnas || tableroVisible[fila][columna] != '-') {
            return;
        }

        if (tablero[fila][columna] == '*') {
            tableroVisible[fila][columna] = '*';
            mostrarTablero();
            System.out.println("¡Perdiste! Has tocado una mina.");
            System.exit(0);
        } else {
            tableroVisible[fila][columna] = tablero[fila][columna];
            casillasSinAbrir--;
            if (tablero[fila][columna] == '0') {
                descubrirCasillasVacias(fila, columna);
            }
        }

        if (casillasSinAbrir == minas) {
            mostrarTablero();
            System.out.println("¡Ganaste! Has encontrado todas las casillas sin minas.");
            System.exit(0);
        }
    }

    private void descubrirCasillasVacias(int fila, int columna) {
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                int nuevaFila = fila + i;
                int nuevaColumna = columna + j;
                if (nuevaFila >= 0 && nuevaFila < filas && nuevaColumna >= 0 && nuevaColumna < columnas) {
                    if (tableroVisible[nuevaFila][nuevaColumna] == '-') {
                        descubrirCasilla(nuevaFila, nuevaColumna);
                    }
                }
            }
        }
    }

    private void mostrarTablero() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(tableroVisible[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Número de filas: ");
        int filas = scanner.nextInt();

        System.out.print("Número de columnas: ");
        int columnas = scanner.nextInt();

        System.out.print("Número de minas: ");
        int minas = scanner.nextInt();

        Buscaminas buscaminas = new Buscaminas(filas, columnas, minas);

        while (true) {
            buscaminas.mostrarTablero();
            System.out.print("Fila: ");
            int fila = scanner.nextInt();
            System.out.print("Columna: ");
            int columna = scanner.nextInt();
            buscaminas.descubrirCasilla(fila, columna);
        }
    }
}
