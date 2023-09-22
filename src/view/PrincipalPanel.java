package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
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
import javax.swing.JTextField;

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
	private JTextField volumeText;
	private JTextField pressionText;
	private JTextField temperatureText;
	private JPanel variables;

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
		JLabel variable1 = new JLabel("Volumen inicial [m^3 / mol]: ");
		JLabel variable2 = new JLabel("Volumen en B [m^3 / mol]: ");
		JLabel variable3 = new JLabel("Temperatura caliente [K]: ");
		JLabel variable4 = new JLabel("Temperatura fría [K]: ");

		this.add(faseTitleLabel, new GridBagConstraints(0, 0, 4, 1, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets((int)(screenSize.getHeight() * 0.05), (int)(screenSize.getWidth() * 0.2), (int)(screenSize.getHeight() * 0.05) ,0), 0, 0));
				
		this.add(graphic, new GridBagConstraints(0, 1, 1, 6, 0, 0, GridBagConstraints.NORTH, GridBagConstraints.BOTH, getInsets(), 0, 0));
		this.add(variable1, new GridBagConstraints(1, 1, 1, 1,0,0,GridBagConstraints.CENTER,GridBagConstraints.BOTH,new Insets(0,0,0,0), 1, 0));
		this.add(variable2, new GridBagConstraints(1, 2, 1, 1,0,0,GridBagConstraints.CENTER,GridBagConstraints.BOTH,new Insets(0,0,0,0), 1, 0));
		this.add(variable3, new GridBagConstraints(1, 3, 1, 1,0,0,GridBagConstraints.CENTER,GridBagConstraints.BOTH,new Insets(0,0,0,0), 1, 0));
		this.add(variable4, new GridBagConstraints(1, 4, 1, 1,0,0,GridBagConstraints.CENTER,GridBagConstraints.BOTH,new Insets(0,0,0,0), 1, 0));
		this.add(graphButton, new GridBagConstraints(1, 5, 2, 1,0,0,GridBagConstraints.NORTH,GridBagConstraints.NONE,new Insets((int)(screenSize.getHeight() * 0.03),0,(int)(screenSize.getHeight() * 0.03),0), 1, 0));
		
		variables = new JPanel(new GridBagLayout());
		variables.setBackground(new Color(230, 247, 255));
		GridBagConstraints gbc = new GridBagConstraints();
		
		gbc.gridwidth = 2;
		gbc.fill = GridBagConstraints.BOTH;
		JLabel title = new JLabel("Variables");
		title.setFont(new Font("Arial", Font.ITALIC, 20));
		title.setHorizontalAlignment(JLabel.CENTER);
		variables.add(title, gbc);
		
		gbc.gridwidth = 1;
		gbc.gridy = 1;
		JLabel volume = new JLabel("Volumen: ");
		variables.add(volume, gbc);
		
		gbc.gridx = 1;
		volumeText = new JTextField(10);
		volumeText.setEditable(false);
		variables.add(volumeText, gbc);
		
		gbc.gridy = 2;
		gbc.gridx = 0;
		JLabel pression = new JLabel("Presión: ");
		variables.add(pression, gbc);
		
		gbc.gridx = 1;
		pressionText = new JTextField(10);
		pressionText.setEditable(false);
		variables.add(pressionText, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 3;
		JLabel temperature = new JLabel("Temperatura: ");
		variables.add(temperature, gbc);
		
		gbc.gridx = 1;
		temperatureText =  new JTextField(10);
		temperatureText.setEditable(false);
		variables.add(temperatureText, gbc);
		add(variables, new GridBagConstraints(1, 6, 2, 1,0,0,GridBagConstraints.NORTH,GridBagConstraints.BOTH,new Insets(10,0,0,0), 1, 0));
		variables.setVisible(false);
		
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
		this.add(buttonPanel, new GridBagConstraints(0, 7, 2, 1, 0, 0, GridBagConstraints.EAST, GridBagConstraints.NONE, new Insets(10, 0, 0, 60), 0, 0));
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
	public void addVariablesPanel() {
		variables.setVisible(true);
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
	
	public void setFaseTitleLabel(String title) {
		this.faseTitleLabel.setText("<html><h1>"+title+"</h1></html>");
	}
	public void setGraphic(GraphicPanel graphic) {
		this.graphic = graphic;
	}

	public void setVolume(double number){
		volumeText.setText(String.valueOf(number) + " m^3/mol");
	}

	public void setPression(double number){
		pressionText.setText(String.valueOf(number) + " Pa");
	}

	public void setTemperature(double number){
		temperatureText.setText(String.valueOf(number) + " K");
	}

}
