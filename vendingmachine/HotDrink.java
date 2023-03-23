package org.example.vendingmachine;

class HotDrink extends HotBeverage {
    private int temperature;

    public HotDrink(String name, int volume, int temperature) {
        super(name, volume, temperature);
        this.temperature = temperature;
    }

    // Переопределяем геттер, чтобы возвращать значение дополнительного поля
    @Override
    public int getTemperature() {
        return temperature;
    }
}
