package com.company.design.decorator;

public class AudiDecorator implements ICar{
    protected ICar audi;
    protected int price;
    public AudiDecorator(ICar audi){
        this.audi = audi;
    }
    @Override
    public int getPrice() {
        return audi.getPrice();
    }

    @Override
    public void showCost() {
        System.out.println("가격은 "+(audi.getPrice()+price)+" 만원 입니다");
    }
}
