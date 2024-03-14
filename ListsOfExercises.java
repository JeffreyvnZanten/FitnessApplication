public class ListsOfExercises implements State {
    FitnessApplication app;

    public ListsOfExercises(FitnessApplication app) {
        this.app = app;
    }

    public void display() {
        System.out.println("\nLijsten van oefeningen");
        System.out.println("0) Ga terug");
        System.out.println("1) Dummy lijst");
        System.out.println("2) Nieuwe lijst van oefeningen");
        System.out.println("3) Sluit de applicatie af");
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
                    app.setPreviousState(this);
                    app.setCurrentState(new DummyList(app));
                    break;
                }
                case 2: {
                    System.out.println("Nieuwe lijst");
                    break;
                }
                case 3: {
                    app.closeApplication();
                    break;
                }
            }
        }
    }
}