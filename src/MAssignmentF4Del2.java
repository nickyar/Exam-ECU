import java.util.Scanner;

public class MAssignmentF4Del2 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("The word 'stop' is considered as the end of the message.");
        //create an array
        String[] textInput = new String[30];

        LAssignmentF4Del2 logic = new LAssignmentF4Del2();
        logic.processInput(keyboard, textInput);


        keyboard.close();
    }
}