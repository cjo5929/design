package com.company.design.facade;

public class Writer {

    public Writer(String fileName){

    }

    public void fileConnect(){
        System.out.println("FileWriter Connected");
    }

    public void fileWrite(){
        System.out.println("Writer");
    }

    public void fileDisconnect(){
        System.out.println("FileWriter disConnected");
    }
}