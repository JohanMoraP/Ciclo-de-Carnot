package presenter;

import model.Logic;
import view.MyFrame;

public class App {
    private MyFrame view;
    private Logic logic;

    public App() {
        view = new MyFrame();
        logic = new Logic();
    }

    public static void main(String[] args) {
        new App();
    }
}
