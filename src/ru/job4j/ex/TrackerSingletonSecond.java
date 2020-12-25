package ru.job4j.ex;

import ru.job4j.tracker.Tracker;

public class TrackerSingletonSecond {
    private static TrackerSingletonSecond instance;

    private Tracker tracker = new Tracker();

    private TrackerSingletonSecond() {
    };
    
    public static TrackerSingletonSecond getInstance() {
        if (instance == null) {
            instance = new TrackerSingletonSecond();
        }
        return instance;
    }

    public Tracker getTracker() {
        return tracker;
    }
}
