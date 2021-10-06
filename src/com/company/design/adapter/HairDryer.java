package com.company.design.adapter;

public class HairDryer implements Electronic110V{
    @Override
    public void PowerOn() {
        System.out.println("110V 드라이기 ON");
    }
}
