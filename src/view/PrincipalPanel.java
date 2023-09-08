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
		imageLabel.setBorder(new EmptyBorder(0, 0, 0, 100));
		GridBagConstraints imageConstraints = new GridBagConstraints();
		imageConstraints.gridx = 0;
		imageConstraints.gridy = 0;
		imageConstraints.weighty = 1.0;
		imageConstraints.anchor = GridBagConstraints.CENTER;
		this.add(imageLabel, imageConstraints);

		JList<String> list = new JList<>();
		DefaultListModel<String> listModel = new DefaultListModel<>();
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
		this.add(list, listConstraints);
		JPanel buttonPanel = new JPanel();
		CustomButton button3 = new CustomButton("Anterior etapa", new Color(75, 162, 181), Color.GRAY, Color.WHITE, null);
		CustomButton button4 = new CustomButton("Siguiente etapa", new Color(75, 162, 181), Color.GRAY, Color.WHITE, null);
		buttonPanel.add(button3);
		buttonPanel.add(button4);
		GridBagConstraints buttonPanelConstraints = new GridBagConstraints();
		buttonPanelConstraints.gridx = 0;
		buttonPanelConstraints.gridy = 3;
		buttonPanelConstraints.insets = new Insets(10, 0, 0, 60);
		this.add(buttonPanel, buttonPanelConstraints);

	}
}
