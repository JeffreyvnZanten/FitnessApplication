public class MainMenu implements State {
    FitnessApplication app;

    public MainMenu(FitnessApplication app) {
        this.app = app;
    }

    public void display() {
        System.out.println("\nHoofdmenu");
        System.out.println("1) Dashboard");
        System.out.println("2) Lijsten van oefeningen");
        System.out.println("3) Sluit de applicatie af");
    }

    public void handleUserInput(String input) {
        if(app.isValidInteger(input)) {
            int choice = Integer.parseInt(input);

            switch(choice) {
                case 1: {
                    app.setPreviousState(this);
                    app.setCurrentState(new Dashboard(app));
                    break;
                }
                case 2: {
                    app.setPreviousState(this);
                    app.setCurrentState(new ListsOfExercises(app));
                    break;
                }
                case 3: {
                    app.closeApplication();
                    break;
                }
                default: {
                    System.out.println("Geen correcte keuze.\n");
                }
            }
        }
    }
}