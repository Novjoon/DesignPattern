package Homework5;

import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class AnimalCommandButton extends JButton implements Command {
	JLabel label;
	ImageIcon image;
	UndoImage undoImage;
	String text;

	public AnimalCommandButton(String text, ImageIcon image, JLabel label) {
		//JButton 텍스트 줘야함
		super(text);
		// TODO Auto-generated constructor stub//
		this.label = label;
		this.image = image;
		this.label = label;
		this.text = text;
	}

	//Jbutton의 함수
	public void setProperties(ActionListener listener, int width, int height) {
	    addActionListener(listener);
	    Dimension buttonDimension = new Dimension(width, height / 3);
	    setMaximumSize(buttonDimension);
	    setMinimumSize(buttonDimension);
	    setPreferredSize(buttonDimension);
	}

	//command의 메소드
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		if (label == null) {
			System.out.println("no label");
		} else {
			if (text.equals("Undo")) {
				System.out.println("UndoButton pressed");
				label.setIcon(UndoImage.getUndoImage());
			} else {
				UndoImage.setUndoImage(image);
				label.setIcon(image);
			}
		}
	}

}
