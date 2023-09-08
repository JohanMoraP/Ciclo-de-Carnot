package presenter;

import model.Logic;
import view.View;

public class App {
    private View view;
    private Logic logic;

    public App() {
        view = new View();
        logic = new Logic();
    }
    public static void main(String[] args) {
        new App();
    }
}
