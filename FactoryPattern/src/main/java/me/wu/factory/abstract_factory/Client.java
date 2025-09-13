package me.wu.factory.abstract_factory;

public class Client {
    public static void main(String[] args) {
//        DessertFactory factory = new AmericanDessertFactory();
        DessertFactory factory = new ItalyDessertFactory();
        Coffee coffee = factory.createCoffee();
        Dessert dessert = factory.createDessert();
        System.out.println(coffee.getName());
        System.out.println(dessert.getName());
    }
}
