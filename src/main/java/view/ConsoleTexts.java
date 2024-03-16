package view;

public class ConsoleTexts {

    public void printItemsCount(String itemsCount) {
        System.out.println("Словарь пикника:");
        System.out.println(itemsCount);
    }
    public void printWordCount(int wordcount) {
        System.out.println("Слов в файле: " + wordcount);
    }
    public void printLongestWord(String longestWord) {
        System.out.println("Самое длинное слово: " + longestWord + "\n");
    }

}
