import java.util.Arrays;
import java.util.Scanner;

public class LAssignmentF4Del2 {

    public void processInput(Scanner keyboard, String[] textInput) {
        boolean startProgram = true;
        int totalSymbols = 0;
        int lineCount = 0;


        System.out.println(Arrays.toString(textInput));

        while (startProgram==true) {
            for (int i = 0; i < textInput.length; i++) {
                System.out.println("Please enter a sentence:");

                // Read input from the user
                String sentence = keyboard.nextLine(); //;next()

                // Remove all spaces from the sentence
                String sentenceWithoutSpaces = sentence.replace(" ", "");
                System.out.println(sentenceWithoutSpaces);
                textInput[i] = sentenceWithoutSpaces;

                // Update symbol counter
                totalSymbols += textInput[i].length();
                System.out.println("Total symbols so far: " + totalSymbols);
                System.out.println(Arrays.toString(textInput));


                // Check for the stop condition
                if (sentence.contains("stop")) {
                    System.out.println("This is the end of the message because you wrote 'stop'.");
                    System.out.println("End");

                    // Adjust symbol count and line count
                    totalSymbols -= 4; // Deduct 4 for "stop"
                    lineCount = i-1;

                    System.out.println("Total number of symbols: " + totalSymbols);
                    System.out.println("Total number of lines entered: " + i);

                    startProgram = false;
                    break;
                }
            }
        }
    }
}

