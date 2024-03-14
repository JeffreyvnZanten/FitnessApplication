import java.util.Scanner;

public class FitnessApplication {
    private State currentState, previousState;
    private Scanner scanner;
    private User currentUser;

    public FitnessApplication() {
        currentState = new AgeVerification(this);
        previousState = null;
        scanner = new Scanner(System.in);
        currentUser = new User();
    }

    public void run() {
        while (true) {
            // Display current menu
            currentState.display();
            
            // Get user input
            String userInput = scanner.nextLine();
            
            // Handle user input
            currentState.handleUserInput(userInput);
        }
    }

    public void setCurrentState(State state) { currentState = state; }

    public void setPreviousState(State state) {
        previousState = state;
    }

    public State getPreviousState() {
        return previousState;
    }

    public void setUser(User user) {
        currentUser = user;
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public void closeApplication() {
        System.out.println();
        System.out.println("De app wordt afgesloten.");

        try
        {
            Thread.sleep(2000);
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }

        System.exit(0);
    }

    public boolean isValidInteger(String input) {
        try
        {
            Integer.parseInt(input);
            
            return true;
        }
        catch(NumberFormatException  e)
        {
            System.out.println("Voer cijfers in.\n");

            return false;
        }
    }
}