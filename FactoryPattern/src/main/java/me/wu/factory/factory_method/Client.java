package me.wu.factory.factory_method;

public class Client {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();

        coffeeStore.setCoffeeFactory(new AmericanCoffeeFactory());
        Coffee americanCoffee = coffeeStore.orderCoffee();
        System.out.println(americanCoffee.getName());

        coffeeStore.setCoffeeFactory(new LatteCoffeeFactory());
        Coffee latteCoffee = coffeeStore.orderCoffee();
        System.out.println(latteCoffee.getName());
    }
}
