public class Application {

    public void run(){
        UserOutput output = new UserOutput();
        UserInput input = new UserInput();
        output.welcomeScreen();
        input.wantToPlay();
        output.typeQuestion();
        input.userQuestion();
    }
}
