package me.wu.factory.before;

public class Client {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        Coffee americanCoffee = coffeeStore.orderCoffee("american");
        System.out.println(americanCoffee.getName());
        Coffee latteCoffee = coffeeStore.orderCoffee("latte");
        System.out.println(latteCoffee.getName());
    }
}
