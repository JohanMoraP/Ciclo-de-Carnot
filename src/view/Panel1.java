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

public class Panel1 extends JPanel{

    private JLabel label;
    private GridBagConstraints constraints;
    JButton button;
    JButton button2;
    
    public Panel1(){
        initComponets();
    }

    private void initComponets(){
        this.setBackground(new Color(75, 162, 181));
        this.setLayout(new GridLayout(9, 1, 0, 20));
        
        constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.BOTH;
        constraints.gridheight = 3;
        int leftSpacing = 20;
        EmptyBorder labelBorder = new EmptyBorder(0, leftSpacing, 0, 0);

        label = new JLabel("Ciclo de Carnot");
        label.setFont(new Font("Arial", Font.ITALIC, 25));
        label.setBorder(labelBorder);
        add(label, constraints);

        ImageIcon originalIcon = new ImageIcon("image/icono.png");
        Image image = originalIcon.getImage();
        Image scaledImage = image.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(scaledImage);

        ImageIcon originalIcon2 = new ImageIcon("image/icono2.png");
        Image image2 = originalIcon2.getImage();
        Image scaledImage2 = image2.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        ImageIcon icon2 = new ImageIcon(scaledImage2);

        Font ButtonFont = new Font("Arial", Font.ITALIC, 18);
        button = new JButton("Gráfico", icon);
        button.setFont(ButtonFont);
        button.setBorder(labelBorder);
        button.setBackground(new Color(75, 162, 181));
        button.setHorizontalAlignment(JButton.LEFT);
        add(button, constraints);

        button2 = new JButton("Explicación", icon2);
        button2.setFont(ButtonFont);
        button2.setBorder(labelBorder);
        button2.setBackground(new Color(75, 162, 181));
        button2.setHorizontalAlignment(JButton.LEFT);
        add(button2, constraints);
    }
}

