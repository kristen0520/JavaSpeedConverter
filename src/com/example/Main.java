package com.example;

public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour){
        double mphD = kilometersPerHour * 0.6213712;
        long mph = Math.round(mphD);
        return mph;
    }
    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour < 0){
            System.out.println("Invalid Value");
        }
        else{
            long mph = Math.round(kilometersPerHour * 0.6213712);
            System.out.println(kilometersPerHour + " km/h = " + mph + " mi/h");
        }
    }
}
