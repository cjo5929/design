package com.company.design.singleton;

public class SocketClient {
    private static SocketClient socketclient;

    private SocketClient() {

    }
    public static SocketClient getInstance(){
        if(socketclient == null){
            socketclient = new SocketClient();
            System.out.println("socket new instance");
        }
        return socketclient;
}

    public void connect(){
        System.out.println("connect");

    }
}
