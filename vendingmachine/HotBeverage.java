package org.example.vendingmachine;

class HotBeverage {
    private String name;
    private int volume;
    private int temperature;

    public HotBeverage(String name, int volume, int temperature) {
        this.name = name;
        this.volume = volume;
        this.temperature = temperature;
    }

    // Геттеры для доступа к полям
    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public int getTemperature() {
        return temperature;
    }
}
