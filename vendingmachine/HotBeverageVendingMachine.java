package org.example.vendingmachine;
import java.util.ArrayList;

class HotBeverageVendingMachine implements VendingMachine {
    private ArrayList<HotBeverage> products;

    public HotBeverageVendingMachine(ArrayList<HotBeverage> products) {
        this.products = products;
    }

    // Перегружаем метод getProduct для учета температуры
    public HotBeverage getProduct(String name, int volume, int temperature) {
        for (HotBeverage product : products) {
            if (product.getName().equals(name) && product.getVolume() == volume && product.getTemperature() == temperature) {
                products.remove(product);
                return product;
            }
        }
        return null;
    }

    @Override
    public HotBeverage getProduct(String name, int volume) {
        return null;
    }

}

