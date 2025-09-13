package me.wu.factory.factory_method;

public abstract class Coffee {
    public abstract String getName();

    public void addMilk() {
        System.out.println("add milk");
    }

    public  void addSugar() {
        System.out.println("add sugar");
    }
}
