package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleIntrestTest {

    @Test
    public void testCalculateSI_happyPath() {
        SimpleIntrest si = new SimpleIntrest();
        double result = si.calculateSI(1000.0, 5.0, 2.0);
        Assert.assertEquals(result, 100.0, 1e-9, "Simple interest calculation should match expected value");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testCalculateSI_zeroPrinciple_throws() {
        SimpleIntrest si = new SimpleIntrest();
        si.calculateSI(0.0, 5.0, 5.0);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testCalculateSI_negativeRate_throws() {
        SimpleIntrest si = new SimpleIntrest();
        si.calculateSI(1000.0, -1.0, 5.0);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testCalculateSI_zeroTime_throws() {
        SimpleIntrest si = new SimpleIntrest();
        si.calculateSI(1000.0, 5.0, 0.0);
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void testCalculateSI_nullPrinciple_throwsNullPointer() {
        SimpleIntrest si = new SimpleIntrest();
        si.calculateSI(null, 5.0, 5.0);
    }
}
