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
		//view.paintGraphic(logic.coordenatesCalculator(250000, 0.01662892, 0.1434, 300));

	}


	@Override
	public void actionPerformed(ActionEvent event) {
		String source = event.getActionCommand();
		switch (source) {

		case "graphic": {
			String verify =logic.valueFormatValues(view.getValues());
			if (verify==null) {
				String [] values = view.getValues();
				view.paintGraphic(logic.coordenatesCalculator(Double.parseDouble(values[0]),Double.parseDouble(values[1]),Double.parseDouble(values[2]),Double.parseDouble(values[3])));
			}else {
				System.out.println(verify);
			}
				break;
		}
		}

	}







	public static void main(String[] args) {
		
		System.out.println(Double.MAX_VALUE);
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} 
		catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} 
		catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new App();
			}
		});



	}
}
