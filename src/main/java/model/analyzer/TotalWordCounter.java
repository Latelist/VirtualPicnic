package model.analyzer;

public class TotalWordCounter extends ContentAnalyzer {

    private int wordCount;

    public TotalWordCounter(String[] lines) {
        super(lines);
        wordCount = totalWords.size();
    }

    public int getWordCount() {
        return wordCount;
    }
}
