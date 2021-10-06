package com.company.design.observer;
//observer 패턴 : 이벤트 전달
public class Main {
    public static void main(String[] args) {
        Button button =new Button("버튼");

        button.addListener(new IButtonListener() {
            @Override
            public void ClickEvent(String event) {
                System.out.println(event);
            }
        });
        button.click("메시지1");
        button.click("메시지2");
        button.click("메시지3");
        button.click("메시지4");
    }

}
