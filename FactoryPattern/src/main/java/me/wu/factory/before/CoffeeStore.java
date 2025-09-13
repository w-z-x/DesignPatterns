package me.wu.factory.before;

public class CoffeeStore {

    public Coffee orderCoffee(String type) {
        Coffee coffee = null;
        if ("american".equals(type)) {
            coffee = new AmericanCoffee();
        } else if ("latte".equals(type)) {
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("have no such type");
        }
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
