package model.analyzer;

public class LongestWordFinder extends ContentAnalyzer{
    private String longestWord;
    public LongestWordFinder(String[] lines) {
        super(lines);
        longestWord = findLongestWord();
    }

    private String findLongestWord() {
        int maxLegnth = 0;
        int maxIndex = 0;
        for (int i = 0; i < super.totalWords.size(); ++i) {
            if (super.totalWords.get(i).length() > maxLegnth) {
                maxLegnth = super.totalWords.get(i).length();
                maxIndex = i;
            }
        }
        return super.totalWords.get(maxIndex);
    }

    public String getLongestWord() {
        return longestWord;
    }
}
