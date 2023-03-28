public class UserOutput {

    public UserOutput() {
        //print out the welcome screen
    }
    public void welcomeScreen(){
        System.out.println("-----------------------------------");
        System.out.println("-------------Welcome---------------");
        System.out.println("----------------to-----------------");
        System.out.println("---------------the-----------------");
        System.out.println("-----------Magic 8 Ball------------");
        System.out.println("-----------------------------------");
    }
    //prompt the user for a question
    public void typeQuestion(){
        System.out.println("Type your question here... ");
    }
    //prompt the user for another question
    public void playAgain(){
        System.out.println("Do you want to ask another question? Y or N");
    }
    public void thanksForPlaying(){
        System.out.println("Thanks for playing my game!");
    }
    public void invalidResponse(){
        System.out.println("Invalid response please try again.");
    }
}
