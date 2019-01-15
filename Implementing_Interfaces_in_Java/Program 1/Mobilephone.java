package com.sayantandas;

public class Mobilephone implements Telephone {

    private long myNumber;
    private boolean isRnging;
    private boolean isOn = false;
    public Mobilephone(long myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Mobile Phone powered up");
    }

    @Override
    public void dial(long phoneNumber) {
        if(isOn) {
            System.out.println("Now Ringing " + phoneNumber + " on deskphone");
        }
        else{
            System.out.println("Phone is switched off");
        }

    }

    @Override
    public void answer() {
        if(isRnging){
            System.out.println("Answering the mobile phone");
            isRnging=false;
        }

    }

    @Override
    public boolean callPhone(long phoneNumber) {

        if (phoneNumber == myNumber){
            isRnging=true;
            System.out.println("Melody Ring...");
        }
        else{
            isRnging= false;
            System.out.println("Mobile phone not on or number different");
        }
        return isRnging;
    }

    @Override
    public boolean isRinging() {
        return isRnging;
    }
}
