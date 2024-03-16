package controller;

import model.analyzer.ItemsCounter;
import model.analyzer.LongestWordFinder;
import model.reader.InputFileReader;
import model.analyzer.TotalWordCounter;
import view.ConsoleTexts;

import java.io.IOException;

public class Controller {
    private InputFileReader inputFileReader;
    private TotalWordCounter totalWordCounter;
    private LongestWordFinder longestWordFinder;
    private ItemsCounter itemsCounter;
    private ConsoleTexts consoleTexts;

    public void run() throws IOException {
        consoleTexts = new ConsoleTexts();
        inputFileReader = new InputFileReader("src/main/input.txt");
        String[] lines = inputFileReader.getLines().toArray(new String[0]);
        totalWordCounter = new TotalWordCounter(lines);

        consoleTexts.printWordCount(totalWordCounter.getWordCount());

        longestWordFinder = new LongestWordFinder(lines);

        consoleTexts.printLongestWord(longestWordFinder.getLongestWord());

        itemsCounter = new ItemsCounter(lines);
        consoleTexts.printItemsCount(itemsCounter.toString());

    }
}
