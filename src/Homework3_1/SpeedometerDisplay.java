package Homework3_1;

import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class SpeedometerDisplay extends DisplayDecorator {
	LabelPanel labelPanel;
	Display display;
	
	SpeedometerDisplay(Display display, int width, int height) {
		super(display, width, height);
		this.display=display;
		// TODO Auto-generated constructor stub
	}

	@Override
	public JPanel create() {
		// TODO Auto-generated method stub
		JPanel panel = new JPanel();
		// 패널의 레이아웃은 BoxLayout.Y_AXIS 형태로 지정. 패널에 위젯 또는 다른 패널을 추가하면, 세로축 방향으로 추가(add)한
		// 순서대로 나열됨
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		// 패널의 전체 크기 지정
		panel.setPreferredSize(new Dimension(getWidth(), getHeight()));
		// 기본 컴포넌트 생성. HudDisplay는 가장 기본적인 디스플레이 구성요소가 됨
		panel.add(display.create());
		//System.out.println("disply.height = " + display.getHeight());
		labelPanel = new LabelPanel();
		// 패널에 레이블을 붙임.
		panel.add(labelPanel.createPanel(getWidth(), getHeight()));
		// 디스플레이마다 각각의 내용을 화면에 보임.
		return panel;
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		//여기에 붙이는게 나음
		display.show();
		labelPanel.updateText("Speed: 50");
	}

}
