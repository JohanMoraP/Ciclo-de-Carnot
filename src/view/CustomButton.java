package view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class CustomButton extends JButton implements MouseListener, FocusListener{
	private Color actionColor;
	private Color background;
	private Color fontColor;
	private ImageIcon originalIcon;
	private ImageIcon actionIcon;
	private Dimension screenSize;
	
	public CustomButton(String text, Color background, Color actionColor, Color fontColor, String urlIcon, ActionListener action) {
		super(text);
		this.fontColor = fontColor;
		this.background = background;
		this.actionColor = actionColor;
		this.screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		this.originalIcon = new ImageIcon(new ImageIcon("images/" + urlIcon + ".png").getImage().getScaledInstance((int)(this.screenSize.getHeight() * 0.025), (int)(this.screenSize.getHeight() * 0.025), Image.SCALE_SMOOTH));
		this.actionIcon = new ImageIcon(new ImageIcon("images/" + urlIcon + "_Dark.png").getImage().getScaledInstance((int)(this.screenSize.getHeight() * 0.025), (int)(this.screenSize.getHeight() * 0.025), Image.SCALE_SMOOTH));
		this.addActionListener(action);
		addComponents();
	}
	public void addComponents() {
		this.setIcon(originalIcon);
		this.setForeground(fontColor);
		this.setBackground(background);
		this.setFont(new Font(Font.SERIF, Font.BOLD, 16));
		this.addMouseListener(this);
		this.addFocusListener(this);
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		this.setBackground(actionColor);
		this.setForeground(Color.DARK_GRAY);
		this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		this.setIcon(actionIcon);
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		this.setBackground(background);
		this.setForeground(fontColor);
		this.setCursor(Cursor.getDefaultCursor());
		this.setIcon(originalIcon);
	}
	@Override
	public void focusGained(FocusEvent e) {
		// TODO Auto-generated method stub
		this.setBackground(actionColor);
		this.setForeground(Color.DARK_GRAY);
		this.setIcon(actionIcon);
	}
	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub
		this.setBackground(background);
		this.setForeground(fontColor);
		this.setIcon(originalIcon);
	}
}
