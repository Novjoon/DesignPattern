package Homework5;

import java.awt.Dimension;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;

//���⼭�� Ŀ�ǵ� ��ư�� �ʿ����

public class Command_Button extends JButton{ 
	public Command_Button(String text) {
    super(text);
}
	
public void setProperties(ActionListener listener, int width, int height) {
    addActionListener(listener);
    Dimension buttonDimension = new Dimension(width, height / 3);
    setMaximumSize(buttonDimension);
    setMinimumSize(buttonDimension);
    setPreferredSize(buttonDimension);
}


}
