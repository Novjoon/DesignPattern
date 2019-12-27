package Homework_4_profess;
import javax.swing.*;

public class TextFieldObserverButtonCommand extends ObserverCommandButton implements Command_e{
    public TextFieldObserverButtonCommand(String text, String text2, Subject primeThread, ObserverWindow window) {
        super(text, text2, primeThread, window);
    }
}
