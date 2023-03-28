import java.sql.Array;
import java.util.Random;
import java.util.Scanner;

/*
 * Create a Magic 8-ball program that gives custom responses to yes or no questions
 */
public class Magic8Ball {
    static Scanner scanner = new Scanner(System.in);
    static String userInput = null;

    public static void main(String[] args) {
        //call the class
        Application magic8Ball = new Application();
        UserInput input = new UserInput();
        UserOutput output = new UserOutput();
        //call the method to run the application
        magic8Ball.run();
        while (true){
            input.askAgain();
        }
    }

}


