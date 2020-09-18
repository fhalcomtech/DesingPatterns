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
        if(isEmpty())
        {
            this.empty = false;
            this.boiled = false;
        }
        System.out.println("FILL empty:" + empty + " ==> " + "bioler:"+boiled);
    }

    public void boil(){
        if(!isEmpty() && !isBoiled())
        {
            boiled = true;
        }
        System.out.println("BOIL empty:" + empty + " ==> " + "bioler:"+boiled);
    }

    public void drain(){
        if(!isEmpty() && isBoiled())
        {
            empty = true;
            boiled = false;
        }
        System.out.println("DRAIN empty:" + empty + " ==> " + "bioler:"+boiled);
    }

    public boolean isEmpty(){return this.empty;}
    public boolean isBoiled(){return this.boiled;}


}
