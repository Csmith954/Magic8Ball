import org.w3c.dom.ls.LSOutput;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class UserInput {
    //set string variable
    String yesOrNo;
    //set scanner
    private Scanner scanner = new Scanner(System.in);
    //create method to capture if the user wants to ask another question
    public void askAgain(){
        Application application = new Application();
        UserOutput output = new UserOutput();
        output.playAgain();
        String yesOrNo = scanner.nextLine();
        if (yesOrNo.equalsIgnoreCase("y")) {
            application.runAgain();
        } else if (yesOrNo.equalsIgnoreCase("n")) {
            output.thanksForPlaying();
            System.exit(0);
        } else {
            output.invalidResponse();
        }
    }

    //set a method to capture the users question and trigger a response
    public void userQuestion(){
        String userQuestion = scanner.nextLine();
        int randNum = new Random().nextInt(20);
        String[] answerArr = new String[]{"It is certain.", "It is decidedly so.", "Without a doubt.", "Yes definitely.",
                "You may rely on it.", "As I see it, yes.", "Most likely.", "Outlook good.", "Yes", "Signs point to yes.",
                "Reply hazy, try again.", "Ask again later.", "Better not tell you now.", "Cannot predict now.",
                "Concentrate and ask again.", "Don't count on it.", "My reply is no.", "My sources say no.",
                "Outlook not so good.", "Very Doubtful"};

        for (int i = 0; i < answerArr.length; i++) {
            if (randNum == i) {
                System.out.println(answerArr[i]);
            }
        }
    }

}
