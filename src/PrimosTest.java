import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimosTest {
    Primos primos;

    @BeforeEach
    void setUp() {
        primos = new Primos();
    }

    @Test
    void generarPrimos() {
        int[] index1 = Primos.generarPrimos(1);
        int[] index3 = Primos.generarPrimos(3);
        int[] index100 = Primos.generarPrimos(100);
        int [] primos2 = new int[0];

        assertArrayEquals(index3, primos2);
        assertArrayEquals(index100,primos2);
        assertArrayEquals(index1,primos2);
    }
}