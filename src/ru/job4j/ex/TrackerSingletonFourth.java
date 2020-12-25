package ru.job4j.ex;

import ru.job4j.tracker.Tracker;

public class TrackerSingletonFourth {
    private Tracker tracker = new Tracker();

    private TrackerSingletonFourth() {
    };

    public static TrackerSingletonFourth getInstance() {
        return Holder.INSTANCE;
    }

    public Tracker getTracker() {
        return tracker;
    }

    private static final class Holder {
        private static final TrackerSingletonFourth INSTANCE = new TrackerSingletonFourth();
    }
}
