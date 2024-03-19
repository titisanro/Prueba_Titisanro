import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
import static org.junit.Assert.*;

    public class MainTest {

        @Test
        public void testCalcularRaiz_IndiceCero() {
            try {
                Main.calcularRaiz(5, 0);
                fail("Se esperaba una ExcepcionIndiceCero");
            } catch (ExcepcionIndiceCero e) {
                assertEquals("El índice no puede ser cero.", e.getMessage());
            }
        }

        @Test
        public void testCalcularRaiz_IndiceNegativo() {
            try {
                Main.calcularRaiz(5, -2);
                fail("Se esperaba una ExcepcionIndiceNegativo");
            } catch (ExcepcionIndiceNegativo e) {
                assertEquals("El índice no puede ser negativo.", e.getMessage());
            }
        }

        @Test
        public void testCalcularRaiz_NumeroGrande() {
            try {
                Main.calcularRaiz(Double.MAX_VALUE + 1, 2);
                fail("Se esperaba una ExcepcionNumeroGrande");
            } catch (ExcepcionNumeroGrande e) {
                assertEquals("El número introducido es demasiado grande.", e.getMessage());
            }
        }

        // Agrega más métodos de prueba según sea necesario...
    }
