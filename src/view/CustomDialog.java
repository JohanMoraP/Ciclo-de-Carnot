package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CustomDialog extends JDialog {
	private JLabel msgLabel;
	private CustomButton acceptButton;
	private String message;
    public CustomDialog(JFrame parent, String message) {
    	this.message = message;
        this.setUndecorated(true);
        initComponents();
    }
    private void initComponents() {
    	configButton();
    	this.getContentPane().setLayout(new GridBagLayout());
        this.getContentPane().add(msgLabel, getConfig(0));
        this.getContentPane().add(acceptButton, getConfig(1));
        this.setModal(true);
        this.pack();
        this.setResizable(false);
        this.setBackground(new Color(0,0,0,0));
        this.setLocationRelativeTo(null); 
        this.setVisible(true);
    }
    private void configButton() {
    	msgLabel = new JLabel("<html><h2 style=\"color:rgb(50,50,50); margin:20px\">"+message+"</h2></html>");
        acceptButton = new CustomButton("Aceptar", new Color(100,100,255), new Color(63,208,254), Color.WHITE, "accept", null);
        
        acceptButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        acceptButton.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
			}
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
			}
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					dispose();
				}
			}
		});
    }
    public void paint(Graphics graphics) {
    	Graphics2D graphics2d = (Graphics2D) graphics;
    	super.paint(graphics2d);
    	graphics2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
    	graphics2d.drawImage(new ImageIcon("images/border.png").getImage(), 0, 0, this.getWidth(), this.getHeight(), null);
    	getContentPane().paintComponents(graphics2d);
    	graphics2d.dispose();
    }
    public GridBagConstraints getConfig(int gridy) {
		GridBagConstraints config = new GridBagConstraints();
		config.gridy = gridy;
		config.insets = new Insets(20,20,20,20);
		return config;
	}
}
