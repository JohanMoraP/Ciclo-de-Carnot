package view;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
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
	public PrincipalPanel(ActionListener action){
		this.setBackground(new Color(255, 255, 255));
		this.setLayout(new GridBagLayout());
		initComponents(action);
		editComponents(action);
		addComponents(action);
	}
	private void initComponents(ActionListener action){
		graphic = new GraphicPanel();
		varArea1 = new JTextArea("0"); 
		varArea2 = new JTextArea("0");
		varArea3 = new JTextArea("0");
		varArea4 = new JTextArea("0");
		nextButton = new CustomButton("Anterior etapa", new Color(75, 162, 181), Color.GRAY, Color.WHITE, null);
		lastButton = new CustomButton("Siguiente etapa", new Color(75, 162, 181), Color.GRAY, Color.WHITE, null);
		graphButton = new CustomButton("Graficar", new Color(75, 162, 181), new Color(240,240,240), Color.WHITE, null);
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
	}
	public void addComponents(ActionListener action) {
		JLabel variable1 = new JLabel("Presión inicial: ");
		JLabel variable2 = new JLabel("Volumen inicial: ");
		JLabel variable3 = new JLabel("Volumen máximo: ");
		JLabel variable4 = new JLabel("Temperatura final: ");
		JPanel buttonPanel = new JPanel();
		buttonPanel.add(nextButton);
		buttonPanel.add(lastButton);
		this.add(graphic, new GridBagConstraints(0, 2, 1, 3, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, getInsets(), 0, 0));
		this.add(variable1, new GridBagConstraints(1, 0, 1, 1,0,0,GridBagConstraints.CENTER,GridBagConstraints.BOTH,new Insets(0,0,0,0), 1, 0));
		this.add(variable2, new GridBagConstraints(1, 1, 1, 1,0,0,GridBagConstraints.CENTER,GridBagConstraints.BOTH,new Insets(0,0,0,0), 1, 0));
		this.add(variable3, new GridBagConstraints(1, 2, 1, 1,0,0,GridBagConstraints.CENTER,GridBagConstraints.BOTH,new Insets(0,0,0,0), 1, 0));
		this.add(variable4, new GridBagConstraints(1, 3, 1, 1,0,0,GridBagConstraints.CENTER,GridBagConstraints.BOTH,new Insets(0,0,0,0), 1, 0));
		this.add(graphButton, new GridBagConstraints(1, 4, 2, 1,0,0,GridBagConstraints.NORTH,GridBagConstraints.NONE,new Insets(0,0,0,0), 1, 0));
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportView(varArea1);
		this.add(scrollPane, new GridBagConstraints(2, 0, 1, 1,0,0,GridBagConstraints.CENTER,GridBagConstraints.BOTH,new Insets(0,0,0,0), 1, 0));
		JScrollPane scrollPane2 = new JScrollPane();
		scrollPane2.setViewportView(varArea2);
		this.add(scrollPane2, new GridBagConstraints(2, 1, 1, 1,0,0,GridBagConstraints.CENTER,GridBagConstraints.BOTH,new Insets(0,0,0,0), 1, 0));
		JScrollPane scrollPane3 = new JScrollPane();
		scrollPane3.setViewportView(varArea3);
		this.add(scrollPane3, new GridBagConstraints(2, 2, 1, 1,0,0,GridBagConstraints.CENTER,GridBagConstraints.BOTH,new Insets(0,0,0,0), 1, 0));
		JScrollPane scrollPane4 = new JScrollPane();
		scrollPane4.setViewportView(varArea4);
		this.add(scrollPane4, new GridBagConstraints(2, 3, 1, 1,0,0,GridBagConstraints.CENTER,GridBagConstraints.BOTH,new Insets(0,0,0,0), 1, 0));
		this.add(buttonPanel, new GridBagConstraints(0, 5, 1, 1, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(10, 0, 0, 60), 0, 0));
	}
	public void paintGraphic(ArrayList<double []>coordenates) {
		graphic.paintGraphic(coordenates);
	}
}
