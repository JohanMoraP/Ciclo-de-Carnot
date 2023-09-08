package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class OptionMenuPanel extends JPanel {

	public OptionMenuPanel() {
		initComponents();
	}

	public void initComponents() {
		this.setBackground(new Color(75, 162, 181));
		this.setLayout(new GridLayout(9, 1));
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.fill = GridBagConstraints.BOTH;
		int leftSpacing = 20;
		EmptyBorder labelBorder = new EmptyBorder(0, leftSpacing, 0, 0);
		constraints.gridheight = 3;
		constraints.anchor = GridBagConstraints.FIRST_LINE_START;
		JLabel label = new JLabel("Ciclo de Carnot");
		label.setFont(new Font("Arial", Font.ITALIC, 25));
		label.setBorder(labelBorder);
		this.add(label, constraints);
		JButton button1 = new CustomMenuButton("Gráfico", new ImageIcon("images/icono.png"));
		this.add(button1, constraints);
		JButton button2 = new CustomMenuButton("Explicación", new ImageIcon("images/icono2.png"));
		this.add(button2, constraints);

	}
}
