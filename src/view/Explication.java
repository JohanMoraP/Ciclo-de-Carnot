package view;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;

public class Explication extends JPanel{
    
    private CicleExplication panelInfo;
    private StagesExplication panelPhases;
    private ConceptsPanel conceptsPanel;
    private CardLayout cardLayout;

    public Explication(){
        this.setBackground(Color.WHITE); 
        cardLayout = new CardLayout();
        this.setLayout(cardLayout);
        initComponents();
    }

    private void initComponents(){
        conceptsPanel = new ConceptsPanel();
        add(conceptsPanel, "conceptsPanel");
        panelInfo = new CicleExplication();
        add(panelInfo, "panelInfo");
        panelPhases = new StagesExplication();
        add(panelPhases, "panelPhases");
    }

    public void showInfo(){
        cardLayout.show(this, "panelInfo");
    }

    public void showPhases(){
        cardLayout.show(this, "panelPhases");
    }

    public void showConcepts(){
        cardLayout.show(this, "conceptsPanel");
    }
}
