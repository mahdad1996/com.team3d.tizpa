package com.team3d;

public class economic extends Trip {
    public economic(){
        this.basePrice=5000;
        this.rainRushHour = false;
        this.rain = false;
        this.rushHour = false;
    }


    @Override
    public void calculateTripPrice(int from, int to, boolean rain, boolean rushHour, boolean rainRushHour) {
        int raito = mul.getAreaRate(from,to);
        total += raito * this.basePrice;
        if(rain) total *=1.2;
        if(rushHour) total *=1.2;
        if(rainRushHour) total *= 1.4;
        System.out.println("trip price from "+ from + " to " + to + " is " + total );
    }
}
