package com.fhalcom.dev.desing.patterns.singleton;

import com.fhalcom.dev.desing.patterns.singleton.chocolate.ChocolateBoiler;
import com.fhalcom.dev.desing.patterns.singleton.chocolate.ChocolateThead;

public class SinletonMain {
    public static void main(String []args) throws InterruptedException {

        Thread c1 = new ChocolateThead(), c2 = new ChocolateThead();

        c1.start();
        c1.start();
        c1.wait(1000);
        c1.getBoiler().fill();
        c1.getBoiler().fill();
        c2.wait(2000);
        c1.wait(3000);
        c1.getBoiler().boil();
        c2.getBoiler().boil();
        c2.wait(2000);
        c1.wait(1000);
        c1.getBoiler().drain();
        c2.getBoiler().drain();

    }

}
