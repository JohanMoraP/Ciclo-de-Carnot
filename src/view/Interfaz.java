package view;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;

public class Interfaz extends JFrame {
    public Interfaz() {
        Container container = this.getContentPane();
        container.setLayout(new GridBagLayout());

        JPanel panel = new JPanel();
        panel.setBackground(new Color(75, 162, 181));
        panel.setLayout(new GridLayout(9, 1));
        JPanel panel2 = new JPanel();
        panel2.setBackground(new Color(255, 255, 255));
        panel2.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.BOTH;
        int leftSpacing = 20;
        EmptyBorder labelBorder = new EmptyBorder(0, leftSpacing, 0, 0);
        constraints.gridheight = 3;

        ImageIcon originalIcon = new ImageIcon("images/graph.png");
        Image image = originalIcon.getImage();
        Image scaledImage = image.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(scaledImage);

        ImageIcon originalIcon2 = new ImageIcon("images/info.png");
        Image image2 = originalIcon2.getImage();
        Image scaledImage2 = image2.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        ImageIcon icon2 = new ImageIcon(scaledImage2);

        Font labelFont = new Font("Arial", Font.ITALIC, 18);

        JLabel label = new JLabel("Ciclo de Carnot");
        label.setFont(new Font("Arial", Font.ITALIC, 25));
        label.setBorder(labelBorder);
        panel.add(label, constraints);

        JButton label2 = new JButton("Gráfico");
        label2.setBackground(null);
        label2.setFont(labelFont);
        label2.setIcon(icon);
        label2.setBorder(labelBorder);
        panel.add(label2, constraints);

        JButton label3 = new JButton("Explicación");
        label3.setBackground(null);
        label3.setFont(labelFont);
        label3.setIcon(icon2);
        label3.setBorder(labelBorder);
        panel.add(label3, constraints);

        ImageIcon icon3 = new ImageIcon("images/imagen.png");
        JLabel imageLabel = new JLabel(icon3);
        imageLabel.setBorder(new EmptyBorder(0, 0, 0, 100));
        GridBagConstraints imageConstraints = new GridBagConstraints();
        imageConstraints.gridx = 0;
        imageConstraints.gridy = 0;
        imageConstraints.weighty = 1.0;
        imageConstraints.anchor = GridBagConstraints.CENTER;
        panel2.add(imageLabel, imageConstraints);

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
        panel2.add(list, listConstraints);

        JPanel buttonPanel = new JPanel();
        JButton button1 = new JButton("Anterior etapa");
        JButton button2 = new JButton("Siguiente etapa");
        buttonPanel.add(button1);
        buttonPanel.add(button2);

        GridBagConstraints buttonPanelConstraints = new GridBagConstraints();
        buttonPanelConstraints.gridx = 0;
        buttonPanelConstraints.gridy = 3;
        buttonPanelConstraints.insets = new Insets(10, 0, 0, 60);
        panel2.add(buttonPanel, buttonPanelConstraints);
        constraints.weightx = 0.15;
        constraints.weighty = 1.0;

        container.add(panel, constraints);

        constraints.weightx = 0.85;
        container.add(panel2, constraints);

        this.setSize(1000, 700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new Interfaz();
    }
}
