package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class PrincipalPanel extends JPanel{
	private GraphicPanel graphic;
	private JTextArea varArea1;
	private JTextArea varArea2;
	private JTextArea varArea3;
	private JTextArea varArea4;
	private CustomButton nextButton;
	private CustomButton lastButton;
	private CustomButton graphButton;
	private Dimension screenSize;
	private JLabel faseTitleLabel;
	private JPanel buttonPanel ;

	public PrincipalPanel(ActionListener action){
		this.setBackground(new Color(255, 255, 255));
		this.setLayout(new GridBagLayout());
		initComponents(action);
		editComponents(action);
		addComponents(action);
	}
	private void initComponents(ActionListener action){
		this.screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		faseTitleLabel = new JLabel("<html><h1>Gráfico</h1></html>");
		graphic = new GraphicPanel();
		varArea1 = new JTextArea("0"); 
		varArea2 = new JTextArea("0");
		varArea3 = new JTextArea("0");
		varArea4 = new JTextArea("0");
		buttonPanel = new JPanel();
		lastButton = new CustomButton("Anterior etapa", new Color(45, 132, 151), Color.GRAY, Color.WHITE, null, action);
		lastButton.setActionCommand("lastStage");
		nextButton = new CustomButton("Siguiente etapa", new Color(45, 132, 151), Color.GRAY, Color.WHITE, null, action);
		nextButton.setActionCommand("nextStage");
		graphButton = new CustomButton("Graficar", 	new Color(200,80,20), new Color(150,150,150), Color.WHITE, "graphic", action);
	}
	public void editComponents(ActionListener action) {
		varArea1.setColumns(10);
		varArea1.setLineWrap(true); 
		varArea1.setWrapStyleWord(true);
		varArea2.setColumns(10);
		varArea2.setLineWrap(true); 
		varArea2.setWrapStyleWord(true);
		varArea3.setColumns(10);
		varArea3.setLineWrap(true); 
		varArea3.setWrapStyleWord(true);
		varArea4.setColumns(10);
		varArea4.setLineWrap(true); 
		varArea4.setWrapStyleWord(true);
		graphButton.setActionCommand("graphic");
	}
	public void addComponents(ActionListener action) {
		JLabel variable1 = new JLabel("Volumen inicial: ");
		JLabel variable2 = new JLabel("Volumen en B: ");
		JLabel variable3 = new JLabel("Temperatura maxima: ");
		JLabel variable4 = new JLabel("Temperatura minima: ");

		this.add(faseTitleLabel, new GridBagConstraints(0, 0, 4, 1, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets((int)(screenSize.getHeight() * 0.05), (int)(screenSize.getWidth() * 0.2), (int)(screenSize.getHeight() * 0.05) ,0), 0, 0));
				
		this.add(graphic, new GridBagConstraints(0, 1, 1, 5, 0, 0, GridBagConstraints.NORTH, GridBagConstraints.BOTH, getInsets(), 0, 0));
		this.add(variable1, new GridBagConstraints(1, 1, 1, 1,0,0,GridBagConstraints.CENTER,GridBagConstraints.BOTH,new Insets(0,0,0,0), 1, 0));
		this.add(variable2, new GridBagConstraints(1, 2, 1, 1,0,0,GridBagConstraints.CENTER,GridBagConstraints.BOTH,new Insets(0,0,0,0), 1, 0));
		this.add(variable3, new GridBagConstraints(1, 3, 1, 1,0,0,GridBagConstraints.CENTER,GridBagConstraints.BOTH,new Insets(0,0,0,0), 1, 0));
		this.add(variable4, new GridBagConstraints(1, 4, 1, 1,0,0,GridBagConstraints.CENTER,GridBagConstraints.BOTH,new Insets(0,0,0,0), 1, 0));
		this.add(graphButton, new GridBagConstraints(1, 5, 2, 1,0,0,GridBagConstraints.NORTH,GridBagConstraints.NONE,new Insets((int)(screenSize.getHeight() * 0.05),0,0,0), 1, 0));
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportView(varArea1);
		this.add(scrollPane, new GridBagConstraints(2, 1, 1, 1,0,0,GridBagConstraints.CENTER,GridBagConstraints.BOTH,new Insets(0,0,0,0), 1, 0));
		JScrollPane scrollPane2 = new JScrollPane();
		scrollPane2.setViewportView(varArea2);
		this.add(scrollPane2, new GridBagConstraints(2, 2, 1, 1,0,0,GridBagConstraints.CENTER,GridBagConstraints.BOTH,new Insets(0,0,0,0), 1, 0));
		JScrollPane scrollPane3 = new JScrollPane();
		scrollPane3.setViewportView(varArea3);
		this.add(scrollPane3, new GridBagConstraints(2, 3, 1, 1,0,0,GridBagConstraints.CENTER,GridBagConstraints.BOTH,new Insets(0,0,0,0), 1, 0));
		JScrollPane scrollPane4 = new JScrollPane();
		scrollPane4.setViewportView(varArea4);
		this.add(scrollPane4, new GridBagConstraints(2, 4, 1, 1,0,0,GridBagConstraints.CENTER,GridBagConstraints.BOTH,new Insets(0,0,0,0), 1, 0));
		this.add(buttonPanel, new GridBagConstraints(0, 6, 2, 1, 0, 0, GridBagConstraints.EAST, GridBagConstraints.NONE, new Insets(10, 0, 0, 60), 0, 0));
	}

	
	public void addNextButton() {
		buttonPanel.add(nextButton);
		this.revalidate();
		this.repaint();
	}
	public void removeNextButton() {
		buttonPanel.remove(nextButton);
		this.revalidate();
		this.repaint();
	}
	public void addLastButton() {
		buttonPanel.add(lastButton);
		this.revalidate();
		this.repaint();
	}
	public void removeLastButton() {
		buttonPanel.remove(lastButton);
		this.revalidate();
		this.repaint();
	}


	public void paintGraphic(ArrayList<double []>coordenates) {
		graphic.coordenatesDesingGraphic(coordenates);
	}
	public JTextArea getVarArea1() {
		return varArea1;
	}
	public void setVarArea1(JTextArea varArea1) {
		this.varArea1 = varArea1;
	}
	public JTextArea getVarArea2() {
		return varArea2;
	}
	public void setVarArea2(JTextArea varArea2) {
		this.varArea2 = varArea2;
	}
	public JTextArea getVarArea3() {
		return varArea3;
	}
	public void setVarArea3(JTextArea varArea3) {
		this.varArea3 = varArea3;
	}
	public JTextArea getVarArea4() {
		return varArea4;
	}
	public void setVarArea4(JTextArea varArea4) {
		this.varArea4 = varArea4;
	}
	public GraphicPanel getGraphic() {
		return graphic;
	}
	public void setGraphic(GraphicPanel graphic) {
		this.graphic = graphic;
	}
	


}
