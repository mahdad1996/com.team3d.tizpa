package com.team3d;

public class special extends Trip {

    public special(){
        this.basePrice = 10000;
        this.rainRushHour = false;
        this.rain = false;
        this.rushHour = false;
    }


    @Override
    public void calculateTripPrice(int from, int to, boolean rain, boolean rushHour, boolean rainRushHour) {
        int raito = mul.getAreaRate(from,to);
        total += raito * this.basePrice;
        if(rain) total *=2;
        if(rushHour) total *=2;
        if(rainRushHour) total *= 3;
        System.out.println("trip price from "+ from + " to " + to + " is " + total );
    }
}
