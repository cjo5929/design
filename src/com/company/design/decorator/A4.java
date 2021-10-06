package com.company.design.decorator;

public class A4 extends AudiDecorator{

    public A4(ICar audi) {
        super(audi);
        this.price= 2000;
    }
}
