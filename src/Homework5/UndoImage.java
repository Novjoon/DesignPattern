package Homework5;

import javax.swing.ImageIcon;

public class UndoImage {
	private static ImageIcon[] undoImage =new ImageIcon[2];

	public static ImageIcon getUndoImage() {
		return UndoImage.undoImage[0];
	}

	public static void setUndoImage(ImageIcon undoImage) {
		UndoImage.undoImage[0] = UndoImage.undoImage[1];
		UndoImage.undoImage[1] = undoImage;
	}
	
}
