package ca.vanier;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

class MainTest {
    Calculator cal= new Calculator();
    @Test
    void minus(){
        assertEquals(0,cal.calculate(5, 5, "minus"));
    }
    @Test
    void divide(){
        assertEquals(2,cal.calculate(100,50,"divide"));
    }
}
