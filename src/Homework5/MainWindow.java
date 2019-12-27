package Homework5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainWindow extends FrameWindow implements ActionListener {
	private static final int X = 250;
	private static final int Y = 100;
	private static final int WIDTH = 600;
	private static final int HEIGHT = 600;
	private static final int NUM_BUTTONS = 5;
	private static final int BUTTON_HEIGHT = 100;
	private AnimalCommandButton SheepButton;
	private AnimalCommandButton CatButton;
	private AnimalCommandButton HedgehogButton;
	private AnimalCommandButton DogButton;
	private AnimalCommandButton UndoButton;
	private String[] buttonTitles = { "sheep", "cat", "hedgehog", "dog", "Undo" };
	private ImageIcon[] imageIcons;
	private JLabel label;
	private ImageIcon sheepIcon;
	private ImageIcon dogIcon;
	private ImageIcon hedgehogIcon;
	private ImageIcon catIcon;
	
	public MainWindow(String title) {
		super();
		imageIcons = new ImageIcon[buttonTitles.length];
		for (int i = 0; i < buttonTitles.length; i++) {
			imageIcons[i] = new ImageIcon(buttonTitles[i] + ".jpg");
		}
		createWindow(title, X, Y, WIDTH, HEIGHT);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	public JPanel createPanel(int width, int height) {
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));
		buttonPanel.setPreferredSize(new Dimension(width, BUTTON_HEIGHT));
	
		label = new JLabel();
		label.setPreferredSize(new Dimension(width, HEIGHT - BUTTON_HEIGHT));
		
		SheepButton = new SheepCommandButton(buttonTitles[0], imageIcons[0], label);
		SheepButton.setProperties(this, width / NUM_BUTTONS, BUTTON_HEIGHT);
		buttonPanel.add(SheepButton);
		
		//여기 캣 커맨드 말고 쉽 커맨드하나로 돌려치기 가능
		CatButton = new CatCommandButton(buttonTitles[1], imageIcons[1], label);
		CatButton.setProperties(this, width / NUM_BUTTONS, BUTTON_HEIGHT);
		buttonPanel.add(CatButton);
		
		HedgehogButton = new HedgehogCommandButton(buttonTitles[2], imageIcons[2], label);
		HedgehogButton.setProperties(this, width / NUM_BUTTONS, BUTTON_HEIGHT);
		buttonPanel.add(HedgehogButton);
				
		DogButton = new DogCommandButton(buttonTitles[3], imageIcons[3], label);
		DogButton.setProperties(this, width / NUM_BUTTONS, BUTTON_HEIGHT);
		buttonPanel.add(DogButton);
		
		UndoButton = new UndoCommandButton(buttonTitles[4], UndoImage.getUndoImage() , label);
		UndoButton.setProperties(this, width / NUM_BUTTONS, BUTTON_HEIGHT);
		buttonPanel.add(UndoButton);
		
		panel.add(buttonPanel);
		
		panel.add(label, BorderLayout.SOUTH);
		
		return panel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() instanceof Command) {
            Command command = (Command) e.getSource();
            command.execute();
        }
	}
}
