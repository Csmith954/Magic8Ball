public class Application {

    public void run(){
        //call the classes
        UserOutput output = new UserOutput();
        UserInput input = new UserInput();
        //call welcome screen
        output.welcomeScreen();
        //ask for the question
        output.typeQuestion();
        //display the answer after the input
        input.userQuestion();
    }

    public void runAgain(){
        UserOutput output = new UserOutput();
        UserInput input = new UserInput();
        output.typeQuestion();
        input.userQuestion();
    }
}
