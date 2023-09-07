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

public class Panel2 extends JPanel{
    
    private JLabel imageLabel;
    private JList<String> list;

    public Panel2(){
        initComponets();
    }

    private void initComponets(){
        this.setBackground(new Color(255, 255, 255));
        this.setLayout(new GridBagLayout());

        ImageIcon image = new ImageIcon("image/imagen.png");
        imageLabel = new JLabel(image);
        imageLabel.setBorder(new EmptyBorder(0, 0, 0, 100));
        GridBagConstraints imageConstraints = new GridBagConstraints();
        imageConstraints.gridx = 0;
        imageConstraints.gridy = 0;
        imageConstraints.weighty = 1.0; 
        imageConstraints.anchor = GridBagConstraints.CENTER; 
        add(imageLabel, imageConstraints);

        list = new JList<>();
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
        add(list, listConstraints);

        JPanel buttonPanel = new JPanel();
        JButton button1 = new JButton("Anterior etapa");
        JButton button3 = new JButton("Siguiente etapa");
        buttonPanel.add(button1);
        buttonPanel.add(button3);

        GridBagConstraints buttonPanelConstraints = new GridBagConstraints();
        buttonPanelConstraints.gridx = 0;
        buttonPanelConstraints.gridy = 3; 
        buttonPanelConstraints.insets = new Insets(10, 0, 0, 60); 
        add(buttonPanel, buttonPanelConstraints);
    }
}
