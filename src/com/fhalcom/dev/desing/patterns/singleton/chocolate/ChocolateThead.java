package com.fhalcom.dev.desing.patterns.singleton.chocolate;

import java.util.Locale;
import java.util.Random;

public class ChocolateThead extends Thread{
    private ChocolateBoiler boiler = null;
    private String name;
    @Override
    public void run() {
        try {
            this.wait(1000);
            boiler.fill();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " Thread");
    }

    public ChocolateThead(){
        System.out.println(name + " Thread");
        boiler = ChocolateBoiler.getInstance();
    }

    public ChocolateBoiler getBoiler(){
        return this.boiler;
    }
}
