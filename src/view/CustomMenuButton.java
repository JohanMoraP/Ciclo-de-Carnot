package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;

public class CustomMenuButton extends JButton implements MouseListener, FocusListener{
	private ImageIcon originalIcon;
	public CustomMenuButton(String text, ImageIcon originalIcon) {
		super(text);
		this.originalIcon = originalIcon;
		initComponents();
	}
	public void initComponents() {
		int leftSpacing = 20;
        EmptyBorder labelBorder = new EmptyBorder(0, leftSpacing, 0, 0);
		Image image = originalIcon.getImage();
        Image scaledImage = image.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(scaledImage);
		this.setFont(new Font("Arial", Font.ITALIC, 18));
        this.setIcon(icon);
        this.setBorder(labelBorder);
        this.setBackground(new Color(75, 162, 181));
        this.setForeground(Color.WHITE);
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
		this.setBackground(new Color(99,207,231));
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		this.setBackground(new Color(75, 162, 181));
		
	}
	@Override
	public void focusGained(FocusEvent e) {
		// TODO Auto-generated method stub
		this.setBackground(new Color(99,207,231));
		
	}
	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub
		this.setBackground(new Color(75, 162, 181));
	}
}
