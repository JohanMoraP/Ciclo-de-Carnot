package presenter;

import model.Logic;
import view.MyFrame;

public class App {
    private MyFrame frame;
    private Logic logic;

    App() {
        frame = new MyFrame();
        logic = new Logic();
    }

    public static void main(String[] args) {
        new App();
    }
}
