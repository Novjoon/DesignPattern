package Answer3;

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
        // �쟾泥� �솕硫댁쓽 堉덈�瑜� 援ъ꽦�븿 (�쐢�룄�슦 ���쓣 留뚮뱾�뼱以�)
        frame = new JFrame(title);
        // �솕硫� �겕湲� 吏��젙 (�쐢�룄�슦 �솕硫댁쓽 �꼫鍮꾩� �넂�씠�뒗 留ㅺ컻 蹂��닔濡� �쟾�떖�맖)
        frame.setBounds(x, y, width, height);
        
        // createPanel() �븿�닔瑜� �샇異쒗빐�꽌 �뙆�씪�뿉�꽌 �씫�� �뵒�뒪�뵆�젅�씠 援ъ꽦 �슂�냼�뿉 �뵲�씪 �뵒�뒪�뵆�젅�씠瑜� 議고빀�븯怨�, �쟾泥� �뵒�뒪�뵆�젅�씠瑜� 援ъ꽦�븯�뒗 �뙣�꼸�쓣 �룎�젮 諛쏆쓬
        // �떎吏덉쟻�씤 �솕硫� 援ъ꽦�� createPanel()�븿�닔�뿉�꽌 �씪�뼱�궓
        JPanel panel = createPanel(width, height);
        
        // �쐢�룄�슦�뿉 �쟾泥� �뙣�꼸�쓣 遺숈엫        
        frame.getContentPane().add(panel);
        frame.pack();
        
        // �쐢�룄�슦瑜� �솕硫댁뿉 蹂댁씠寃� 留뚮벀
        frame.setVisible(true);
        return frame;
    }

    public void closeWindow() {
        frame.setVisible(false);
        frame.dispose();
    }

    public MainWindow(String title, ArrayList<String> list) {
        displayList = list;
        // 硫붿씤 �쐢�룄�슦�쓽 �겕湲곕뒗 二쇱뼱吏� �꼫鍮꾩� �넂�씠 * (�뵒�뒪�뵆�젅�씠 援ъ꽦 �슂�냼 + 1)      
        // �떎�젣 �솕硫� 援ъ꽦�� createWindow() �븿�닔�뿉�꽌 泥섎━�븿
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
        // �젣�씪 諛뷀깢�뿉 �넃�씪 �뙣�꼸 �깮�꽦
        JPanel panel = new JPanel();
        // �뙣�꼸�쓽 �젅�씠�븘�썐�� BoxLayout.Y_AXIS �삎�깭濡� 吏��젙. �뙣�꼸�뿉 �쐞�젽 �삉�뒗 �떎瑜� �뙣�꼸�쓣 異붽��븯硫�, �꽭濡쒖텞 諛⑺뼢�쑝濡� 異붽�(add)�븳 �닚�꽌��濡� �굹�뿴�맖
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        // �뙣�꼸�쓽 �쟾泥� �겕湲� 吏��젙        
        panel.setPreferredSize(new Dimension(width, height));

        // 湲곕낯 而댄룷�꼳�듃 �깮�꽦. HudDisplay�뒗 媛��옣 湲곕낯�쟻�씤 �뵒�뒪�뵆�젅�씠 援ъ꽦�슂�냼媛� �맖
        Display display = new HudDisplay(WIDTH, HEIGHT);
          for (String name : displayList) {
            if (name.equals("speed")) {
                // display 蹂��닔媛� 李몄“�븯�뒗 湲곗〈 �뵒�뵆�젅�씠�뿉 �냽�룄怨� �뵒�뒪�뵆�젅�씠瑜� �뜤 遺숈엫
                display = new SpeedometerDisplay(display, WIDTH, HEIGHT); 
            }
            else if (name.equals("time")) {
                // display 蹂��닔媛� 李몄“�븯�뒗 湲곗〈 �뵒�뵆�젅�씠�뿉 �떆怨� �뵒�뒪�뵆�젅�씠瑜� �뜤 遺숈엫
                display = new TimeDisplay(display, WIDTH, HEIGHT);
            }
            else if (name.equals("weather")) {
                // display 蹂��닔媛� 李몄“�븯�뒗 湲곗〈 �뵒�뵆�젅�씠�뿉 �궇�뵪 �뵒�뒪�뵆�젅�씠瑜� �뜤 遺숈엫
                display = new WeatherDisplay(display, WIDTH, HEIGHT);
            }
        }
        // �옣�떇�씠 紐⑤몢 �걹�굹硫� 理쒖쥌 �뵒�뒪�뵆�젅�씠 �뙣�꼸�쓣 �깮�꽦�븯�룄濡� �븿. �옣�떇 �뙣�꼸�뱾�쓣 �룷�븿�븯�뒗 理쒖쥌 �뙣�꼸�씠 留뚮뱾�뼱吏�怨�, �씠寃껋쓣 �깉濡쒖슫 �뙣�꼸�뿉 遺�李� �떆�궡
        panel.add(display.create());
        
        // �넂�씠瑜� 異쒕젰
        System.out.println("disply.height = " + display.getHeight());
        
        // �뵒�뒪�뵆�젅�씠留덈떎 媛곴컖�쓽 �궡�슜�쓣 �솕硫댁뿉 蹂댁엫
        display.show();
        return panel;
    }

    public static void main(String[] args) {
        final String displayFileName = "displays.txt";
        ArrayList<String> list;
        LoadHudDisplays loadDisplay = new LoadHudDisplays(displayFileName);
        list = loadDisplay.load();
        for (String s : list) {
            System.out.println(s);
        }

        MainWindow mainWindow = new MainWindow(MainWindow.MAIN_TITLE, list);
    }
}
