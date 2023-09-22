package view;

import java.awt.CardLayout;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class TotalPanel extends JPanel{
    private CardLayout cardLayout;
    private PrincipalPanel principalPanel;
    private ExplicationPanel explicationPanel;

    public TotalPanel(ActionListener listener){
        cardLayout = new CardLayout();
        this.setLayout(cardLayout);
        initComponents(listener);
    }

    private void initComponents(ActionListener listener){
        principalPanel = new PrincipalPanel(listener);
        this.add(principalPanel, "principalPanel");
        explicationPanel =  new ExplicationPanel(listener);
        this.add(explicationPanel, "explicationPanel");
    }

    public void showPrincipal(){
        cardLayout.show(this, "principalPanel");
    }

    public void showExplication(){
        cardLayout.show(this, "explicationPanel");
    }

    public PrincipalPanel getPrincipalPanel() {
        return principalPanel;
    }

    public ExplicationPanel getExplicationPanel() {
        return explicationPanel;
    }

    public void setVolume(double number){
        principalPanel.setVolume(number);
    }

    public void setPression(double number){
        principalPanel.setPression(number);
    }

    public void setTemperature(double number){
        principalPanel.setTemperature(number);
    }
    
}
