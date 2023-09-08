package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class PrincipalPanel extends JPanel{
	private JLabel imageLabel;
	private JList<String> list;
	public PrincipalPanel(){
		initComponents();
	}
	private void initComponents(){
		this.setBackground(new Color(255, 255, 255));
		this.setLayout(new GridBagLayout());
		ImageIcon icon3 = new ImageIcon("data/imagen.png");
		JButton imageLabel = new JButton(icon3);
		//imageLabel.setBorder(new EmptyBorder(0, 0, 0, 100));
		GridBagConstraints imageConstraints = new GridBagConstraints();
		imageConstraints.gridx = 0;
		imageConstraints.gridy = 1;
		//imageConstraints.weighty = 1;
		imageConstraints.gridheight = 3;
		imageConstraints.fill = GridBagConstraints.BOTH;
		imageConstraints.anchor = GridBagConstraints.CENTER;
		this.add(imageLabel, imageConstraints);

		JList<String> list = new JList<>();
		DefaultListModel<String> listModel = new DefaultListModel<>();
		JLabel variable1 = new JLabel("Variable 1: ");
		JLabel variable2 = new JLabel("Variable 2: ");
		JLabel variable3 = new JLabel("Variable 3: ");
		variable3.setBackground(Color.BLACK);
		JTextArea varArea1 = new JTextArea("0"); 
		JTextArea varArea2 = new JTextArea("0");
		JTextArea varArea3 = new JTextArea("0");
		varArea1.setColumns(10);
		varArea1.setLineWrap(true); 
		varArea1.setWrapStyleWord(true);
		varArea2.setColumns(10);
		varArea2.setLineWrap(true); 
		varArea2.setWrapStyleWord(true);
		varArea3.setColumns(10);
		varArea3.setLineWrap(true); 
		varArea3.setWrapStyleWord(true);
		
		this.add(variable1, new GridBagConstraints(1, 0, 1, 1,0,0,GridBagConstraints.CENTER,GridBagConstraints.BOTH,new Insets(0,0,0,0), 1, 0));
		this.add(variable2, new GridBagConstraints(1, 1, 1, 1,0,0,GridBagConstraints.CENTER,GridBagConstraints.BOTH,new Insets(0,0,0,0), 1, 0));
		this.add(variable3, new GridBagConstraints(1, 2, 1, 1,0,0,GridBagConstraints.CENTER,GridBagConstraints.BOTH,new Insets(0,0,0,0), 1, 0));
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportView(varArea1);
		this.add(scrollPane, new GridBagConstraints(2, 0, 1, 1,0,0,GridBagConstraints.CENTER,GridBagConstraints.BOTH,new Insets(0,0,0,0), 1, 0));
		JScrollPane scrollPane2 = new JScrollPane();
		scrollPane2.setViewportView(varArea2);
		this.add(scrollPane2, new GridBagConstraints(2, 1, 1, 1,0,0,GridBagConstraints.CENTER,GridBagConstraints.BOTH,new Insets(0,0,0,0), 1, 0));
		JScrollPane scrollPane3 = new JScrollPane();
		scrollPane3.setViewportView(varArea3);
		this.add(scrollPane3, new GridBagConstraints(2, 2, 1, 1,0,0,GridBagConstraints.CENTER,GridBagConstraints.BOTH,new Insets(0,0,0,0), 1, 0));
		list.setFont(new Font("Arial", Font.ROMAN_BASELINE, 15));
		listModel.addElement("Variable:__________");
		listModel.addElement("Variable:__________");
		listModel.addElement("Variable:__________");
		list.setModel(listModel);
		list.setBackground(new Color(195, 195, 195));
		GridBagConstraints listConstraints = new GridBagConstraints();
		listConstraints.gridx = 1;
		listConstraints.gridy = 0;
		listConstraints.weighty = 1.0;
		listConstraints.anchor = GridBagConstraints.WEST;
		//this.add(list, listConstraints);
		JPanel buttonPanel = new JPanel();
		CustomButton button3 = new CustomButton("Anterior etapa", new Color(75, 162, 181), Color.GRAY, Color.WHITE, null);
		CustomButton button4 = new CustomButton("Siguiente etapa", new Color(75, 162, 181), Color.GRAY, Color.WHITE, null);
		buttonPanel.add(button3);
		buttonPanel.add(button4);
		GridBagConstraints buttonPanelConstraints = new GridBagConstraints();
		buttonPanelConstraints.gridx = 0;
		buttonPanelConstraints.gridy = 4;
		buttonPanelConstraints.insets = new Insets(10, 0, 0, 60);
		this.add(buttonPanel, buttonPanelConstraints);

	}
}
