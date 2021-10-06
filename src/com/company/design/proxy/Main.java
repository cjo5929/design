package com.company.design.proxy;
//프록시 패턴

public class Main {

    public static void main(String[] args) {
        IBrowser browser =new BrowserProxy("www.naver.com");
        browser.show();
        browser.show();
        browser.show();
    }
}
