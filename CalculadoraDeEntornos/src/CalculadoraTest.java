

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class CalculadoraTest {

    @Test
    void testSuma(){
        int actual = Calculadora.suma(3,4);
        int esperado = 7;
        assertEquals(esperado,actual);
    }
    @Test
    void testResta(){
        int actual = Calculadora.resta(7,3);
        int esperado = 4;
        assertEquals(esperado,actual);
    }

    @Test
    void testMultiplica(){
        int actual = Calculadora.multiplica(5,10);
        int esperado = 50;
        assertEquals(esperado,actual);
    }

    @Test
    void testDivide(){
        double actual = Calculadora.divide(10,2);
        double esperado = 5.0;
        assertEquals(esperado,actual,0.000001);
    }

    @Test
    void testPotencia(){
        int actual = Calculadora.potencia(2,2);
        int esperado = 4;
        assertEquals(esperado,actual);
    }

    @Test
    void testRaiz(){
        double actual = Calculadora.raiz(49);
        double esperado = 7;
        assertEquals(esperado,actual,0.00001);
    }
}
