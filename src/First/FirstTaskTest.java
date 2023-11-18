package First;


import org.testng.annotations.Test;

import java.math.BigDecimal;

import static java.lang.Math.*;
import static org.junit.Assert.assertEquals;

public class FirstTaskTest {
    FirstClass firstClass = new FirstClass();

    @Test
    public void test_1() {
        double a = Double.parseDouble(firstClass.main());
        assertEquals(a, E, 0.05);
    }

    @Test
    public void test_2() {
        BigDecimal expected = new BigDecimal("1.6487212707001281468486507878141635716537761007101480115750793116406954180402379917133858528991632553348");
        String result = firstClass.main();

        assertEquals(expected.toString(), result);
    }

    @Test
    public void test_3() {
        int s = 5;
        BigDecimal expected = new BigDecimal("0.041667");
        BigDecimal result = firstClass.obr_fact(s);

        assertEquals(expected, result);
    }
}
