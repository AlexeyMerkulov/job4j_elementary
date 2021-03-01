package ru.job4j.objects;

public class Builder extends Engineer {
    public Building build(Tools tools, Materials materials) {
        return new Building();
    }
}
