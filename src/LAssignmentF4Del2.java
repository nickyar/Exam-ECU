import java.util.Arrays;
import java.util.Scanner;

public class LAssignmentF4Del2 {
    boolean startProgram = true;
    private int totalSymbols = 0;
    private int lineCount = 0;
    private int wordCounter = 0;
    private String longestWord = "a";

    public void processInput(Scanner keyboard, String[] textInput) {
        System.out.println("Please enter a sentence:");
        //System.out.println(Arrays.toString(textInput));
        while (startProgram == true) {
            for (int i = 0; i < textInput.length; i++) {

                // Read input from the user
                String sentence = keyboard.nextLine(); //;next()

                // Symbol counter
                // Remove all spaces from the sentence
                String sentenceWithoutSpaces = sentence.replace(" ", "");
                textInput[i] = sentenceWithoutSpaces;
                totalSymbols += textInput[i].length();

                //Word Counter
                String[] wordNumber = sentence.split("\\s+");
                wordCounter += wordNumber.length;

                //To find the longest word
                for (String word : wordNumber) { //This loop is typically used to iterate over arrays
                    if (word.length() > longestWord.length()) {
                        longestWord = word;
                    }
                }

                //Check for the "stop" as a condition to terminate the program
                if (sentence.contains("stop")) {
                    System.out.println("This is the end of the text, because you wrote 'stop'.");

                    //Adjust symbol count and line count
                    totalSymbols -= 4;      // Deduct 4 for "stop"
                    lineCount = i;
                    wordCounter = wordCounter - 1; //to exclude "stop"

                    System.out.println("Total number of symbols: " + totalSymbols);
                    System.out.println("Total number of lines: " + lineCount);
                    System.out.println("Total number of words: " + wordCounter);
                    System.out.println("The longest word is " + " '" + longestWord + "'");

                    startProgram = false;
                    break;
                }
            }
        }
    }

    public int getLineCount() {
        return lineCount;
    }

    public int getTotalSymbols() {
        return totalSymbols;
    }

    public int getWordCounter() {
        return wordCounter;
    }

    public String getLongestWord() {
        return longestWord;
    }
}

