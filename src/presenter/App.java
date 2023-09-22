package presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Logic;
import view.Constants;
import view.View;

public class App implements ActionListener {
	private View view;
	private Logic logic;

	public App() {
		view = new View(this);
		logic = new Logic();
	}

	@Override
	public void actionPerformed(ActionEvent event) {

		String source = event.getActionCommand();
		switch (source) {

		case "graphic": {
			String verify = logic.valueFormatValues(view.getValues());
			if (verify == null) {
				String[] values = view.getValues();
				view.paintGraphic(logic.coordenatesCalculator(Double.parseDouble(values[0]), Double.parseDouble(values[1]),
						Double.parseDouble(values[2]), Double.parseDouble(values[3])), logic.getValues());
			} else {
				view.showMessage(verify);
				System.out.println(verify);
			}
			break;
		}
		case "nextStage": {
			view.nextStage(logic.getValues());
			break;
		}
		case "lastStage": {
			view.LastStage(logic.getValues());
			break;
		}

		case Constants.NEXT_EXPLICATION: {
			view.getExplicationPanel().showPhases();
			break;
		}

		case Constants.BEFORE_EXPLICATION: {
			view.getExplicationPanel().showInfo();
			break;
		}

		case Constants.GRAPHIC: {
			view.showGraphic();
			break;
		}

		case Constants.EXPLICATION: {
			view.showExplication();
			break;
		}

		case Constants.CONCEPTS: {
			view.getExplicationPanel().showConcepts();
		}
		}
	}

	public static void main(String[] args) {
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new App();
			}
		});
	}
}
