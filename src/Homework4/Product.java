package Homework4;

import javax.swing.JComponent;
import javax.swing.JPanel;

public abstract class Product extends FrameWindow implements Observer{
	//private JComponent jcomponent;
	
	public Product(String title, int x, int y, int width, int height) {
		super(title, x, y, width, height);
		// TODO Auto-generated constructor stub
	}
	
	public abstract void update(int n);
	public abstract void updateText(String msg);
	public abstract JPanel createPanel(int width, int height);
}
