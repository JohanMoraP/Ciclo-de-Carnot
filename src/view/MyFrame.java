package view;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import static java.awt.Frame.base;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Toolkit;

public class MyFrame extends JFrame {
	Container container;

	public MyFrame() {

		super("Ciclo de Carnot");
		Image icon = Toolkit.getDefaultToolkit().getImage("images/imagem.png");
		setIconImage(icon);
		this.setMinimumSize(new Dimension(400, 400));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		initComponents();
		this.revalidate();
		this.pack();
		this.setVisible(true);
		this.setExtendedState(MAXIMIZED_BOTH);
	}

	public void initComponents() {
		container = this.getContentPane();
		container.setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.fill = GridBagConstraints.BOTH;
		constraints.gridheight = 3;
		constraints.weightx = 0.15;
		add(new OptionMenuPanel(), constraints);
		constraints.weighty = 1.0;
		constraints.weightx = 0.85;
		container.add(new PrincipalPanel(), constraints);
	}
}
