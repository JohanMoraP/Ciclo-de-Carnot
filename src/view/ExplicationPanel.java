package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class ExplicationPanel extends JPanel{

    private CustomButton stagesExplication;
	private CustomButton cicleExplication;
    private CustomButton concepts;
    private Explication explication;

    
    public ExplicationPanel(ActionListener action){
        this.setLayout(new BorderLayout());
        initComponents(action);
    }

    private void initComponents(ActionListener action){
        
        explication = new Explication();
        this.add(explication, BorderLayout.CENTER);
        
        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        concepts = new  CustomButton("Conceptos", new Color(45, 132, 151), Color.GRAY, Color.WHITE, null, action);
        concepts.setActionCommand(Constants.CONCEPTS);
        buttonsPanel.add(concepts, gbc);
        
        gbc.gridx = 1;
        cicleExplication = new CustomButton("Ciclo de Carnot", new Color(45, 132, 151), Color.GRAY, Color.WHITE, null, action);
        cicleExplication.setActionCommand(Constants.BEFORE_EXPLICATION);
        buttonsPanel.add(cicleExplication);
        
        gbc.gridx = 2;
        stagesExplication = new CustomButton("Etapas", new Color(45, 132, 151), Color.GRAY, Color.WHITE, null, action);
        stagesExplication.setActionCommand(Constants.NEXT_EXPLICATION);
        buttonsPanel.add(stagesExplication, gbc);
        
        this.add(buttonsPanel, BorderLayout.SOUTH);
    }

    public void showInfo(){
        explication.showInfo();
    }

    public void showPhases(){
        explication.showPhases();
    }

    public void showConcepts(){
        explication.showConcepts();
    }
}
