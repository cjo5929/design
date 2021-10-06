package com.company.design.decorator;

public class Audi implements ICar{

    private int cost;

    public Audi(int cost){
        this.cost =cost;
    }
    @Override
    public int getPrice() {
        return this.cost;
    }

    @Override
    public void showCost() {
        System.out.println("Audi는"+ this.cost + "원 입니다.");
    }
}
