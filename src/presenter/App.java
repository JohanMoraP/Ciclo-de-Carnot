package presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Logic;
import view.View;

public class App implements ActionListener{
    private View view;
    private Logic logic;

    public App() {
        view = new View(this);
        logic = new Logic();
        view.paintGraphic(logic.coordenatesCalculator(250000, 0.01662892, 0.1434, 300));
        Thread runnable = new Thread() {
			
			@Override
			public void run() {
				
				try {
		        	
		        }catch(Exception ex) {
		        }
				
			}
		};
       // runnable.run();
    }
    public static void main(String[] args) {
        new App();
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
