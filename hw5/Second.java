package org.example.hw5;
import java.util.HashMap;
import java.util.Map;

public class Second {
    public static void main(String[] args) {
        String text = "The quick brown fox jumps over the lazy dog";
        String word = "the";

        // Создание map для хранения слов и их количества
        Map<String, Integer> wordCountMap = new HashMap<>();

        // Разбиение текста на слова
        String[] words = text.toLowerCase().split("\\W+");

        // Подсчет количества вхождений искомого слова
        for (String w : words) {
            if (w.equals(word)) {
                int count = wordCountMap.getOrDefault(word, 0);
                wordCountMap.put(word, count + 1);
            }
        }

        // Вывод результата
        System.out.println("Количество вхождений слова \"" + word + "\": " + wordCountMap.getOrDefault(word, 0));
    }
}
