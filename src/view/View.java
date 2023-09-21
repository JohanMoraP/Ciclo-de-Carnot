package view;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class View extends JFrame {
	private PrincipalPanel principalPanel;

	public View(ActionListener action) {
		this.setLayout(new GridBagLayout());
		this.setIconImage(new ImageIcon("images/icon4.png").getImage().getScaledInstance(400, 400, Image.SCALE_SMOOTH));
		this.setSize(1000, 700);
		this.setLocationRelativeTo(null);
		initComponents(action);
		this.setTitle("Graficadora del ciclo de Carnot");
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	private void initComponents(ActionListener action) {
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.fill = GridBagConstraints.BOTH;
		constraints.gridheight = 3;
		constraints.weightx = 0.15;
		constraints.weighty = 1.0;
		constraints.weightx = 0.85;
		principalPanel = new PrincipalPanel(action);
		this.add(new OptionMenuPanel(), constraints);
		this.add(principalPanel, constraints);
	}

	public void paintGraphic(ArrayList<double []>coordenates) {
		principalPanel.paintGraphic(coordenates);
	}

	public String [] getValues() {

		return new String [] {principalPanel.getVarArea1().getText().strip(),
				principalPanel.getVarArea2().getText().strip(),
				principalPanel.getVarArea3().getText().strip(),
				principalPanel.getVarArea4().getText().strip()};
	}
}
