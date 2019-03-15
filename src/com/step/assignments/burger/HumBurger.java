package com.step.assignments.burger;

public class HumBurger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    public String addition1Name;
    public double addition1Price;

    public String addition2Name;
    public double addition2Price;

    public String addition3Name;
    public double addition3Price;

    public String addition4Name;
    public double addition4Price;

    public HumBurger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addAddition1(String addition1Name,double addition1Price) {
        this.addition1Name = addition1Name;
        this.addition1Price = addition1Price;
    }

    public void addAddition2(String addition2Name, double addition2Price) {
        this.addition2Name = addition2Name;
        this.addition2Price = addition2Price;
    }

    public void addAddition3(String addition3Name, double addition3Price) {
        this.addition3Name = addition3Name;
        this.addition3Price = addition3Price;
    }

    public void addAddition4(String addition4Name, double addition4Price) {
        this.addition4Name = addition4Name;
        this.addition4Price = addition4Price;
    }

    public String getBurgerDetails() {
        String burger = this.name + " burger bought for " + this.price + "\n";
        String additions = "";
        if(addition1Name != null) {
            additions += addition1Name + " for price " + addition1Price + "\n";
        }
        if(addition2Name != null) {
            additions += addition2Name + " for price " + addition2Price + "\n";
        }
        if(addition3Name != null) {
            additions += addition3Name + " for price " + addition3Price + "\n";
        }
        if(addition4Name != null) {
            additions += addition4Name + " for price " + addition4Name;
        }
        return burger + additions;
    }

    public static void main(String[] args) {
        HumBurger h = new HumBurger("burger","fjb",12345.234,"roll");
        h.addAddition1("anvfgsj",326745);
        System.out.println(h.getBurgerDetails());
    }
}

