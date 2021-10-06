package com.company.design.decorator;

public class A3 extends AudiDecorator{

    public A3(ICar audi) {
        super(audi);
        this.price= 1000;
    }
}
