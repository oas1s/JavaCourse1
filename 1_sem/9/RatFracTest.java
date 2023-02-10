import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RatFracTest {

    @Test
    void test() throws Exception {
        RationalFraction rationalFraction = new RationalFraction(3,15);
        RationalFraction rationalFraction2 = new RationalFraction(4,18);
        System.out.println(rationalFraction2);
        RationalFraction rationalFraction3 = rationalFraction.add(rationalFraction2);
        rationalFraction.add2(rationalFraction2);
        assertEquals(rationalFraction3.value(),0.4222222222222222);
        assertEquals(rationalFraction.value(),0.4222222222222222);
        System.out.println(rationalFraction3);
        RationalFraction rationalFraction4 = new RationalFraction(3,5);
        RationalFraction rationalFraction5 = new RationalFraction(1,2);
        assertEquals(rationalFraction4.sub(rationalFraction5).value(),0.1);
        rationalFraction4.sub2(rationalFraction5);
        assertEquals(rationalFraction4.value(),0.1);
        RationalFraction rationalFraction6 = new RationalFraction(2,5);
        RationalFraction rationalFraction7 = new RationalFraction(3,4);
        assertEquals(rationalFraction6.mult(rationalFraction7).value(),0.3);
        rationalFraction6.mult2(rationalFraction7);
        assertEquals(rationalFraction6.value(),0.3);
        RationalFraction rationalFraction8 = new RationalFraction(4,7);
        RationalFraction rationalFraction9 = new RationalFraction(2,5);
        assertEquals(rationalFraction8.div(rationalFraction9).value(),1.4285714285714286);
        rationalFraction8.div2(rationalFraction9);
        assertEquals(rationalFraction8.value(),1.4285714285714286);
        assertTrue(new RationalFraction(1, 2).equals(new RationalFraction(2, 4)));
//        assertEquals(2,new RationalFraction(26,12).numberPart());
    }
}