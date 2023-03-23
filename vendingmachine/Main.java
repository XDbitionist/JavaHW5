package org.example.vendingmachine;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Создаем несколько горячих напитков
        HotBeverage tea = new HotBeverage("Tea", 250, 80);
        HotDrink coffee = new HotDrink("Coffee", 300, 90);
        HotDrink cocoa = new HotDrink("Cocoa", 200, 85);

        // Создаем торговый автомат и добавляем продукты
        ArrayList<HotBeverage> products = new ArrayList<>();
        products.add(tea);
        products.add(coffee);
        products.add(cocoa);
        HotBeverageVendingMachine vendingMachine = new HotBeverageVendingMachine(products);

        // Получаем продукты из торгового автомата
        HotBeverage drink1 = vendingMachine.getProduct("Tea", 250, 80);
        HotBeverage drink2 = vendingMachine.getProduct("Coffee", 300, 85);

// Выводим информацию о продуктах
        System.out.println(drink1.getName() + " (" + drink1.getVolume() + " ml, " + ((HotDrink) drink1).getTemperature() + " C)");
        System.out.println(drink2.getName() + " (" + drink2.getVolume() + " ml, " + ((HotDrink) drink2).getTemperature() + " C)");
    }
}