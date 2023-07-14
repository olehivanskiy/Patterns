package main.java.behavioral.observable.listeners;

import java.io.File;

public interface EventListener {
    void update(String eventType, File file);
}
