public class Dashboard implements State {
    FitnessApplication app;

    public Dashboard(FitnessApplication app) {
        this.app = app;
    }

    public void display() {
        System.out.println("\nDashboard");
        System.out.println("0) Ga terug");
        System.out.println("1) Overzicht van oefeningen");
        System.out.println("2) Sluit de applicatie af");
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
                    System.out.println("Overzicht van oefeningen");
                    break;
                }
                case 2: {
                    app.closeApplication();
                    break;
                }
            }
        }
    }
}