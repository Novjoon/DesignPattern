package Homework_4_profess;

public abstract class AbstractObserverWindowFactory {
    public abstract ObserverWindow create(String type, String title, int x, int y, int width, int height);
}
