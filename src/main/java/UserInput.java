import java.util.Random;
import java.util.Scanner;

public class UserInput {
    String yesOrNo;
    private Scanner scanner = new Scanner(System.in);
    public String wantToPlay(){
        System.out.println("Do you want to play? Y or N");
        String yesOrNo = scanner.nextLine();
        return yesOrNo;
    }

    public void userQuestion(){
        String userQuestion = scanner.nextLine();
        int randNum = new Random().nextInt(20);
        String[] answerArr = new String[]{"It is certain.", "It is decidedly so.", "Without a doubt.", "Yes definitely.", "You may rely on it.", "As I see it, yes.", "Most likely.", "Outlook good.", "Yes", "Signs point to yes.", "Reply hazy, try again.", "Ask again later.", "Better not tell you now.", "Cannot predict now.", "Concentrate and ask again.", "Don't count on it.", "My reply is no.", "My sources say no.", "Outlook not so good.", "Very Doubtful"};

        for (int i = 0; i < answerArr.length; i++) {
            if (randNum == i) {
                System.out.println(answerArr[i]);
            }
        }
    }

}
