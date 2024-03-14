class AgeVerification implements State {
    private FitnessApplication app;

    public AgeVerification(FitnessApplication app) {
        this.app = app;
    }

    public void display() {
        System.out.println("Wat is je leeftijd?");
    }

    public void handleUserInput(String input) {
        if(app.isValidInteger(input))
        {
            int age = Integer.parseInt(input);

            if(isRequiredAge(age)) {
                app.getCurrentUser().setAge(age);
                app.setCurrentState(new NameVerification(app));
            }
            else app.closeApplication();
        }
    }
    
    boolean isRequiredAge(int age) {
        if (age < 18)
        {
            System.out.println();
            System.out.println("Voor het gebruik van deze app moet je 18 jaar of ouder zijn.");

            return false;
        }
        else return true;
    }
}