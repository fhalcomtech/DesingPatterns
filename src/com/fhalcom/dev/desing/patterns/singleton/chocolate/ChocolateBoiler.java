package com.fhalcom.dev.desing.patterns.singleton.chocolate;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    private static ChocolateBoiler uniqueInstance = null;

    private ChocolateBoiler(){
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getInstance(){
        if(uniqueInstance==null)return new ChocolateBoiler();
        else return uniqueInstance;
    }

    public void fill(){
        if()
    }

    public boolean isEmpty(){return this.empty;};

}
