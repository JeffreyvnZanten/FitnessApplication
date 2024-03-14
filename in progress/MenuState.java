/* import java.util.*;

public class MenuState implements State {
    List<MenuItem> menuItems;
    FitnessApplication app;
    String header;

    public MenuState(FitnessApplication app, String header) {
        this.app = app;
        this.menuItems = new ArrayList<MenuItem>();
        this.header = header;
    }

    public void display() {
        displayHeader();
        displayMenu();
    }

    public void handleUserInput(String input) {
        if(app.isValidInteger(input)) {
            int choice = Integer.parseInt(input);

            if(choice == 0) app.setCurrentState(app.getPreviousState());
            else if(choice >= 1 && choice <= menuItems.size()) {
                menuItems.get(choice).select();
            }
            else if(choice == (menuItems.size() + 1)) {
                app.closeApplication();
            }
            else System.out.println("Verkeerde keuze");
        }
    }

    public void addMenuItem(MenuItem item) {
        menuItems.add(item);
    }

    void displayHeader() {
        System.out.println(header);
    }

    void displayMenu() {
        if(app.getPreviousState() != null) {
            System.out.println("0) Ga terug");
        }

        for(int i = 0; i < menuItems.size(); i++) {
            System.out.println(i+1 + ") " +  menuItems.get(i).getContent());
        }

        System.out.println((menuItems.size() + 1) + ") Sluit de applicatie af");
    }
} */