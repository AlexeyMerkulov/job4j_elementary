package ru.job4j.ex;

import ru.job4j.tracker.Item;
import java.util.Arrays;

public class TrackerSingletonThird {
    private static final TrackerSingletonThird INSTANCE = new TrackerSingletonThird();

    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    private TrackerSingletonThird() {
    };

    public static TrackerSingletonThird getInstance() {
        return INSTANCE;
    }

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
        Item[] requiredName = new Item[size];
        int length = 0;
        for (int index = 0; index < size; index ++) {
            Item item = items[index];
            if (key.equals(item.getName())) {
                requiredName[length] = item;
                length++;
            }
        }
        return Arrays.copyOf(requiredName, length);
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
            item.setId(id);
            items[index] = item;
        }
        return rsl;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
            System.arraycopy(items, index + 1, items, index, size - index - 1);
            items[size - 1] = null;
            size--;
        }
        return rsl;
    }
}
