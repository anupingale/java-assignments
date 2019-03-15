package com.step.assignments.inheritance;

public class Mercedez extends Car {
    private String colour;
    private String model;

    public Mercedez(String colour,String model) {
        super("Benz",320,4,"Mercedez","Annapurna");
        this.colour = colour;
        this.model = model;
    }

    public void buy(int price) {
        System.out.println("bought for " + price);
    }
}
