package com.company.design.aop;

import com.company.design.proxy.IBrowser;

import java.util.concurrent.atomic.AtomicLong;

//Aop패턴
public class Main {
    public static void main(String[] args) {

        AtomicLong start =new AtomicLong();
        AtomicLong end =new AtomicLong();

        IBrowser aopBrowser =new AopProxy("www.naver.com",
                ()->{
                    System.out.println("before");
                    start.set(System.currentTimeMillis());
                },
                () ->{
                    System.out.println("after");
                    long now = System.currentTimeMillis();
                    end.set(now - start.get());
                }
        );
        aopBrowser.show();
        System.out.println("loading time :" + end.get());

        aopBrowser.show();
        System.out.println("loading time :" + end.get());



    }
}
