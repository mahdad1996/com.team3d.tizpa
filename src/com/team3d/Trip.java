package com.team3d;

public abstract class Trip {

    double basePrice = 0;
    boolean rainRushHour = false;
    boolean rushHour = false;
    boolean rain = false;
    mul mul = new mul();
    int total=0;

    public abstract void calculateTripPrice(int from,int to,boolean rain,boolean rushHour,boolean rainRushHour);


}
