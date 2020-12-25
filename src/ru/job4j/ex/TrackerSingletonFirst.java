package ru.job4j.ex;

import ru.job4j.tracker.Tracker;

public enum TrackerSingletonFirst {
    INSTANCE;
    private Tracker tracker = new Tracker();

    public Tracker getTracker() {
        return tracker;
    }
}
