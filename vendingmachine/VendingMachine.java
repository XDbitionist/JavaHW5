package org.example.vendingmachine;

// Определяем интерфейс для торговых автоматов
interface VendingMachine {
    HotBeverage getProduct(String name, int volume);
}

