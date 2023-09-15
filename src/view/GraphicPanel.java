package view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JPanel;
import org.math.plot.Plot2DPanel;

public class GraphicPanel extends JPanel implements MouseListener{

	private Plot2DPanel graphic;
	private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	
	public GraphicPanel() {
		this.setBackground(Color.WHITE); 
		this.setLayout(null);
		this.setPreferredSize(new Dimension((int)(screenSize.getWidth() * 0.31), (int)(screenSize.getHeight() * 0.45)));
		this.addMouseListener(this);
		this.initComponents();
	}

	public void initComponents() {
		graphic=new Plot2DPanel();
		graphic.setBounds(0, 0, (int) (screenSize.getWidth() * 0.3), (int) (screenSize.getHeight() * 0.4));
		this.add(graphic);
	}
	
	public void paintGraphic(ArrayList<double []>coordenates) {
		graphic.addLegend("SOUTH"); 
		graphic.addLinePlot("Fase 1", Color.blue, coordenates.get(0), coordenates.get(1));
		graphic.addLinePlot("Fase 2", Color.red, coordenates.get(2), coordenates.get(3));
		graphic.addLinePlot("Fase 3", Color.black, coordenates.get(4), coordenates.get(5));
		graphic.addLinePlot("Fase 4", Color.green,coordenates.get(6), coordenates.get(7));
		graphic.addLinePlot(null, null, new double[]{0}, new double[]{0});
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
		this.setCursor(Cursor.getPredefinedCursor(Cursor.E_RESIZE_CURSOR));
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		this.setCursor(Cursor.getDefaultCursor());
	}
}
