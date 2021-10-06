package com.company.design.facade;

public class Reader {

    public Reader(String fileName){

    }

    public void fileConnect(){
        System.out.println("FileReader Connected");
    }

    public String fileRead(){
        return "content";
    }

    public void fileDisconnect(){
        System.out.println("FileReader disConnected");
    }
}