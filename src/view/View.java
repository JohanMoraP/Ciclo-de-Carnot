package view;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class View extends JFrame {

	private TotalPanel totalPanel;
	private int graphicStage;

	public View(ActionListener action) {
		this.setIconImage(new ImageIcon("images/icon4.png").getImage());
		this.setLayout(new GridBagLayout());
		this.graphicStage=0;
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
		this.add(new OptionMenuPanel(action), constraints);
		constraints.weightx = 0.85;
		totalPanel = new TotalPanel(action);
		this.add(totalPanel, constraints);
	}

	public void paintGraphic(ArrayList<double []>coordenates) {
		totalPanel.getPrincipalPanel().paintGraphic(coordenates);
		if(graphicStage==1) {
			totalPanel.getPrincipalPanel().removeNextButton();
		}else if (graphicStage==4) {
			totalPanel.getPrincipalPanel().removeLastButton();
		}else {
			totalPanel.getPrincipalPanel().removeNextButton();
			totalPanel.getPrincipalPanel().removeLastButton();
		}
		totalPanel.getPrincipalPanel().addNextButton();
		graphicStage =1;
		changeGraphic();
	}

	public void nextStage() {
		if(graphicStage == 1) {
			totalPanel.getPrincipalPanel().removeNextButton();
			totalPanel.getPrincipalPanel().addLastButton();
			totalPanel.getPrincipalPanel().addNextButton();

		}else if(graphicStage == 3) {
			totalPanel.getPrincipalPanel().removeNextButton();
		}
		if(graphicStage<4) {
			graphicStage++;
			changeGraphic();
		}	
	}

	public void LastStage() {
		if(graphicStage == 4) {
			totalPanel.getPrincipalPanel().addNextButton();

		}else if(graphicStage == 2) {
			totalPanel.getPrincipalPanel().removeLastButton();
		}
		if(graphicStage>1) {
			graphicStage--;
			changeGraphic();
		}
	}
	
	public void changeGraphic() {
		if(graphicStage==1) {
			totalPanel.getPrincipalPanel().getGraphic().paintGraphiCicleA();
		}else if(graphicStage==2) {
			totalPanel.getPrincipalPanel().getGraphic().paintGraphiCicleB();
		}else if (graphicStage==3) {
			totalPanel.getPrincipalPanel().getGraphic().paintGraphiCicleC();
		}else {
			totalPanel.getPrincipalPanel().getGraphic().paintGraphiCicleD();
		}
	}

	public String [] getValues() {
		return new String [] {totalPanel.getPrincipalPanel().getVarArea1().getText().strip(),
				totalPanel.getPrincipalPanel().getVarArea2().getText().strip(),
				totalPanel.getPrincipalPanel().getVarArea3().getText().strip(),
				totalPanel.getPrincipalPanel().getVarArea4().getText().strip()};
	}

	public ExplicationPanel getExplicationPanel() {
		return totalPanel.getExplicationPanel();
	} 

	public void showGraphic(){
		totalPanel.showPrincipal();
	}

	public void showExplication(){
		totalPanel.showExplication();
	}


}
