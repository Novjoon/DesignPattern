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
		// �г��� ���̾ƿ��� BoxLayout.Y_AXIS ���·� ����. �гο� ���� �Ǵ� �ٸ� �г��� �߰��ϸ�, ������ �������� �߰�(add)��
		// ������� ������
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		// �г��� ��ü ũ�� ����
		panel.setPreferredSize(new Dimension(getWidth(), getHeight()));
		// �⺻ ������Ʈ ����. HudDisplay�� ���� �⺻���� ���÷��� ������Ұ� ��
		panel.add(display.create());
		//System.out.println("disply.height = " + display.getHeight());
		labelPanel = new LabelPanel();
		// �гο� ���̺��� ����.
		panel.add(labelPanel.createPanel(getWidth(), getHeight()));
		// ���÷��̸��� ������ ������ ȭ�鿡 ����.
		return panel;
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		//���⿡ ���̴°� ����
		display.show();
		labelPanel.updateText("Speed: 50");
	}

}
