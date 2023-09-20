package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class CustomButton extends JButton implements MouseListener {
	private Color actionColor;
	private Color background;
	private Color fontColor;
	private ImageIcon originalIcon;

	public CustomButton(String text, Color background, Color actionColor, Color fontColor, ImageIcon icon) {
		super(text);
		this.fontColor = fontColor;
		this.background = background;
		this.setForeground(fontColor);
		this.setBackground(background);
		this.originalIcon = icon;
		this.addMouseListener(this);
		this.setFont(new Font(Font.SERIF, Font.BOLD, 16));
		initComponents();
	}
	p	

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
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		this.setBackground(background);
		this.setForeground(fontColor);
	}
