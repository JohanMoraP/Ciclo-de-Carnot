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
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
