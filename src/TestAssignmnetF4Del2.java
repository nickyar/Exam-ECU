import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Scanner;

class TestAssignmnetF4Del2 {
    @Test
    void testCounter() {

        String input = "Hello Sweden\nstop\n"; //go to new line
        Scanner scan = new Scanner(input);
        String[] textInput = new String[10];

        LAssignmentF4Del2 countTester = new LAssignmentF4Del2();
        countTester.processInput(scan, textInput);

        assertEquals(1, countTester.getLineCount(), "Should be 1 line");
        assertEquals(11, countTester.getTotalSymbols(), "Should be 11 symbols");
        assertEquals(2, countTester.getWordCounter(), "Should be 2 words");
    }

    @Test
    void testLongestWord() {

        String input = "Hello Sweden\nstop\n";
        Scanner scan = new Scanner(input);
        String[] textInput = new String[10];

        LAssignmentF4Del2 findLongest = new LAssignmentF4Del2();
        findLongest.processInput(scan, textInput);

        assertEquals("Sweden", findLongest.getLongestWord(), "Longest word should be 'Sweden'");
    }

    @Test
    void testNoWord() {
        String input = "\nstop\n";
        Scanner scan = new Scanner(input);
        String[] textInput = new String[10];

        LAssignmentF4Del2 NoWord = new LAssignmentF4Del2();
        NoWord.processInput(scan, textInput);

        assertEquals(1, NoWord.getLineCount(), "Should be 1 line");
        assertEquals(0, NoWord.getTotalSymbols(), "Should be 0 symbol");
        assertEquals(0, NoWord.getWordCounter(), "Should be 0 words");
        assertEquals("", NoWord.getLongestWord(), "Longest word should be ' ' means nothing.");
    }
    @Test
    void doesItStop() {
        String input = "I opt for stop there";
        Scanner scan = new Scanner(input);
        String[] textInput = new String[10];

        LAssignmentF4Del2 doesStop = new LAssignmentF4Del2();
        doesStop.processInput(scan, textInput);

        assertEquals(1, doesStop.getLineCount(), "Should be 1 line");
        assertEquals(16, doesStop.getTotalSymbols(), "Should be 16 symbol");
        assertEquals(5, doesStop.getWordCounter(), "Should be 5 words");
        assertEquals("there", doesStop.getLongestWord(), "Longest word should be 'there'.");
    }
}

