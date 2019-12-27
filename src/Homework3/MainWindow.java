package Homework3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class MainWindow extends FrameWindow {
	private static final String MAIN_TITLE = "Main Window";
	private static final String TEXTFIELD_WINDOW_TITLE = "TextField Window";
	private static final String LABEL_WINDOW_TITLE = "Label Window";
	private static final String TEXTFIELD_OBSERVER_BUTTON_TITLE = "Update TextField Window Observer";
	private static final String LABEL_OBSERVER_BUTTON_TITLE = "Update Label Window Observer";
	private static final String STOP_THREAD_BUTTON_TITLE = "Stop Generating Prime Number";
	private static final int X = 250;
	private static final int Y = 100;
	private static final int WIDTH = 600;
	private static final int HEIGHT = 100;
	private static final int GAP = 50;

	private ArrayList<String> displayList;
	private JFrame frame;

	public JFrame createWindow(String title, int x, int y, int width, int height) {
		JFrame frame;
		frame = new JFrame(title);
		frame.setBounds(x, y, width, height);
		JPanel panel = createPanel(width, height);
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);
		return frame;
	}

	public void closeWindow() {
		frame.setVisible(false);
		frame.dispose();
	}

	public MainWindow(String title, ArrayList<String> list) {
		displayList = list;
		frame = createWindow(title, X, Y, WIDTH, HEIGHT * displayList.size() + 1);
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				closeWindow();
				System.exit(0);
			}
		});
	}

	public JPanel createPanel(int width, int height) {
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.setPreferredSize(new Dimension(width, height));
		// 기본 컴포넌트 생성
		Display display = new HudDisplay(WIDTH, HEIGHT);
		// 리스트에 있는 내용을 바탕으로 장식 추가하기
		/*
		for (String name : displayList) {
			if (name.equals("speed")) {
				display = new SpeedometerDisplay(display, WIDTH, HEIGHT);
			} else if (name.equals("time")) {
				display = new TimeDisplay(display, WIDTH, HEIGHT);
			} else if (name.equals("weather")) {
				display = new WeatherDisplay(display, WIDTH, HEIGHT);
			}
		}
		*/
		panel.add(display.create());
		System.out.println("disply.height = " + display.getHeight());
		display.show();
		return panel;
	}

	public static void main(String[] args) {
		ArrayList<String> list;
		LoadHudDisplays loadDisplay = new LoadHudDisplays();
		list = loadDisplay.load("C:\\AdvancedOOP\\src\\Homework3\\displays.txt");

		System.out.println("메인에서 부른다");
		for (String s : list) {
			System.out.println(s);
		}
		

		MainWindow mainWindow = new MainWindow(MainWindow.MAIN_TITLE, list);
	}
}
