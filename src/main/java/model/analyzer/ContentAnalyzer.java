package model.analyzer;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class ContentAnalyzer {
    protected String[] lines;
    protected ArrayList<String> totalWords;

    public ContentAnalyzer(String[] lines) {
        this.lines = lines;
        totalWords = new ArrayList<>();
        for (String line : lines) {
            String[] words = line.split("\\s+");
            totalWords.addAll(Arrays.asList(words));
        }
    }
}
