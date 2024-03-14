public class DummyList implements State {
    FitnessApplication app;

    public DummyList(FitnessApplication app) {
        this.app = app;
    }

    public void display() {
        System.out.println("\nDummy Lijst");
        displayList();
        displayMenu();
    }

    public void handleUserInput(String input) {
        if(app.isValidInteger(input)) {
            int choice = Integer.parseInt(input);

            switch (choice) {
                case 0: {
                    app.setCurrentState(app.getPreviousState());
                    break;
                }
                case 1: {
                    app.closeApplication();
                    break;
                }
            }
        }
    }

    void displayList() {
        for (Exercise exercise : app.getCurrentUser().getExercises()) {
            System.out.println(exercise.toString());
        }
        System.out.println();
    }

    void displayMenu() {
        System.out.println("0) Ga terug");
        System.out.println("1) Sluit de applicatie af");
    }
}