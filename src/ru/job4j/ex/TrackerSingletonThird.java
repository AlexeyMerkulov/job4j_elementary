package ru.job4j.ex;

import ru.job4j.tracker.Tracker;

public class TrackerSingletonThird {
    private static final TrackerSingletonThird INSTANCE = new TrackerSingletonThird();

    private Tracker tracker = new Tracker();

    private TrackerSingletonThird() {
    };

    public static TrackerSingletonThird getInstance() {
        return INSTANCE;
    }
    public Tracker getTracker() {
        return tracker;
    }


}
