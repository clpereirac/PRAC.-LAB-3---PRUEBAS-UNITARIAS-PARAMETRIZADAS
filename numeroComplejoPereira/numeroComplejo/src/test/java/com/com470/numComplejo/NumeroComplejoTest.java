
package com.com470.numComplejo;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumeroComplejoTest {

    @ParameterizedTest
    @CsvSource({
            "2,3, 4,5, 6,8",
            "0,0, 0,0, 0,0",
            "-1,5, 3,-2, 2,3",
            "100,200, -100,-200, 0,0",
            "7,0, 0,7, 7,7",
            "-3,-3, -2,5, -5,2"
    })
    void testSumar(int aReal, int aImaginaria, int bReal, int bImaginaria, int expReal, int expImaginaria) {
        NumeroComplejo a = new NumeroComplejo(aReal, aImaginaria);
        NumeroComplejo b = new NumeroComplejo(bReal, bImaginaria);
        NumeroComplejo r = a.sumar(b);
        assertEquals(expReal, r.getParteReal());
        assertEquals(expImaginaria, r.getParteImaginaria());
    }

    @ParameterizedTest
    @CsvSource({
            "2,3, 4,5, -2,-2",
            "0,0, 0,0, 0,0",
            "-1,5, 3,-2, -4,7",
            "100,200, -100,-200, 200,400",
            "7,0, 0,7, 7,-7",
            "-3,-3, -2,5, -1,-8"
    })
    void testRestar(int aReal, int aImaginaria, int bReal, int bImaginaria, int expReal, int expImaginaria) {
        NumeroComplejo a = new NumeroComplejo(aReal, aImaginaria);
        NumeroComplejo b = new NumeroComplejo(bReal, bImaginaria);
        NumeroComplejo r = a.restar(b);
        assertEquals(expReal, r.getParteReal());
        assertEquals(expImaginaria, r.getParteImaginaria());
    }
}
