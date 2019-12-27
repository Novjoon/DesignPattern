package PracticeDoubleSubject;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFieldWindow extends FrameWindow implements Observer {
    private JTextField textField;
    
	private Subject PrimeObservableThread;

	public void Subscribe(Subject PrimeObservableThread) {
		this.PrimeObservableThread=PrimeObservableThread;
		PrimeObservableThread.registerObserver(this);
	}
	
    public TextFieldWindow(String title, int x, int y, int width, int height) {
        super(title, x, y, width, height);
    }

    public void updateText(String msg) {
        textField.setText(msg);
        textField.validate();
    }

    public JPanel createPanel(int width, int height) {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        textField = new JTextField();
        panel.add(textField);
        panel.setPreferredSize(new Dimension(width, height));
        return panel;
    }

	@Override
	public void Cancel(Subject PrimeObservableThread) {
		// TODO Auto-generated method stub
		this.PrimeObservableThread=PrimeObservableThread;
		PrimeObservableThread.removeObserver(this);
		
	}
}
