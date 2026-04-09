package com.overriding;

public class Guitar extends  Instrument{
    @Override
    void play() {
        System.out.println("Playing the guitar");
    }

}
