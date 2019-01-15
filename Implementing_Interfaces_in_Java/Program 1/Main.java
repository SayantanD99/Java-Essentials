package com.sayantandas;

public class Main {

    public static void main(String[] args) {

        Telephone sdphone;

        sdphone = new DeskPhone(03463_522_255l);

        sdphone.powerOn();
        sdphone.dial(9933985143l);
        sdphone.callPhone(03463_522_255l);
        sdphone.callPhone(9933985143l);
        sdphone.answer();

        sdphone =new Mobilephone(9933985143l);
        sdphone.powerOn();
        sdphone.callPhone(03463_255_760l);
        sdphone.answer();

    }
}
