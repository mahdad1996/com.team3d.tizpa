package com.team3d;

public class motor extends Trip {

    public motor(){
        this.basePrice = 4000;
        this.rainRushHour = false;
        this.rain = false;
        this.rushHour = false;

    }


    @Override
    public void calculateTripPrice(int from, int to, boolean rain, boolean rushHour, boolean rainRushHour) {
        int raito = mul.getAreaRate(from,to);
        total += raito * this.basePrice;
        if(rain) total *=0.8;
        if(rushHour) total *=2;
        if(rainRushHour) total *=1.5;
        System.out.println("trip price from "+ from + " to " + to + " is " + total );
    }
}
