import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {


    @Test
    public void verificarSuma() {
        Calculadora calculadora = new Calculadora();
        Assertions.assertEquals(10, calculadora.sumar(5,5));
    }

}