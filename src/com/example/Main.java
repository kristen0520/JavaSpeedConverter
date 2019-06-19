package com.example;

public class Main {

    public static double milesPerHour(double kilometersPerHour){
        double mph = kilometersPerHour / 0.6213712;
        mph = Math.round(mph);
        System.out.println(kilometersPerHour + " is equal to " + mph);
        return mph;
    }

    public static void main(String[] args) {
	    milesPerHour(777);
    }
}
