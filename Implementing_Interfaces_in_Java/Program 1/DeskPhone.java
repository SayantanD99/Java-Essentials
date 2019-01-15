package com.sayantandas;

public class DeskPhone implements Telephone {
    private long myNumber;
    private boolean isRnging;

    public DeskPhone(long myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("No action taken, deskphone does not have a power buttom");
    }

    @Override
    public void dial(long phoneNumber) {
        System.out.println("Now Ringing "+phoneNumber+" on deskphone");

    }

    @Override
    public void answer() {
        if(isRnging){
            System.out.println("Answering the desk phone");
            isRnging=false;
        }

    }

    @Override
    public boolean callPhone(long phoneNumber) {

        if (phoneNumber == myNumber){
            isRnging=true;
            System.out.println("Ring ring...");
        }
        else{
            isRnging= false;
        }
        return isRnging;
    }

    @Override
    public boolean isRinging() {
        return isRnging;
    }
}
