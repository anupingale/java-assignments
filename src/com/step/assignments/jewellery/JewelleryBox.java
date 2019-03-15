package com.step.assignments.jewellery;

public class JewelleryBox {
   private Jewellery jewellery;
   private JewelleryBox box;
   static int count = 0;

    public JewelleryBox(Jewellery jewellery) {
        this.count++;
        this.jewellery = this.jewellery;
    }

    public JewelleryBox(Jewellery jewellery, JewelleryBox box) {
        this.count++;
        this.jewellery = jewellery;
        this.box = box;
    }

    public JewelleryBox() {

    }

    public JewelleryBox(JewelleryBox box) {
        this.box = box;
    }

    public void addJewelleryBox() {
        JewelleryBox box = new JewelleryBox(this.box);
    }

    public void addJewellery(String name) {
        count++;
        Jewellery jewellery = new Jewellery(name);
    }

    public int jewelleryCount() {
        return this.count;
    }
}
