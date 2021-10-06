package com.company.design.adapter;
//어댑터 패턴
public class Main {
    public static void connect(Electronic110V electronic110V){
        electronic110V.PowerOn();
    }

    public static void main(String[] args) {
        HairDryer hairDryer =new HairDryer();
        connect(hairDryer);

        Cleaner cleaner =new Cleaner();
        AirConditioner airConditioner = new AirConditioner();

        Electronic110V _cleaner = new SocketAdapter(cleaner);
        Electronic110V _airConditioner = new SocketAdapter(airConditioner);

        connect(_cleaner);
        connect(_airConditioner);

    }

}
