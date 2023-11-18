package First;

import java.math.BigDecimal;
import java.math.MathContext;

// Вычислить значение 1/0!+1/1!+…+1/N! для заданного произвольно большого натурального N.

public class FirstClass {
    public BigDecimal obr_fact(int s) {
        MathContext mc = new MathContext(5);
        BigDecimal ret = BigDecimal.ONE;
        for (int x = 1; x < s; x++) {
            BigDecimal val = new BigDecimal(String.valueOf(x));

            ret = ret.multiply(val);
        }
        return BigDecimal.ONE.divide(ret, mc);
    }

    public String main() {
        int n = 1000;
        BigDecimal ret = BigDecimal.ZERO;
        for (int i = 1; i < n; i++) {
            ret = ret.add(obr_fact(i));
        }
        System.out.println(ret);
        return String.valueOf(ret);
    }
}