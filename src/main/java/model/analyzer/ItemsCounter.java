package model.analyzer;

import java.io.Console;
import java.util.HashMap;

public class ItemsCounter extends ContentAnalyzer{

    private HashMap<String, Integer> items;
    public ItemsCounter(String[] lines) {
        super(lines);
        countItems();
    }

    private void countItems() {
        items = new HashMap<>();
        int counter = 0;
        for (String totalWord : super.totalWords) {
            if (items.containsKey(totalWord) && !totalWord.isEmpty()) {
                counter = items.get(totalWord) + 1;
                items.put(totalWord, counter);
            } else if (!totalWord.isEmpty()) {
                items.put(totalWord, 1);
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder strb = new StringBuilder();
        for (String key : items.keySet()) {
            strb.append(key).append(": ").append(items.get(key)).append("\n");
        }
        return strb.toString();
    }
}
