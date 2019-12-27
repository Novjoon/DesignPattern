package Homework3;

import javax.swing.*;
import java.awt.*;

public class HudDisplay extends Display {
    JPanel panel;
    LabelPanel labelPanel;

    HudDisplay(int width, int height) {
        super(width, height);
    }

    @Override
    public JPanel create() {
        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setPreferredSize(new Dimension(getWidth(), getHeight()));
        labelPanel = new LabelPanel();
        panel.add(labelPanel.createPanel(getWidth(), getHeight()));
        return panel;
    }

    @Override
    public void show() {
        labelPanel.updateText("Hud Display");
    }
}
