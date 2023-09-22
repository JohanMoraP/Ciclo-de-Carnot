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

	public void paintGraphic(ArrayList<double []>coordenates, ArrayList<ArrayList<Double>> values) {
		totalPanel.getPrincipalPanel().addVariablesPanel();
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
		setTitleLabel("Gráfica(Fase "+graphicStage+")");
		changeGraphic(values);
		
	}

	public void nextStage(ArrayList<ArrayList<Double>> values) {
		if(graphicStage == 1) {
			totalPanel.getPrincipalPanel().removeNextButton();
			totalPanel.getPrincipalPanel().addLastButton();
			totalPanel.getPrincipalPanel().addNextButton();

		}else if(graphicStage == 3) {
			totalPanel.getPrincipalPanel().removeNextButton();
		}
		if(graphicStage<4) {
			graphicStage++;
			changeGraphic(values);
		}	
		setTitleLabel("Gráfica(Fase "+graphicStage+")");
	}

	public void LastStage(ArrayList<ArrayList<Double>> values) {
		if(graphicStage == 4) {
			totalPanel.getPrincipalPanel().addNextButton();

		}else if(graphicStage == 2) {
			totalPanel.getPrincipalPanel().removeLastButton();
		}
		if(graphicStage>1) {
			graphicStage--;
			changeGraphic(values);
		}
		setTitleLabel("Gráfica(Fase "+graphicStage+")");
	}
	
	public void changeGraphic(ArrayList<ArrayList<Double>> values) {
		if(graphicStage==1) {
			totalPanel.getPrincipalPanel().getGraphic().paintGraphiCicleA();
			setValues(values.get(0).get(0), values.get(0).get(1), values.get(0).get(2));
		}else if(graphicStage==2) {
			totalPanel.getPrincipalPanel().getGraphic().paintGraphiCicleB();
			setValues(values.get(1).get(0), values.get(1).get(1), values.get(1).get(2));			
		}else if (graphicStage==3) {
			totalPanel.getPrincipalPanel().getGraphic().paintGraphiCicleC();
			setValues(values.get(2).get(0), values.get(2).get(1), values.get(2).get(2));
		}else {
			totalPanel.getPrincipalPanel().getGraphic().paintGraphiCicleD();
			setValues(values.get(3).get(0), values.get(3).get(1), values.get(3).get(2));
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

	public void setTitleLabel(String title) {
		totalPanel.getPrincipalPanel().setFaseTitleLabel(title);
	}
	
	public void setValues(double volume, double pression, double temperature){
		totalPanel.setVolume(volume);
		totalPanel.setPression(pression);
		totalPanel.setTemperature(temperature);
	}
	public void showMessage(String message) {
		new CustomDialog(this, message);
	}
}
