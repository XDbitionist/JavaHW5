package org.example.hw5;
import java.util.*;

public class First {
    public static void main(String[] args) {
        String input = "Россия идет вперед всей планеты. Планета — это не Россия.";

        // приводим строку к нижнему регистру и разбиваем на слова по пробелу
        String[] words = input.toLowerCase().split("\\s+");

        // создаем Map для хранения количества вхождений каждого слова
        Map<String, Integer> wordCount = new HashMap<>();

        // перебираем слова и увеличиваем счетчик для каждого вхождения
        for (String word : words) {
            Integer count = wordCount.get(word);
            if (count == null) {
                count = 0;
            }
            wordCount.put(word, count + 1);
        }

        // выводим результат
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
