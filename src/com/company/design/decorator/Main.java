package com.company.design.decorator;
//decorator 패턴
public class Main {
    public static void main(String[] args) {
        ICar audi =new Audi(1000);
        audi.showCost();

        ICar a3 = new A3(audi);
        a3.showCost();
        ICar a4 = new A4(audi);
        a4.showCost();
        ICar a5 = new A5(audi);
        a5.showCost();

   }
}
