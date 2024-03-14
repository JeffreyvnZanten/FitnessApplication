public class NameVerification implements State {
    FitnessApplication app;

    public NameVerification(FitnessApplication app) {
        this.app = app;
    }

    public void display() {
        System.out.println("\nWat is je naam?");
    }

    public void handleUserInput(String input) {
        if(input.equals(""))
        {
            System.out.println("Je hebt geen naam ingevoerd. Probeer opnieuw.");
        }
        else {
            app.getCurrentUser().setName(input);
            onExit();
            app.setCurrentState(new MainMenu(app));
        }
    }

    void onExit() {
        System.out.println("\nWelkom, " + app.getCurrentUser().getName());
    }
}