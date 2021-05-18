package main.java.observable;

import main.java.observable.editor.Editor;
import main.java.observable.listeners.EmailNotificationListener;
import main.java.observable.listeners.LogOpenListener;

public class ObservableTest {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("/home/oleh/ob.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("olehfromukraine@gmail.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
