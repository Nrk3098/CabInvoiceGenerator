package com.cabinvoice;
import org.testng.Assert;
import org.testng.annotations.Test;


public class CabinVoiceGeneratorTest {

    cabinVoiceGenerator cabinvoicegenrator = new cabinVoiceGenerator();

    @Test

    public void TotalFare() {
        double distance = 2.0;

        int time = 5;

        double result = cabinvoicegenrator.calculateFare(distance, time);

        Assert.assertEquals(25, result);
    }
}
