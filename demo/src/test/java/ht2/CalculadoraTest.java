package ht2;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculadoraTest {
    private Calculadora calculadora;
    
    Calculadoraa calculadora = new Calculadora();

    @Test
    void testSuma() throws Exception {
        assertEquals(7, calculadora.evaluate("3 4 +"));
    }

    @Test
    void testResta() throws Exception {
        assertEquals(2, calculadora.evaluate("5 3 -"));
    }

    @Test
    void testMultiplicacion() throws Exception {
        assertEquals(20, calculadora.evaluate("4 5 *"));
    }

    @Test
    void testDivision() throws Exception {
        assertEquals(2, calculadora.evaluate("10 5 /"));
    }

    @Test
    void testOperacion() {
        assertThrows(ArithmeticException.class, () -> calculadora.evaluate("1 2 + 4 * 3 +"));
    }

    @Test
    void testModulo() {
        assertThrows(Exception.class, () -> calculadora.evaluate("10 3 %"));
    }
}

