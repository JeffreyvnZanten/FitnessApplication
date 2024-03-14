public class MenuItem {
    String content;
    Runnable action;

    public MenuItem(String content, Runnable action) {
        this.content = content;
        this.action = action;
    }

    public String getContent() {
        return content;
    }

    public void select() {
        action.run();
    }
}