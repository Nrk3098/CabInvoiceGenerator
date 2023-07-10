package com.cabinvoice;

public class cabinVoiceGenerator {
    public static final double costperkm=10.0;
    public static final double costpermin =1.0;

    public static final double min_fare =5;
    public double calculateFare(double distance,int time){
                 //25    =  2*10              + 5*1
        double totalvalue=(distance*costperkm)+(time*costpermin);
        if(totalvalue<5){
            return min_fare;
        }
        return totalvalue;
    }
}
